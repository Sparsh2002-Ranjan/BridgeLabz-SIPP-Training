import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=num1+num2;
        int diff=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + num1 +" and "+ num2 +" is "+ sum+", "+ diff +", " + mul +", and "+ div);
        
    }
}
