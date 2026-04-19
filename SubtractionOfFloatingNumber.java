import java.util.Scanner;

public class SubtractionOfFloatingNumber {
    public static void main(String[] args) {
        System.out.println("Floating Numbers :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        float a =sc.nextFloat();
        System.out.println("Enter Second your number: ");
        float b=sc.nextFloat();
        System.out.println("Total of floating point numbers is : ");
        float sub=a-b;
        System.out.println(sub);

    }
}
