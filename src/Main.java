import LinkedList.BasicOperations;
import LinkedList.Node;

public class Main {
    public static void main(String[] args) {
        BasicOperations basicOperations = new BasicOperations(null);
        basicOperations.insertNodeAtEnd();
        basicOperations.insertNodeAtBeginning();
        basicOperations.displayNodes();
        basicOperations.deleteNodeFromStart();
        basicOperations.displayNodes();
    }
}