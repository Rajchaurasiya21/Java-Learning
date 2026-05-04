import java.util.Scanner;

public class LoopsQ2 {
    // Take input from user and print
    static void main() {
        System.out.println("Loops Q2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
