package solutions;

import java.util.*;

public class CountOfWord {
    public static void main(String[] args) {
        Scanner in = new Scanner("Lorem ipsum dolor sit amet");
        String line = in.nextLine();
        System.out.println(solve(line));
    }
    public static int solve(String str){
        int count = 0;
        boolean countOn = true;
        for (int i = 0; i < str.length(); i++) {
            if (countOn&&str.charAt(i) != ' '){
                count++;
            }
            countOn = str.charAt(i) == ' ';
        }
        return count;
    }

}
