import java.util.Scanner;
public class SwitchCase {
}
public static void main(){
    int age;
    System.out.println("Your age");
    Scanner sc= new Scanner(System.in);
    age=sc.nextInt();
    switch (age){
        case 18:
            System.out.println("You are eligible for Passport");
        break;
        case 15:
            System.out.println("You are not able to Apply");
        default:
            System.out.println("Thank You");
    }

}
