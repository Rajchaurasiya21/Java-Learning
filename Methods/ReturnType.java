import java.util.*;
public class ReturnType {
   static boolean index(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1st Number:");
       int a=sc.nextInt();
       System.out.println("Enter 2nd Number:");
       int b= sc.nextInt();
       System.out.println("Sum:");
       System.out.print(a+b);

       return true;
   }
    static void main(){
        System.out.println(": Added Successfully??"+index());
    }
}
