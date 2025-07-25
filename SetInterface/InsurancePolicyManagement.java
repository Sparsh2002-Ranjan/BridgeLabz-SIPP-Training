import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyholderName, String expiryDate, String coverageType, double premiumAmount) throws ParseException {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = new SimpleDateFormat("dd-MM-yyyy").parse(expiryDate);
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyholderName() { return policyholderName; }
    public Date getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }
    public double getPremiumAmount() { return premiumAmount; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyNumber, policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return String.format("Policy[%s, %s, %s, %s, %.2f]",
                policyNumber, policyholderName,
                new SimpleDateFormat("dd-MM-yyyy").format(expiryDate),
                coverageType, premiumAmount);
    }
}

public class InsurancePolicyManagement {
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void displayAllUniquePolicies() {
        System.out.println("HashSet (Quick Lookup): " + hashSet);
        System.out.println("LinkedHashSet (Insertion Order): " + linkedHashSet);
        System.out.println("TreeSet (Sorted by Expiry Date): " + treeSet);
    }

    public void displayPoliciesExpiringSoon() {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date next30 = cal.getTime();

        System.out.println("Policies expiring within 30 days:");
        for (Policy p : treeSet) {
            if (!p.getExpiryDate().before(now) && p.getExpiryDate().before(next30)) {
                System.out.println(p);
            }
        }
    }

    public void displayPoliciesByCoverage(String coverageType) {
        System.out.println("Policies with coverage type: " + coverageType);
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(p);
            }
        }
    }

    public void findDuplicatePolicies(List<Policy> policies) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (Policy p : policies) {
            if (!seen.add(p.getPolicyNumber())) {
                duplicates.add(p.getPolicyNumber());
            }
        }
        System.out.println("Duplicate Policies by Policy Number: " + duplicates);
    }

    public void comparePerformance() throws ParseException {
        int n = 10000;
        List<Policy> testData = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            testData.add(new Policy("P" + i, "Holder" + i, "25-12-2025", "Health", 1000 + i));
        }

        long start, end;

        start = System.nanoTime();
        Set<Policy> hs = new HashSet<>(testData);
        end = System.nanoTime();
        System.out.println("HashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        Set<Policy> lhs = new LinkedHashSet<>(testData);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        Set<Policy> ts = new TreeSet<>(testData);
        end = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end - start) + " ns");
    }

    public static void main(String[] args) throws ParseException {
        InsurancePolicyManagement ipm = new InsurancePolicyManagement();

        // Adding example policies
        ipm.addPolicy(new Policy("P101", "John Doe", "15-08-2025", "Health", 1200));
        ipm.addPolicy(new Policy("P102", "Alice Smith", "20-07-2025", "Auto", 1500));
        ipm.addPolicy(new Policy("P103", "Bob Johnson", "05-08-2025", "Home", 2000));

        ipm.displayAllUniquePolicies();
        ipm.displayPoliciesExpiringSoon();
        ipm.displayPoliciesByCoverage("Health");

        // Performance comparison
        ipm.comparePerformance();
    }
}
