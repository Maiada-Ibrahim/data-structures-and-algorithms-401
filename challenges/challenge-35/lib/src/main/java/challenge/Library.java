/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge;

import java.util.ArrayList;
import java.util.List;

public class Library {


    public static void main(String[] args) throws Exception {
        Graph<String> graph = new Graph();
//
//
//
//        Vertex<String> vertex1 = graph.addNode("Pandora");
//        Vertex<String> vertex2 = graph.addNode("Mariam");
//        Vertex<String> vertex3 = graph.addNode("Eman");
//        Vertex<String> vertex4 = graph.addNode("Metro");
//        Vertex<String> vertex5 = graph.addNode("Hanan");
//
//        graph.addEdge(vertex1,vertex2);
//        graph.addEdge(vertex1,vertex3);
//        graph.addEdge(vertex3,vertex4);
//        graph.addEdge(vertex3,vertex5);
//        graph.addEdge(vertex2,vertex4);
//        System.out.println(graph.toString());
//        System.out.println(graph.getNeighbors(vertex1));
//        System.out.println(graph.size());
//        System.out.println(graph.getNodes());

        //--------------------------------------------------
//        Graph<String>  graph = new Graph();
//        Vertex<String> vertex1;
//        Vertex<String> vertex2;
//        vertex1 = graph.addNode("Yousef");
//        vertex2 = graph.addNode("Ahmad");
//        graph.addEdge(vertex1,vertex2,5);
//        System.out.println(graph.size());
        //--------------------------------------------------------
//        Vertex<String> vertex1 = graph.addNode("Yousef");
//        Vertex<String> vertex2 = graph.addNode("Ahmad");
//        Vertex<String> vertex3 = graph.addNode("Hanan");
//        Vertex<String> vertex4 = graph.addNode("Eman");
//        graph.addEdge(vertex1,vertex2,5);
//        graph.addEdge(vertex1,vertex3,5);
//        graph.addEdge(vertex2,vertex4,5);
//
//        System.out.println(graph.breadthFirstTraverse(vertex1));
        //-------------------------------------------
//        Graph<String> graph;
        ArrayList<String> arrayList;
        graph = new Graph();
        arrayList = new ArrayList<>();
        Vertex<String> vertex1 = graph.addNode("Pandora");
        Vertex<String> vertex2 = graph.addNode("Metro");
        Vertex<String> vertex3 = graph.addNode("Naboo");
        Vertex<String> vertex4 = graph.addNode("boo");

        graph.addEdge(vertex1,vertex2,42);
        graph.addEdge(vertex2,vertex3,73);
        graph.addEdge(vertex2,vertex4,73);

        System.out.println(graph.breadthFirstTraverse(vertex1));
        System.out.println(graph.depthFirstTraverse(vertex1));

    }
}