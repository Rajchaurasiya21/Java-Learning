import java.util.*;
public class LoopsQ8 {
    // print GP input by user ex:-1,2,4,8....n
    static void main() {
        System.out.println("Loops Q8");
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Choose a Limit");
        int n= sc.nextInt(); // by the user
        int a=1,r=2;
        for(int i=1;i<=n;i*=2){
            System.out.println(i);

        }

    }
}
