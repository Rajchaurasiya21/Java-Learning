import java.util.Scanner;
public class Q1 {
}

void main() {
    System.out.println("If Else Q1"+"\n");
    // take positive integer tell it is odd or even.
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Any number:");
    int a = sc.nextInt();
    if (a % 2 == 0) {
        System.out.println("It is clearly Even");
    } else {
        System.out.println("It is Clearly Odd");

    }
}