import java.util.Scanner;

public class CheckingBiggestNumber {
    public static void main(String[]args){
        System.out.println("Checking Biggest Number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Pick Number for A");
        int a=sc.nextInt();
        System.out.println("Pick Number for B");
        int b=sc.nextInt();
        System.out.println("Pick number for C");
        int c=sc.nextInt();

        if
        (a>=b && a>=c){
            System.out.println("A is Greatest");
        }
        else if
            (b>=a&&b>=c){
            System.out.println("B is Greatest");
        }
         else {
            System.out.println("C is Greatest");

        }
        }
    }

