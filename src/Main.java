import Graph.BasicOperationsOnGraph;
import Graph.GraphNode;
import LinkedList.BasicOperationsOnLinkedList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        BasicOperationsOnLinkedList basicOperationsOnLinkedList = new BasicOperationsOnLinkedList(null);
        BasicOperationsOnGraph basicOperationsOnGraph = new BasicOperationsOnGraph(new GraphNode(new HashMap<>()));
        basicOperationsOnGraph.addVertices();
        basicOperationsOnGraph.displayGraph();
        basicOperationsOnGraph.traverseBfs();
    }
}