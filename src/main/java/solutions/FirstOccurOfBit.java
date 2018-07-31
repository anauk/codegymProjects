package solutions;


import java.util.Scanner;

public class FirstOccurOfBit {
    public static void main(String[] args) {
        Scanner in = new Scanner("32");
        int n = in.nextInt();
        int pos = 0;
        for (int i = 0; i < 32; i++){
            if(((n>>i)&1) == 1) {
                pos += i + 1;
                break;
            }
        }
        System.out.println(pos);
    }
}
