package solutions;

import java.util.*;

public class Char {
    public static void main(String[] args) {
        Scanner in = new Scanner("bacaabacab");
        String line = in.next();
        System.out.println(number(line));
        }
    public static int number(String str){
        int count = 0;
          for (int i = 0; i < str.length(); i++) {
              if (str.charAt(i) != 'a') {
                  count++;
              }
          }
        return count;
    }
}
