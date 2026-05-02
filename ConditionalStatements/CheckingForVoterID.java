import java.util.Scanner;
public class CheckingForVoterID {
    public static void main(String[] args) {
        System.out.println("Conditional operators");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Age Sir!!!");
        int age=sc.nextInt();
        if (age >= 18){

            System.out.println("You are eligible for apply a VoterID card");}
            else {
                System.out.println("you are not eligible for apply a VoterID card");
            }

        }


    }
