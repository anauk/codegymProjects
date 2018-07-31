package solutions;

import java.util.*;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner("271206250");
        int number = in.nextInt();
        count(number);
    }
    public static void count(int number) {
        int sum = 0;
        int count = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            int rest = number / 10;
            count++;
            sum += lastDigit;
            number = rest;
        }
        System.out.printf("%2d%5d%n", count, sum);
    }


}



