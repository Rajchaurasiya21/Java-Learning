import java.util.*;
public class PatternQ3 {
    static void main() {
        System.out.println("Pattern Q3");
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter how many rows");
        int rows= sc.nextInt();
        System.out.println("Enter how many colm");
        int colm=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=colm;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
