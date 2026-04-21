public class IncrementAndDecrementOps {
    public static void main(String[]args){

        System.out.println("INC & DEC");
//        int a= 6;
//        int b= a++;  Output is 6 why? Because a++ give old value update later,++a update first then give
//        System.out.println(b);


//       int a =5;
//       int b= ++a; Output is 7 why? in 3 steps , first a become 6 & ++a become 7 because  pre inc in print statement
//       System.out.println(++a)

//        int a =5;
//        int b= a++;
//        System.out.println(a++);  // increase one
//        System.out.println(a++);
//
        //a++ = Post increment
        // ++a= Pre increment

        /* A question if y = 7 and x increasing in pre ways and getting multiplied by 8 then find the exact answer?
        (ans-64) */

//        int y=7;
//        int x=++y*8;
//        System.out.println(x); got 64 logic- 7 becomes  8 and 8*8=64

        int i=5;
        int j=--i;
        System.out.println(i);
        System.out.println(--j);



    }
}
