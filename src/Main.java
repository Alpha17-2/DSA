import LinkedList.BasicOperationsOnLinkedList;
import Tree.BasicOperationsOnTree;

public class Main {

    public static void main(String[] args) {
        BasicOperationsOnLinkedList basicOperationsOnLinkedList = new BasicOperationsOnLinkedList(null);
        basicOperationsOnLinkedList.insertNodeAtEnd();
        basicOperationsOnLinkedList.removeNodesWithValue(6);
        basicOperationsOnLinkedList.displayNodes();

    }
}