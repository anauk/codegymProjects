package solutions.lesson240618;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Consumer;

import static com.sun.deploy.trace.Trace.print;

public class RandomNum {
    public static void main(String[] args) throws IOException {
        int n = 100;
        int maxVal = 1000;
        SortedSet<Integer> integers = new TreeSet<>();
        Random r = new Random();
        int size = integers.size();
        while (size < n){
            integers.add(r.nextInt(maxVal));
            size = integers.size();
        }
        System.out.println(integers.toString());
        System.out.println(integers.size());
        File e = new File("src/main/java/solutions/lesson240618","rand.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(e));
        /*while (integers.size()>0) {
            String item = integers.toString();
            bw.write(item + " ");
        }*/
        String item = integers.toString();
        bw.write(item + " ");
        /*for (Integer integer : integers) {
            print(integer + " ");
        }*/
        bw.close();
        /*ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            list.add((int)(Math.random()*1000));
        }
        System.out.println(list +"список");
        System.out.println(list.size());
        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.println(set + "множество");
        File e = new File("src/main/java/solutions/lesson240618","end1.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(e));
        set.forEach(integer -> System.out.print(integer +" "));
        bw.close();*/
    }
}
 /* Random random = new Random();
        TreeSet<Integer> integerTs = new TreeSet<Integer>();
        for (int i = 0; i <1000 ; i++) {
             integerTs.add(random.nextInt(100));
        }
        System.out.print(integerTs.size());*/

        /*HashSet<Integer> intset = new HashSet<>();
        int counter = 0;
        while(counter<100) {
            double random = Math.random()*a;
            if (intset.add((int)random)){
                counter++;
            }
            System.out.println(intset.size());
        }*/