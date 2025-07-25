import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagementSystem {
    public static class Policy {
        private final String policyNumber;
        private final String policyholderName;
        private final LocalDate expiryDate;
        private final double premium;

        public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, double premium) {
            this.policyNumber = policyNumber;
            this.policyholderName = policyholderName;
            this.expiryDate = expiryDate;
            this.premium = premium;
        }

        public String getPolicyNumber() {
            return policyNumber;
        }

        public String getPolicyholderName() {
            return policyholderName;
        }

        public LocalDate getExpiryDate() {
            return expiryDate;
        }

        public double getPremium() {
            return premium;
        }

        public String toString() {
            return policyNumber + " (" + policyholderName + ", " + expiryDate + ")";
        }
    }

    private final Map<String, Policy> byNumber = new HashMap<>();
    private final Map<String, Policy> insertionOrder = new LinkedHashMap<>();
    private final NavigableMap<LocalDate, List<Policy>> byExpiry = new TreeMap<>();

    public void addPolicy(Policy p) {
        byNumber.put(p.getPolicyNumber(), p);
        insertionOrder.put(p.getPolicyNumber(), p);
        byExpiry.computeIfAbsent(p.getExpiryDate(), d -> new ArrayList<>()).add(p);
    }

    public Policy getByNumber(String number) {
        return byNumber.get(number);
    }

    public List<Policy> expiringWithinDays(int days) {
        LocalDate now = LocalDate.now();
        LocalDate end = now.plusDays(days);
        List<Policy> out = new ArrayList<>();
        for (Map.Entry<LocalDate, List<Policy>> e : byExpiry.subMap(now, true, end, true).entrySet()) {
            out.addAll(e.getValue());
        }
        return out;
    }

    public List<Policy> forPolicyholder(String name) {
        List<Policy> out = new ArrayList<>();
        for (Policy p : byNumber.values()) {
            if (p.getPolicyholderName().equalsIgnoreCase(name)) out.add(p);
        }
        return out;
    }

    public void removeExpired() {
        LocalDate now = LocalDate.now();
        NavigableMap<LocalDate, List<Policy>> expired = byExpiry.headMap(now, false);
        List<Policy> toRemove = new ArrayList<>();
        for (List<Policy> list : expired.values()) {
            toRemove.addAll(list);
        }
        for (Policy p : toRemove) {
            byNumber.remove(p.getPolicyNumber());
            insertionOrder.remove(p.getPolicyNumber());
        }
        byExpiry.headMap(now, false).clear();
    }

    public Collection<Policy> policiesInInsertionOrder() {
        return insertionOrder.values();
    }

    public static void main(String[] args) {
        InsurancePolicyManagementSystem sys = new InsurancePolicyManagementSystem();
        sys.addPolicy(new Policy("P1", "Ravi", LocalDate.now().plusDays(10), 1000));
        sys.addPolicy(new Policy("P2", "Anita", LocalDate.now().plusDays(40), 2000));
        sys.addPolicy(new Policy("P3", "Ravi", LocalDate.now().minusDays(1), 3000));
        System.out.println(sys.getByNumber("P1"));
        System.out.println(sys.expiringWithinDays(30));
        System.out.println(sys.forPolicyholder("Ravi"));
        sys.removeExpired();
        System.out.println(sys.policiesInInsertionOrder());
    }
}
