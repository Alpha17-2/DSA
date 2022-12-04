package Graph;

import java.util.Map;
import java.util.Set;

public class GraphNode {
    Map<Integer, Set<Integer>> graph;

    public GraphNode(Map<Integer, Set<Integer>> graph) {
        this.graph = graph;
    }
}
