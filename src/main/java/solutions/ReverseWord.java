package solutions;

import java.sql.SQLOutput;
import java.util.*;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner in = new Scanner("Lorem ipsum dolor sit amet");
        String str = in.nextLine();

        reverseInMyString(str);
    }
     public static void reverseInMyString(String str) {
        String[] words = str.split(" ");
        String reversed = "";
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length()-1; j >=0 ; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reversed = reversed+ reverseWord + " ";
            }

            System.out.println(reversed);

    }

}
