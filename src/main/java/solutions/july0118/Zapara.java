package solutions.july0118;

import sun.reflect.generics.tree.Tree;

import java.io.*;
import java.util.*;

public class Zapara {
    public static void main(String[] args) throws IOException {
        File f = new File("rez.txt");
        BufferedReader bf = new BufferedReader(new FileReader(f));
        ArrayList<Integer> integers = new ArrayList<>();

        String s = bf.readLine();
        while (s != null) {
           integers.add(Integer.parseInt(s));
           s = bf.readLine();
        }
        System.out.println("Массив цифр: " + integers);
        int sumAr = 0;
        for (Integer i:integers) {
            sumAr +=i;
        }
        System.out.println("Сумма цифр в массиве: " + sumAr);

        Set<Integer> numb = new TreeSet<>(integers);
        System.out.println("Массив уникальных цифр: " + numb);
        int size = numb.size();
        System.out.println(size);

        Iterator<Integer> it = numb.iterator();
        int sumNum = 0;
        while (it.hasNext()) {
            sumNum +=it.next();
        }
        System.out.println("Сумма уникальных цифр: " + sumNum);

        BufferedWriter w1 = new BufferedWriter(new FileWriter("sortedUp.txt"));
        BufferedWriter w2 = new BufferedWriter(new FileWriter("sortedDown.txt"));

        writeFile(numb,w1);

        ArrayList<Integer> list = new ArrayList<>(numb);
        list.sort((o1, o2) -> o2-o1);

        writeFile(list,w2);

        w1.newLine();
        w2.newLine();

        writeFile(numb,w1);

        TreeSet<Integer> numb_reverse = new TreeSet<>((o1, o2) -> o2-o1);
        numb_reverse.addAll(numb);

        writeFile(numb_reverse,w2);
        w1.close();
        w2.close();
    }

    public static void writeFile(Collection<Integer> numb, BufferedWriter w) throws IOException {
        //BufferedWriter sum = new BufferedWriter(new FileWriter(name));
        for (Integer n:numb){
            String p = n.toString();
            w.write(p);
            w.write("\n");
        }
        //sum.close();
    }
}
