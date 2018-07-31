package collections;
import java.util.HashSet;

public class SetSample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("orange");
        set.add("rasberry");
        set.add("strawberry");

        for (String s: set) {
            System.out.println(s);
        }

        System.out.println(set);

    }
}
