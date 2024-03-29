package challenge;

import java.util.*;

public class Graph<T> {

    private Map<Vertex<T>, Map<Vertex<T>, Integer>> graphMap;

    public Graph() {

        this.graphMap = new HashMap<>();

    }

    public Vertex<T> addNode(T data) {

        Vertex<T> vertex = new Vertex<>(data);
        Map<Vertex<T>, Integer> values = new HashMap<>();
        graphMap.putIfAbsent(vertex, values);

        return vertex;

    }

    /**
     * Add new edge between two vertices with weight of 0
     *
     * @param vertex1
     * @param vertex2
     */
    public void addEdge(Vertex<T> vertex1, Vertex<T> vertex2) {
        Map<Vertex<T>, Integer> values;

        graphMap.get(vertex1).putIfAbsent(vertex2, 0);
        graphMap.get(vertex2).putIfAbsent(vertex1, 0);
    }

    /**
     * Add new edge between two vertices with weight value
     *
     * @param vertex1
     * @param vertex2
     * @param weight
     */
    public void addEdge(Vertex<T> vertex1, Vertex<T> vertex2, Integer weight) {
        Map<Vertex<T>, Integer> values;

        graphMap.get(vertex1).putIfAbsent(vertex2, weight);
        graphMap.get(vertex2).putIfAbsent(vertex1, weight);
    }

    /**
     * get all vertices in graph
     *
     * @return
     */
    public Set<Vertex<T>> getNodes() {
        return graphMap.keySet();
    }

    /**
     * get edges connected to the given node Include the weight of the connection
     *
     * @param vertex
     * @return
     */
    public Map<Vertex<T>, Integer> getNeighbors(Vertex<T> vertex) {
        return graphMap.get(vertex);
    }

    /**
     * get the total number of nodes in the graph
     *
     * @return
     */
    public Object size() {
if (graphMap.keySet().size()==0){
    return null;
}else {
        return graphMap.keySet().size();}
    }


    public List<Integer> getValues(Map<Vertex<T>, Integer> map) {
        List<Integer> values = new ArrayList<>();
        for (Vertex<T> key :
                map.keySet()) {
            values.add(map.get(key));
        }
        return values;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder =new StringBuilder();
        for (Vertex<T> vertex:
                graphMap.keySet()) {
            stringBuilder.append(vertex.getKey());
            stringBuilder.append(":");
            stringBuilder.append(this.getValues(graphMap.get(vertex)));
            stringBuilder.append(" ; ");
        }
        return stringBuilder.toString();
    }

    //------------------------------cc-36--------------------------
public Set<Vertex<T>> breadthFirstTraverse(Vertex<T> vertex){
    Set<Vertex<T>> visited = new LinkedHashSet<>();
    Queue<Vertex<T>> queue = new LinkedList<>();
    visited.add(vertex);
    queue.add(vertex);
    while (!queue.isEmpty()){
        Vertex<T> popped = queue.poll();
        for (Vertex<T> edge: this.graphMap.get(popped).keySet()) {
            if (!visited.contains(edge)){
                visited.add(edge);
                queue.add(edge);
            }
        }
    }
    return visited;
}
//------------------------------cc37
public boolean contains(Map<Vertex<String>,Integer> map, String data){
    ArrayList<Vertex<String>> verticesArray = new ArrayList<>();
    verticesArray.addAll(map.keySet());

    for (Vertex<String> node:
            verticesArray) {
        if (node.getKey().equals(data)) return true;
    }
    return false;
}
public String getTripCost(Graph<String> graph, ArrayList<String> cityNames){

    int i = 1;
    int sum=0;

    Queue<Vertex<String>> queue = new LinkedList<>();
    Set<Vertex<String>> graphVertices = graph.getNodes();
    for (Vertex<String> vertex:
            graphVertices) {
        if (vertex.getKey().equals(cityNames.get(0))) {
            queue.add(vertex);
            while (!queue.isEmpty()){
                Vertex<String> popped = queue.poll();
                Map<Vertex<String>,Integer> edges = graph.getNeighbors(popped);
                if (contains(edges ,cityNames.get(i))) {
                    for (Vertex<String> key :
                            edges.keySet()) {
                        if (key.getKey().equals(cityNames.get(i))) {
                            sum += edges.get(key);
                            queue.add(key);
                            break;
                        }
                    }
                }else {
                    return "FALSE, 0";
                }
                if (i == cityNames.size()-1) {
                    break;
                }else {
                    i++;
                }
            }
        }
    }
    return "TRUE, "+ sum;
}
//-----------------------------------cc-38--------------------------------------------

    public Set<Vertex<T>> depthFirstTraverse(Vertex<T> vertex){
        Set<Vertex<T>> visited = new LinkedHashSet<>();
        Stack<Vertex<T>> stack = new Stack<>();
        stack.add(vertex);
        while (!stack.isEmpty()){ Vertex<T> popped= stack.pop();
            if (!visited.contains(popped)){
                visited.add(popped);
                for (Vertex<T> edge: this.graphMap.get(popped).keySet()) {
                    stack.add(edge);
                }
            }
        }
        return visited;
    }

}

