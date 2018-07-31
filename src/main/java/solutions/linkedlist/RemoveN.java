package solutions.linkedlist;
import java.util.Scanner;

public class RemoveN {
        static class Node {
            int val;
            Node next;
            public Node(int val) {
                this.val = val;
            }
        }
        private static void printList(Node head) {
            while (head != null) {
                System.out.println(head.val + " ");
                head = head.next;
            }
        }
        public static Node readList(Scanner in) {
            int N = in.nextInt();
            Node head = new Node(N);
            Node node = head;
            for (int i = 0; i < N; i++) {
                node.next = new Node(in.nextInt());
                node = node.next;
            }
            return head.next;
        }
    public static void main1(String[] args) {
        Scanner in = new Scanner("1 2 3");
        printList(readList(in));

    }
    public static void removeNext(Node head) {
        Node tmp = head.next;
        head.next = head.next.next;
    }
}
