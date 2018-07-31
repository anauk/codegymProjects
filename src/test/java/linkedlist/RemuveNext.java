package linkedlist;
import java.util.*;
public class RemuveNext {
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("1 2 3");
        int N = in.nextInt();//в переменную(N-выдает количество элементов) получаем данные
        Node head = new Node(N);// создаем арей лист
        Node node = head;
        for (int i = 0; i < N; i++) {//через цикл заполняем лист данными
            node.next = new Node(in.nextInt());
            node = node.next;
        }

    }
}





