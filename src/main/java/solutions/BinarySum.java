package solutions;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BinarySum {
    public static void main2(String[] args) {
        Scanner in = new Scanner("101\n" +
                "11");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a);
        System.out.println(b);
        int c = a | b;
        System.out.println(c);
        int x = c ^ 1000;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(x);
        //int a1 = Integer.parseInt(a, 2);
        System.out.println(Integer.toBinaryString((a | b) & 1));
        //String b = in.next();
        //System.out.println(b);
        //System.out.println((a|b)&1);
        //int b1 = Integer.parseInt(b, 2);
        // int c = a1 + b1;
        //System.out.println(a1);
        //System.out.println(b1);
        //System.out.println(Integer.toBinaryString(c));


/*byte x = Byte.parseByte(a);
        byte x1 = Byte.parseByte(b);
        System.out.println(x);
        System.out.println(x1);
        System.out.println(x+x1);*/
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner("101\n" +
                "11");
        String A = in.next();
        String B = in.next();
        System.out.println(A);
        System.out.println(B);
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);

        int c = a + b;
        System.out.println(c);
        String c1 = A + B;
        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.parseInt(c1));
    }

    public static void main3(String[] args) {
        Scanner in = new Scanner("347");
        int num = in.nextInt();

        int sum = 0;
        for (int i = 0; i < 32; i++) {
            sum += (num >> i) & 1;

            System.out.print(((num >> i) & 1) + " ");
        }
        System.out.println(sum);

    }

    // This function adds two
    // binary strings and return
    // result as a third string
    static String addBinary(String a, String b) {
        // Initialize result
        String result = "";
        // Initialize digit sum
        int s = 0;
        // Travers both strings starting
        // from last characters
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1) {
            // Comput sum of last
            // digits and carry
            s += ((i >= 0) ? a.charAt(i) - '0' : 0);
            s += ((j >= 0) ? b.charAt(j) - '0' : 0);
            // If current digit sum is
            // 1 or 3, add 1 to result
            result = (char) (s % 2 + '0') + result;
            // Compute carry
            s /= 2;
            // Move to next digits
            i--;
            j--;
        }
        return result;
    }

    public static void main4(String[] args) {
        Scanner in = new Scanner("101\n" +
                "11");
        String a = in.next();
        String b = in.next();
        System.out.print(addBinary(a, b));
    }
    static String pad(String s, int numDigits){
        StringBuffer sb = new StringBuffer(s);
        int numZeros = numDigits - s.length();
        while(numZeros-- > 0) {
            sb.insert(0, "0");
        }
        return sb.toString();
    }
    public static void main5(String[] args) {
        String value = "1010";
        BigInteger bi = new BigInteger(value,2);
        // Arithmetic operations
        System.out.println("Output: " + bi.toString(2));
        bi = bi.add(bi); // 10 + 10
        System.out.println("Output: " + bi.toString(2));
        bi = bi.multiply(bi); // 20 * 20
        System.out.println("Output: " + bi.toString(2));

        /*
         * Padded to the next event number of bits
         */
        System.out.println("Padded Output: " + pad(bi.toString(2), bi.bitLength() + bi.bitLength() % 2));
    }
    public static void main6(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
    }

    public static void main7(String[] args) {
        int n = 12, n1 = 25, result, res;
        result = n|n1;
        System.out.println(result);
        res = n&n1;
        System.out.println(res);
        int b = 35;
        int r = ~b;
        System.out.println(r);
        int s = 42;//00101010
        int s1 = ~s;//-(00101010+1)=00101011=-43
        System.out.println(s1);
        int t= 12;
        int t1 = 25;
        System.out.println(t^t1);
    }

    public static void main8(String[] args) {
        int a = 212;
        System.out.println(a<<1);
        System.out.println(a<<0);
        System.out.println(a<<4);
        System.out.println(a>>1);
        System.out.println(a>>0);
        System.out.println(a>>8);
        int number1 = 5, number2 = -5;
        // Signed right shift
        System.out.println(number1 >> 1);
        // Unsigned right shift
        System.out.println(number1 >>> 1);
        // Signed right shift
        System.out.println(number2 >> 1);
        // Unsigned right shift
        System.out.println(number2 >>> 1);
    }

    public static void main_(String[] args) {
        Scanner in = new Scanner("101\n" +
                "11");
        String a = in.next();
        String b = in.next();
        System.out.println(a.length());
        BigInteger A = new BigInteger(a,2);
        BigInteger B = new BigInteger(b,2);
        System.out.println(A);
        System.out.println(B);
        BigInteger c;
        c = A.add(B);
        System.out.println(c.toString(2));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner("101\n" +
                "11");
       String a = in.next();
        String b = in.next();
        int l = Integer.parseInt(a, 2);
        int l1 = Integer.parseInt(b, 2);
        int c = l+l1;
        System.out.println(l);
        System.out.println(Integer.toBinaryString(c));


    }
}
