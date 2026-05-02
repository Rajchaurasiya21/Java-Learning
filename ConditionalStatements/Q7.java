public class Q7 {
}
// Check number is divisible by 2 and 6.
void main() {
    System.out.println("If Else Q7");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number:");
    int a = sc.nextInt();
    if (a % 2 == 0 || a % 6 == 0) {
        System.out.println("It is Divisible by 2 and 6");
    } else {
        System.out.println("It is not Divisible by 2 and 6 ");
    }
}