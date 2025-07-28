import java.util.*;

class ShoppingCart{

    private String itemName;
    private int quantity;
    private double pricePerUnit;

    public ShoppingCart(String itemName,int quantity,double pricePerUnit){
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getItemName(){
        return itemName;
    }

    public int getQuantity(){
        return quantity;
    } 

    public double getPricePerUnit(){
        return pricePerUnit;
    }

    @Override
    public String toString() {
        return "[Item Name: " +itemName + ", Quantity: " + quantity + ", pricePerUnit: " + pricePerUnit + "]";
    }
}

class Cart<T extends ShoppingCart> {
    private List<T> list = new ArrayList<>();
    private HashSet<T>set = new HashSet<>();
    private double totalCost = 0;

    public void addToCart(T item) {
        if(!set.contains(item)){
            list.add(item);
            set.add(item);
        }
    }

    public void removeFromCart(String ss){
        if(set.contains(ss)){
            int a=0;
            for(ShoppingCart sh : list){
                if(sh.getItemName().equals(ss)){
                    list.remove(a);
                    set.remove(ss);
                }else{
                    a++;
                }
            }
        }
    }

    public Double TotalPrice(){
        for(ShoppingCart sh : list){
            int z = sh.getQuantity();
            double y = sh.getPricePerUnit();
            totalCost= totalCost + (z*y) ;
        }
        return totalCost;
    }

}

class groceries extends ShoppingCart{

    public groceries(String itemName, int quantity, double pricePerUnit) {
        super(itemName, quantity, pricePerUnit);
    }

}

class electronics extends ShoppingCart{

    public electronics(String itemName, int quantity, double pricePerUnit) {
        super(itemName, quantity, pricePerUnit);
    }

}

class clothes extends ShoppingCart{

    public clothes(String itemName, int quantity, double pricePerUnit) {
        super(itemName, quantity, pricePerUnit);
    }

}

public class BillingSystemForSupermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart<ShoppingCart> cart = new Cart<>();
        boolean b = true;
        while(b){
            System.out.println("press 1 to add product");
            System.out.println("press 2 to remove product");
            System.out.println("press 3 to see the total amount");
            System.out.println("press 4 to exit");
            int n=sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    System.out.println("press 1 to add groceries");
                    System.out.println("press 2 to add electronics");
                    System.out.println("press 3 to add cloths");
                    int h=sc.nextInt();
                    System.out.println("Enter item name");
                    String itname=sc.next();
                    System.out.println("Enter item Quantity");
                    int quant=sc.nextInt();
                    System.out.println("Enter Price per item");
                    double ppi=sc.nextDouble();
                    switch (h) {
                        case 1:
                            cart.addToCart(new groceries(itname, quant, ppi));
                            break;
                    
                        case 2:
                            cart.addToCart(new electronics(itname, quant, ppi));
                            break;

                        case 3:
                            cart.addToCart(new clothes(itname, quant, ppi));
                            break;
                        
                        default:
                            System.out.println("Invalid Index");
                            break;
                    }
                    break;
            
                case 2:
                    System.out.println("Enter the product name");
                    String ss=sc.next();
                    cart.removeFromCart(ss);
                    break;

                case 3:
                    Double d=cart.TotalPrice();
                    System.out.println("your total amount right now is Rs. " + d);
                    break;
                
                case 4:
                    System.out.println("Your total Amout is Rs. "+cart.TotalPrice());
                    break;
                
                default:
                    System.out.println("Invalid Index");
                    break;
            }
        }
    }
}
