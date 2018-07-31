package solutions;

import java.util.*;

public class InsertString {
    public static void main(String[] args) {
        Scanner in = new Scanner("3\n"+
                "AbcQwert\n" +
                "123");
        int pos = in.nextInt();
        String str = in.next();
        String str1 = in.next();

        StringBuilder s = new StringBuilder(str);
        s.insert(pos, str1);
        System.out.println(s.toString());


    }
}
