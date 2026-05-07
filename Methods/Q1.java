import java.util.*;
public class Q1{
    // n and r by user , count nPr and nCr
    static int fact(int z){
        int f=1;
        for( int i=1;i<=z;i++){
            f *=i;
        }
        return f;

    }
    static void  main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("n");
        int n=sc.nextInt();
        System.out.println("r");
        int r=sc.nextInt();


        int ncr= fact(n)/(fact(r)*fact(n-r));
        int npr=fact(n)/fact(n-r);
        System.out.println(ncr+" \n"+npr);
    }
}