package solutions.linkedlist;
import java.util.*;
public class Reverse {
        public static class Node {
            Node next = null;
            int val;

            public Node(int val) {
                this.val = val;
            }
        }
        public static Node reverse(Node head){
            Node prev = null;
            Node current = head;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
            return head;
        }
        public static void main(String[] args) throws Exception {
            Scanner in = new Scanner("4\n" +
                    "1 5 6 7");
            printList(reverse(readList(in)));
        }
        public static Node readList(Scanner in) {
            int N = in.nextInt();
            Node head = new Node(-1);
            Node node = head;

            for (int i = 0; i < N; i++) {
                node.next = new Node(in.nextInt());
                node = node.next;
            }

            return head.next;
        }

        public static void printList(Node head) {
            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
        }
}
