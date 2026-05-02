import java.util.Scanner;
public class Q2 {
}
// Q2. check it is Divisible by 5 or not?
void main() {
    System.out.println("If Else Q2"+"\n");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Number ");
    int a= sc.nextInt();
    if (a%5==0){
        System.out.println("Divisible by 5");}
        else{
        System.out.println("Not Divisible by 5");
    }
}