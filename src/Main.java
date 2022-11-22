import LinkedList.BasicOperationsOnLinkedList;
import Tree.BasicOperationsOnTree;

public class Main {

    public static void main(String[] args) {
        BasicOperationsOnLinkedList basicOperationsOnLinkedList = new BasicOperationsOnLinkedList(null);
        basicOperationsOnLinkedList.insertNodeAtEnd();
        basicOperationsOnLinkedList.displayNodes();
        basicOperationsOnLinkedList.reverseFrom(4,5);
        basicOperationsOnLinkedList.displayNodes();
//        basicOperationsOnLinkedList.findMiddleNode();
    }
}