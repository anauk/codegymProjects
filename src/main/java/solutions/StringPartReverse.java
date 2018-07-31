package solutions;

import java.util.*;

public class StringPartReverse{
    public static void main(String[] args) {
        Scanner in = new Scanner("2 4 abcdefg");
        int i = in.nextInt();
        int j = in.nextInt();
        char[] word = in.next().toCharArray();
        reverse(word, i, j);
        System.out.println(word);
    }
    /*public static void reverse(char[] word, int i, int j) {
        while(i<j) {
            char tep = word[i];
            word[i] = word[j];
            word[j] = tep;
            i++;
            j--;
        }
    }*/
    public static void reverse(char[] word, int i, int j) {
        char c;
        for (int k = 0; k <= (j-i)/2 ; k++) {
            int index1=i+k;
            int index2=j-k;
            c = word[index1];
            word[index1]=word[index2];
            word[index2]=c;

        }
    }

}