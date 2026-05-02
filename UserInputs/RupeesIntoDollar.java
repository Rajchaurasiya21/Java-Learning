import java.util.Scanner;
public class RupeesIntoDollar {}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Your Value in ₹:");
    double rupees = sc.nextDouble();
    double dollar = rupees+93.01;
    System.out.println("Value in $:"+dollar);
}
