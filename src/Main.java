import LinkedList.BasicOperations;
import LinkedList.Node;

public class Main {
    public static void main(String[] args) {
        BasicOperations basicOperations = new BasicOperations(null);
        basicOperations.insertNodeAtEnd();
        basicOperations.displayNodes();
        basicOperations.deleteNthNode();
        basicOperations.displayNodes();
    }

}