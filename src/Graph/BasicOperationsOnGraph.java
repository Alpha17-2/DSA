package Graph;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BasicOperationsOnGraph {
    GraphNode graphNode;
    Scanner sc = new Scanner(System.in);

    public BasicOperationsOnGraph(GraphNode graphNode) {
        this.graphNode = graphNode;
    }

    public void addVertices(){
        System.out.println("Enter number of nodes");
        // Assuming undirected graph
        int n = sc.nextInt();
        while (n-->0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            if (graphNode.graph.containsKey(a)){
                graphNode.graph.get(a).add(b);
            }
            else {
                Set<Integer> vertices = new HashSet<>();
                vertices.add(b);
                graphNode.graph.put(a,vertices);
            }
        }
    }

    public void displayGraph(){
        for (int node : graphNode.graph.keySet()){
            System.out.print(node+" -> ");
            for (int vertices : graphNode.graph.get(node)){
                System.out.print(vertices+" ");
            }
            System.out.println();
        }
    }
}
