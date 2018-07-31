package solutions;

import java.util.Scanner;

public class CountOfBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int binaryNum[] = new int[32];
        int sum = 0;

        for (int i = 0; i < binaryNum.length-1; i++) {
            binaryNum[i] = (num>>i)&1;
        }
        for (int i = 0; i <binaryNum.length ; i++) {
            sum+=binaryNum[i];
        }
        System.out.println(sum);
    }
}
