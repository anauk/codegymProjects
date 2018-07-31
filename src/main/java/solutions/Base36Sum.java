package solutions;

import java.util.Scanner;

public class Base36Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner("9\n" +
                "1");
        String A = in.nextLine();
        String B = in.nextLine();
        System.out.print(sum(A,B));

    }
    private static StringBuffer sum(String numberOne, String numberTwo ) {
        StringBuffer sumValue = new StringBuffer("");
        int upp = 0;
        int differ;
        StringBuffer strBufferOne = new StringBuffer(numberOne);
        StringBuffer strBufferTwo = new StringBuffer(numberTwo);

        if (strBufferOne.length() <= strBufferTwo.length()) {
            differ = strBufferTwo.length() - strBufferOne.length();
            for (int i = 0; i < differ; i++) {
                strBufferOne.insert(0, "0");
               // System.out.println(strBufferOne);
            }
        } else if (strBufferOne.length() > strBufferTwo.length()) {
            differ = strBufferOne.length() - strBufferTwo.length();
            for (int i = 0; i < differ; i++) {
                strBufferTwo.insert(0, "0");
                System.out.println(strBufferTwo);
            }
        }

        for (int i = strBufferOne.length()-1; i >=0; i--) {
            int item = toNumber(strBufferOne.charAt(i)) + toNumber(strBufferTwo.charAt(i));
            sumValue.insert(0,toDigit((item+upp)%36));
            upp = (item+upp)/36;
        }

        if (upp > 0) {
            sumValue.insert(0,toDigit(upp));
        }

        return sumValue;
    }


    private static int toNumber(char symbol) {
        return symbol <= '9' ? symbol- 48 : symbol - 'a' + 10;
    }

    private static char toDigit(int index) {
        return index < 10 ? (char) (index + '0') : (char) (index + 'a' - 10);
    }
}
