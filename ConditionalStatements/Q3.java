import java.util.Scanner;
public class Q3 {
    // Q3. checking absolute number n=n,-n=n
    static void main() {
        System.out.println(" If Else Q3");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int a= sc.nextInt();
        if (a>=0){ //  Second Method logic (n<0) n=-n
            System.out.println("No Changes");
            System.out.print(a);
        }
        else{
            System.out.println("Your negative int in positive");
            System.out.println(-a);
        }
    }
}
