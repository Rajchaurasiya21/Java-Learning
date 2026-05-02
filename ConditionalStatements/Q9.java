public class Q9 {
}

void main() {
    System.out.println("If Else Question 9");
     Scanner sc= new Scanner(System.in);
    System.out.println("Enter Length of Rectangular:");
    int l= sc.nextInt();
    System.out.println("Enter Breadth of Rectangular:");
    int b= sc.nextInt();
    int area= l*b;
    int perimeter = 2*(l+b);
    if( area>perimeter){
        System.out.println("Area is bigger than parameter");
    }if ( perimeter>area) {
        System.out.println("Parameter  is bigger than area");
    }
    if (perimeter == area){ // only use for rare case 4 and 4.
        System.out.println(" Both are same");


    }


}
