import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float num1=sc.nextInt();
        float num2=sc.nextInt();
        float sum=num1+num2;
        float diff=num1-num2;
        float mul=num1*num2;
        float div=num1/num2;
        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + num1 +" and "+ num2 +" is "+ sum+", "+ diff +", " + mul +", and "+ div);
        
    }
}
