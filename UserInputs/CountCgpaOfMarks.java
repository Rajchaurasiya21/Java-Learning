//A student wants to calculate his CGPA so,
//write a program to help him how he is going to count his cgpa.?
import java.util.Scanner;
public class CountCgpaOfMarks{}

    public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter subject 1 Marks:");
    int s1 = sc.nextInt();
    System.out.println("Enter subject 2 Marks:");
    int s2 = sc.nextInt();
    System.out.println("Enter subject 3 Marks:");
    int s3 = sc.nextInt();
    System.out.println("Enter subject 4 Marks:");
    int s4 = sc.nextInt();
    System.out.println("Enter subject 5 Marks:");
    int s5 = sc.nextInt();
    int total = s1 + s2 + s3 + s4 + s5;
    double percentage = total / 500.0 * 100;
    double cgpa = percentage / 9.5;

    System.out.println("Total Marks: " + total);
    System.out.print("Percentage of Marks:");
    System.out.println(percentage);
    System.out.printf("CGPA: %.2f", cgpa);


}
