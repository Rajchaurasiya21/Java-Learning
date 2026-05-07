public class Q2 {
    /* pass by value and pass by reference */
    static void change(int x) {
        x=15;

    }

    static void main() {
        int x=10;
        System.out.println(x);
        change(x);
        System.out.println(x);

    }
}
