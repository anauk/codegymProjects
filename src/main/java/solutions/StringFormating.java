package solutions;

import java.util.Scanner;

public class StringFormating {
    public static void main(String[] args) {
        Scanner in = new Scanner("Donec pharetra,arcu id eleifend .");
        String s = in.nextLine();
       System.out.println(s.replace(" ", ""));

    }
}
