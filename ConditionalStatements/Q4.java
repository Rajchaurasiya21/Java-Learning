import java.util.Scanner;
public class Q4 {
}
// take real number check it is integer or not
void main() {
    System.out.println("If Else q4");
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Your Number:");
    double a= sc.nextDouble();
    int b=(int)a;
    if(a-b==0) {
        System.out.println("Not an Integer");
    }

        else{
            System.out.println("Is an integer");
        }
    }

