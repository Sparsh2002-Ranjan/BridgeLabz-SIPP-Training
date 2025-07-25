import java.util.*;

record Patient(String name, int severity) {}

public class TriageSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String s = sc.next();  

            System.out.print("Severity: ");
            int z = sc.nextInt();  

            patients.add(new Patient(s, z)); 
        }

        PriorityQueue<Patient> pq =
                new PriorityQueue<>(Comparator.comparingInt(Patient::severity).reversed());
        pq.addAll(patients);

        System.out.println("Treatment order:");
        boolean first=false;
        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            if(first)System.out.print(", ");
            System.out.print(p.name());
            first=true;
        }
    }
}
