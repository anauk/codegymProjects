package solutions.lesson240618;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.Consumer;

public class Example1 {
    public static void main(String[] args) throws IOException {
        File f;
        f = new File("src/main/java/solutions", "strings.txt");
        BufferedReader bf = new BufferedReader(new FileReader(f));
        System.out.println(f.exists());
        ArrayList<String> str = new ArrayList<>();
        String s = bf.readLine();
        while (s != null) {
            str.add(s);
            s = bf.readLine();
        }
        str.sort((o1, o2) ->o2.length()-o1.length());

        str.forEach(new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }
        });
        File strSort = new File("src/main/java/solutions", "stringSort.txt");

    }
}
