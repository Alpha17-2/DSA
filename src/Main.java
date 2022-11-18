import LinkedList.BasicOperationsOnLinkedList;

public class Main {
    public static void main(String[] args) {
        BasicOperationsOnLinkedList basicOperations = new BasicOperationsOnLinkedList(null);
        basicOperations.insertNodeAtEnd();
        basicOperations.displayNodes();
        basicOperations.reverseList();
        System.out.println("After reversal");
        basicOperations.displayNodes();

    }

}