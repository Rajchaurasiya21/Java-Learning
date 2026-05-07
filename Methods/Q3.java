import java.util.*;
public class Q3 {
    // Swap 2 Numbers by pass by value and reference? it will be swap or not also check.
    static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b= sc.nextInt();
        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);





    }
}
