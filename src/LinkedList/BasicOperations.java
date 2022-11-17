package LinkedList;
import java.util.Scanner;

public class BasicOperations {

    //** Global variables **////
    static Scanner sc = new Scanner(System.in); // a global scanner class to perform input operations
    // Create a global node
    static Node headNode = null; // Global node pointing to the head of linked list

    public static void insertNodeAtEnd(){
        int data = sc.nextInt();
        Node traverseNode = headNode;
        if(headNode == null){
            // only once when the linked list is not initialised
             headNode = new Node(data,null);
        }
        else {
            while (traverseNode.next!=null){
                traverseNode = traverseNode.next;
            }
            traverseNode.next = new Node(data,null);
        }
    }

    public static void displayNodes(){
        Node traverseNode = headNode;
        while(traverseNode!=null){
            System.out.print(traverseNode.data+"->");
            traverseNode = traverseNode.next;
        }
        System.out.print("null");
    }

    public static void insertNodeAtBeginning(){
        System.out.println("Enter node at beginning");
        int data = sc.nextInt();
        headNode = new Node(data,headNode);
    }

    public static void main(String[] args) {
         //******  Insert 5 nodes at end of the node *****//
        System.out.println("Enter 5 nodes");
        for (int i = 0; i < 5; i++) {
            insertNodeAtEnd();
        }
        // *** Insert node at the beginning ***/////
        insertNodeAtBeginning();
        //***  Display nodes ****//
        displayNodes();
    }
}
