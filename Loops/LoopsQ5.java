import java.util.Scanner;
// printing AP Equation -2 from n , -2,1,4,7...n
public class LoopsQ5 {
    static void main() {
        System.out.println("Loops Q5");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n= sc.nextInt();
        for(int i=-2;i<=3*n-1;i+=3){
            System.out.println(i);
        }


    }
}
