public class UniversityDiscount{
    public static void main(String[] args) {
        int fee=125000;
        double discount=(fee*10)/100;
        double newfee=fee-discount;
        System.out.print("The discount amount is INR "+ discount +"and final discounted fee is INR" + newfee);
    }
}