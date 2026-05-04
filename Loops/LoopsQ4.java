import java.util.*;
public class LoopsQ4 {
    // print table  of n numbers.
    static void main() {
        System.out.println("Loops Q4");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number for Table");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
        }

    }

