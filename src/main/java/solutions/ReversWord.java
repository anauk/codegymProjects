package solutions;

import java.util.*;

import static jdk.nashorn.internal.objects.NativeArray.reverse;


public class ReversWord {
    public static void main1(String[] args) {
        Scanner in = new Scanner("Lorem ipsum dolor sit amet");
        String str = in.nextLine();
        System.out.println(str);
        String rev = reverseWord(str);
        System.out.println(rev);
    }

    public static String reverseWord(String str) {
        int len = str.length()-1;
        String r = "", temp = "";

        for (int i = 0; i <= len; i++) {
            temp += str.charAt(i);
            if ((str.charAt(i) == ' ') || (i == len)) {
                for (int j = temp.length()-1; j >= 0; j--) {
                    r += temp.charAt(j);
                    if ((j == 0) && (i != len)) {
                        r += "";
                    }

                }
                temp = "";
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("Lorem ipsum dolor sit amet");
        String s = in.nextLine();
        System.out.println(s);
        StringBuilder str = new StringBuilder(s);
        System.out.println(reverse(str));
    }

}

        /*char [] scr= str.toCharArray();
       for(int i=scr.length-1; i>=0;i--)
           System.out.print(scr[i]);*/

        /*StringBuffer strBuffer = new StringBuffer(str);
        strBuffer.reverse();
        System.out.println(strBuffer.toString());*/
