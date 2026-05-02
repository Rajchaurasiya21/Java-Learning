import java.util.Scanner;
public class Q6{
}
//Q6 Check it is 4 digit no. or not
void main() {
    System.out.println("Number Checking");
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Your Number:");
    int a= sc.nextInt();
    if (a>999 && a<10000) {
        System.out.println("it is four digit number");
    }

        else {
            System.out.println("It is not four digit number");
        }
    }

