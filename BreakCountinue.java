public class BreakCountinue {
    static void main() {
        System.out.println("Break And Countinue");
        int i=0;
        while(i<5){
            System.out.println(i);
            System.out.println("Java is Great");
            if(i==3){
                System.out.println("Ending the Loop");
                break;
            }
            i++;
        }
        System.out.println("Ending loops here");
    }
}
