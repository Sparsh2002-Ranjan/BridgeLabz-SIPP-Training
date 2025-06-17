public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10); 
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            int salary = employeeData[i][0];
            int serviceYears = employeeData[i][1];

            double bonus = (serviceYears > 5) ? salary * 0.05 : salary * 0.02;
            bonuses[i] = bonus;
            newSalaries[i] = salary + bonus;
            totalBonus += bonus;
        }

        // Display details
        System.out.printf("%-5s %-10s %-10s %-10s %-10s%n", "ID", "Salary", "Years", "Bonus", "New Salary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-5d %-10d %-10d %-10.2f %-10.2f%n",
                    i + 1,
                    employeeData[i][0],
                    employeeData[i][1],
                    bonuses[i],
                    newSalaries[i]);
        }

        System.out.printf("%nTotal Bonus Paid by Zara = ₹%.2f%n", totalBonus);
    }

    public static int[][] generateEmployeeData(int count) {
        int[][] data = new int[count][2];
        for (int i = 0; i < count; i++) {
            int salary = 10000 + (int) (Math.random() * 90000); 
            int years = 1 + (int) (Math.random() * 15);         
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }
}
