package solutions.linkedlist;
import java.util.*;
public class GetNode {
    static class LinkedNode {
        int val;
        LinkedNode next;
        public LinkedNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
         Scanner in = new Scanner("1 2 3 4 5" + "\n5");
            LinkedNode head = readList(in);
        System.out.println(get(head,in.nextInt()));
    }
    private static LinkedNode readList(Scanner in) {
        int N = in.nextInt();
        LinkedNode head = new LinkedNode(N);
        LinkedNode node = head;
        for (int i = 0; i < N; i++) {
            node.next = new LinkedNode(in.nextInt());
            node = node.next;
        }
        return head.next;
    }
    public static Integer get(LinkedNode head, int k) {
        //создаю переменую, чтобы узнать количество Нод
        int len = 0;
        //считаю Ноды
        while (head != null) {
            head = head.next;
            len++;
        }
            if (len < k)//если число нод меньше,чем номер нода что нужно удалить
                return null;//то возвращвем ноль

            for (int i = 1; i < len - k + 1; i++)
                head = head.next;
        return head.val;
    }
}


