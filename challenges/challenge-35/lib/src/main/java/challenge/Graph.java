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


//    @Override
//    public String toString() {
//        return "Graph{" +
//                "graphMap=" + graphMap +
//                '}';
//    }
}