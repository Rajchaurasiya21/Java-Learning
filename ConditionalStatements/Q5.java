import java.util.Scanner;

public class Q5 {
    // Selling Price and Cost price
    void main() {
        System.out.println("If Else Q5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Selling Price:");
        int cp= sc.nextInt();
        System.out.println("Cost Price:");
        int sp= sc.nextInt();
        if (cp>sp) {
            System.out.println("Profit");
        } if(sp>cp){
            System.out.println("Loss");
        }
        if (cp==sp){
            System.out.println("No Profit No Loss");
        }
        }

    }