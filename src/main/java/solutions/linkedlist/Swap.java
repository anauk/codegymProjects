package solutions.linkedlist;
import java.util.*;
public class Swap {
        public static class Node {
            Node next = null;
            int value;
            public Node (int val) {
                value = val;
            }
        }
        public static Node swap(Node head){
            Node temp = head;
            while (temp != null && temp.next != null) {
    int k = temp.value;
    temp.value = temp.next.value;
    temp.next.value = k;
    temp = temp.next.next;
            }
            return head.next;
        }
        public static void main(String[] args) throws Exception {
            Scanner in = new Scanner("7\n" +
                    "1 5 7 3 5 8 2");
            int n = in.nextInt();
            Node root = new Node(-1);
            Node node = root;

            for (int i = 0; i < n; i++) {
                node.next = new Node(in.nextInt());
                node = node.next;
            }
            Node result = swap(root.next);
            while (result != null) {
                System.out.print(result.value + " ");
                result = result.next;
            }
        }
}
