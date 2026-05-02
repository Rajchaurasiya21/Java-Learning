import java.util.Scanner;
public class ConversionQuestions {
}
public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
    System.out.println("Kindly Enter Your Current Temperature (Celsius) ");
    double celsius= sc.nextDouble();
    double fahrenheit = (celsius *9/5)+32;
    System.out.println("Conversion Into Fahrenheit:"+fahrenheit);
}