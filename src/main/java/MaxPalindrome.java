

public class MaxPalindrome {
    final static int MIN = 10000;
    final static int MAX = 99999;

    public static void mainToOld(String[] args) {
        long max = 0;
        for (long i = MIN; i <= MAX; i++) {
            for (long j = i; j <= MAX; j++) {
                if (Simple.isSimple(i) && Simple.isSimple(j)) {
                    long mult = j * i;
                    if (Palindrome.isPalindrome(mult)) {
                        if (mult > max) {
                            max = mult;
                            System.out.println(max);
                        }
                    }
                }
            }
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        int[] simples;
        simples = Simple.getSimples(MIN,MAX);
        long max = 0;
        for (long i = 0; i <= simples.length; i++) {
            for (long j = i; j <= simples.length; j++) {
                long mult = j * i;
                if (Palindrome.isPalindrome(mult)) {
                    if (mult > max) {
                        max = mult;
                        System.out.println(max);
                    }
                }
            }
        }
    }
}