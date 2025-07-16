import java.util.*;

public class IceCreamRush {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] flavors = {
            "Vanilla", "Chocolate", "Strawberry", "Mint", 
            "Butterscotch", "Mango", "Coffee", "Blueberry"
        };
        
        int[] sales = new int[8];
        System.out.println("write the sold price of ice cream according to its flavors");
        for(int i=0;i<8;i++){
            System.out.println("for " + flavors[i]);
            sales[i]=sc.nextInt();
        }

        bubbleSort(flavors, sales);

        System.out.println("Flavors sorted by popularity:");
        for (int i = 0; i < flavors.length; i++) {
            System.out.println(flavors[i] + " - " + sales[i] + " sales");
        }
    }

    static void bubbleSort(String[] flavors, int[] sales) {
        int n = sales.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (sales[j] < sales[j + 1]) {
                    int tempSales = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = tempSales;

                    String tempFlavor = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = tempFlavor;
                }
            }
        }
    }
}
