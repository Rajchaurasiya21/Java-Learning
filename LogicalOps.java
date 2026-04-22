public class LogicalOps {
    public static void main(String[]args){
        boolean a= false;
        boolean b= true;
        if(a&&a){
            System.out.println("yes");

        }
        else if(a&&b){
            System.out.println("no");
        }
        else if(b&&a){
            System.out.println("no");
        }
        else{
            System.out.println("no");
        }
    }
}
