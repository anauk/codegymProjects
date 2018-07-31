package collections;
import java.util.*;
import java.util.Comparator;
import java.util.TreeSet;
/*
Разные способы создания компаратора в обратном порядке
 */
public class CompDemo {
    // компаратор для сравнения символьных строк в обратном порядке
    private static class myComp implements Comparator< String> {
        public int compare(String a, String b) {
            String aStr, bStr;
            aStr = a;
            bStr = b;
            // выполнить сравнение в обратном порядке
            return bStr.compareTo(aStr);
        }
    }
     public static void main1(String[] args) {
        //создать древовидное множество
        TreeSet<String> ts;
        ts = new TreeSet<String>(new myComp());
        //ввести элементы в древовидное множество
        ts.add("c");
        ts.add("a");
        ts.add("b");
        ts.add("e");
        ts.add("f");
        ts.add("d");
        // вывести элементы из дерева
        for (String element : ts) {
            System.out.print(element + " ");
        }
        System.out.println();

    }
//спрощеный вариант, компаратор в лямбде
    public static void main(String[] args) {
        TreeSet<String> st = new TreeSet<String>((aStr, bStr)-> bStr.compareTo(aStr));
        st.add("c");
        st.add("a");
        st.add("b");
        st.add("e");
        st.add("f");
        st.add("d");
        // вывести элементы из дерева
        for (String element : st) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

