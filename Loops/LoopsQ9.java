import java.util.*;
public class LoopsQ9 {
    static void main() {
        System.out.println("Loops Q9");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number:");
        int n= sc.nextInt();
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if (n % i == 0)
                flag=false;
            break;
            }
        if (n==1) System.out.println("Neither compo or prime");
        if ( flag==false) System.out.println("Composite Number");
        if( flag==true) System.out.println("Prime Number");
    }


}


