import java.util.*;
public class UseOFMethods {
     static void CallingFunction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Sum of Two number" + (a + b));
        System.out.print(a + b);
    }

        public static void main (String[]args){
            System.out.println("Void Basics:");
            CallingFunction();

        }
    }


