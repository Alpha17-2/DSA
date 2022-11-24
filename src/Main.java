import LinkedList.BasicOperationsOnLinkedList;
import Tree.BasicOperationsOnTree;

public class Main {

    public static void main(String[] args) {
        BasicOperationsOnLinkedList basicOperationsOnLinkedList = new BasicOperationsOnLinkedList(null);
        basicOperationsOnLinkedList.insertNodeAtEnd();
        basicOperationsOnLinkedList.rotateListByK(2);
        basicOperationsOnLinkedList.displayNodes();
//        basicOperationsOnLinkedList.findMiddleNode();
    }
}