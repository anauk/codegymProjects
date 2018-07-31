package linkedList;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Cari");
        a.add("Erica");
        System.out.println(a);
        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Dog");
        b.add("Franc");
        b.add("Gloria");
        b.add("Hill");
        System.out.println(b);
        ListIterator<String> at = a.listIterator();
        Iterator<String> bt = b.iterator();

        while (bt.hasNext()) {
            if (at.hasNext()) at.next();
            at.add(bt.next());
        }
        System.out.println(a);
        //удалить каждое второе слово из списка b
        bt = b.iterator();
        while (bt.hasNext()) {
            bt.next();
            if (bt.hasNext()) {
                bt.next();
                bt.remove();
            }
        }
        System.out.println(b);
        a.removeAll(b);
        System.out.println(a);

        List<String> st = new LinkedList<>();
        st.add("Amy");
        st.add("Bob");
        st.add("Carl");
        System.out.println("st: " + st);
        ListIterator<String> ir = st.listIterator();
        ir.next();
        ir.add("Loren");
        ir.add("mark");
        System.out.println("st+Loren: " + st);
        System.out.println(st.contains("mark"));


    }
}

