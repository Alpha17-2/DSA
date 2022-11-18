package LinkedList;
import java.util.Scanner;

public class BasicOperationsOnLinkedList {

    private Node headNode = null;
    private static final Scanner sc = new Scanner(System.in);
    public BasicOperationsOnLinkedList(Node headNode){
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

    public void displayNthNode(){
        System.out.println("Enter which node display");
        int n= sc.nextInt();
        Node traverseNode = headNode;
        for(int i=1;i<n && traverseNode!=null;traverseNode=traverseNode.next){
            ++i;
        }
        if (traverseNode!=null){
            System.out.println(traverseNode.data);
        }
        else{
            System.out.println("Invalid range");
        }
    }

    public void deleteNthNode(){
        System.out.println("Enter which node to delete");
        int n= sc.nextInt();
        // case 1: n = 1
        if(n==1){
            deleteNodeFromStart();
        }
        else{
            Node traverseNode = headNode;
            for(int i=1;i<n-1 && traverseNode!=null; traverseNode = traverseNode.next){
                i++;
            }
            // case 2: N lies in between or is at last
            if(traverseNode!=null){
                Node nodeToRemove = traverseNode.next;
                if(nodeToRemove!=null){
                    traverseNode.next = nodeToRemove.next;
                }
                else {
                    System.out.println("Invalid range");
                }
            }
            else{
                System.out.println("Invalid range");
            }
        }
    }

    public void reverseList(){
        Node reversed = null;
        Node traverseNode = headNode;
        while(traverseNode!=null){
            Node newNode = new Node(traverseNode.data, null);
            newNode.next = reversed;
            reversed = newNode;
            traverseNode = traverseNode.next;
        }
        headNode = reversed;
    }

}
