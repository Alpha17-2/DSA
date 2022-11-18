package LinkedList;
import java.util.Scanner;

public class BasicOperations {

    private Node headNode = null;
    private static final Scanner sc = new Scanner(System.in);
    public BasicOperations(Node headNode){
        this.headNode = headNode;
    }

    public Node getHeadNode() {
        return headNode;
    }

    public void insertNodeAtEnd() {
        System.out.println("How many nodes do you want to enter?");
        int n = sc.nextInt();
        System.out.println("Enter nodes :");
        for(int i=0;i<n;++i){
            int data = sc.nextInt();
            Node traverseNode = headNode;
            if (headNode == null) {
                // only once when the linked list is not initialised
                headNode = new Node(data, null);
            } else {
                while (traverseNode.next != null) {
                    traverseNode = traverseNode.next;
                }
                traverseNode.next = new Node(data, null);
            }
        }
    }

    public void displayNodes() {
        Node traverseNode = headNode;
        while (traverseNode != null) {
            System.out.print(traverseNode.data + "->");
            traverseNode = traverseNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void insertNodeAtBeginning() {
        System.out.println("Enter node at beginning");
        int data = sc.nextInt();
        headNode = new Node(data, headNode);
    }

    public void deleteNodeFromStart() {
        if (headNode == null || headNode.next == null) {
            headNode = null;
        } else {
            headNode = headNode.next;
        }
    }
}
