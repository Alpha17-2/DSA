package Graph;
import java.util.*;

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
            if (graphNode.graph.containsKey(b)){
                graphNode.graph.get(b).add(a);
            }
            else {
                Set<Integer> vertices = new HashSet<>();
                vertices.add(a);
                graphNode.graph.put(b,vertices);
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

    public void displayBFS(Map<Integer,Boolean> visited,int currentNode){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(currentNode);
        while (!queue.isEmpty()){
            int front = queue.poll();
            if (!visited.get(front)){
                visited.put(front,true);
                System.out.print(front+" ");
                if (graphNode.graph.containsKey(front)){
                    queue.addAll(graphNode.graph.get(front));
                }
            }
        }
    }

    public void traverseBfs(){
        Map<Integer,Boolean> visited = new HashMap<>();

        for (int node : graphNode.graph.keySet()){
            visited.put(node,false);
        }
        for (int node:graphNode.graph.keySet()){
            if (!visited.get(node)){
                displayBFS(visited,node);
            }
        }
    }
}
