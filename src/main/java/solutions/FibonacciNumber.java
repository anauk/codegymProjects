package solutions;
import java.util.*;

public class FibonacciNumber {
        public static void main(String[] args) {
            Scanner in = new Scanner("8");
            System.out.println(fib(in.nextInt()));
        }
        public static int fib(int n) {
                if(n<2){
                    return n;
                } else {
                    return (fib(n-1)+fib(n-2));
                }
                /*if(n==0){
             return 0;
            } else if (n==1) {
             return 1;
            } else {
             return  fib(n-1)+fib(n-2);
            */
        }
}
