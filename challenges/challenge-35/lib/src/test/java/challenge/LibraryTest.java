/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void implementTest2() {
        Graph<String>  graph = new Graph();
        Vertex<String> vertex1;
        Vertex<String> vertex2;
        vertex1 = graph.addNode("Yousef");
        vertex2 = graph.addNode("Ahmad");
        graph.addEdge(vertex1,vertex2,5);
        assertEquals("Yousef:[5] ; Ahmad:[5] ; ", graph.toString());
    }
    @Test
    public void test2(){
        Graph<String>  graph = new Graph();
        Vertex<String> vertex1;
        Vertex<String> vertex2;
        vertex1 = graph.addNode("Yousef");
        vertex2 = graph.addNode("Ahmad");
        graph.addEdge(vertex1,vertex2,5);
        assertEquals("{Vertex{key=Ahmad}=5}", graph.getNeighbors(vertex1).toString());
    }
    @Test
    public void test3(){
        Graph<String>  graph = new Graph();
        Vertex<String> vertex1;
        Vertex<String> vertex2;
        vertex1 = graph.addNode("Yousef");
        vertex2 = graph.addNode("Ahmad");
        graph.addEdge(vertex1,vertex2,5);
        assertEquals(2, graph.size());
    }
    @Test
    public void test4(){
        Graph<String>  graph = new Graph();
        Vertex<String> vertex1;
        Vertex<String> vertex2;
//        vertex1 = graph.addNode("Yousef");
//        vertex2 = graph.addNode("Ahmad");
//        graph.addEdge(vertex1,vertex2,5);
        assertEquals(null, graph.size());
    }
        @Test
public void test5(){

            Graph<String> graph = new Graph();

            Vertex<String> vertex1 = graph.addNode("Yousef");
            Vertex<String> vertex2 = graph.addNode("Ahmad");
            Vertex<String> vertex3 = graph.addNode("Hanan");
            Vertex<String> vertex4 = graph.addNode("Eman");
            graph.addEdge(vertex1,vertex2,5);
            graph.addEdge(vertex1,vertex3,5);
            graph.addEdge(vertex2,vertex4,5);
            assertEquals("[Vertex{key=Yousef}, Vertex{key=Hanan}, Vertex{key=Ahmad}, Vertex{key=Eman}]", graph.depthFirstTraverse(vertex1).toString());
        }
    @Test
   public void directTripCost() {
        Graph<String> graph;
        ArrayList<String> arrayList;
            graph = new Graph();
            arrayList = new ArrayList<>();

            Vertex<String> vertex1 = graph.addNode("Pandora");
            Vertex<String> vertex2 = graph.addNode("Metro");

            graph.addEdge(vertex1, vertex2, 26);

            arrayList.add("Pandora");
            arrayList.add("Metro");

            assertEquals("TRUE, 26", graph.getTripCost(graph, arrayList));
        }
    @Test
  public   void nonDirectTripCost(){
        Graph<String> graph;
        ArrayList<String> arrayList;
        graph = new Graph();
        arrayList = new ArrayList<>();
        Vertex<String> vertex1 = graph.addNode("Pandora");
        Vertex<String> vertex2 = graph.addNode("Metro");
        Vertex<String> vertex3 = graph.addNode("Naboo");

        graph.addEdge(vertex1,vertex2,42);
        graph.addEdge(vertex2,vertex3,73);

        arrayList.add("Pandora");
        arrayList.add("Metro");
        arrayList.add("Naboo");

        assertEquals("TRUE, 115",graph.getTripCost(graph, arrayList));

    }

    @Test
   public void noLinkTripCost(){
        Graph<String> graph;
        ArrayList<String> arrayList;
        graph = new Graph();
        arrayList = new ArrayList<>();
        Vertex<String> vertex1 = graph.addNode("Pandora");
        Vertex<String> vertex2 = graph.addNode("Metro");
        Vertex<String> vertex3 = graph.addNode("Naboo");

        graph.addEdge(vertex1,vertex2,42);
        graph.addEdge(vertex2,vertex3,73);

        arrayList.add("Pandora");
        arrayList.add("Naboo");

        assertEquals("FALSE, 0",graph.getTripCost(graph, arrayList));
    }
    @Test
    public void depthFirstTraverse(){
        Graph<String> graph;
        ArrayList<String> arrayList;
        graph = new Graph();
        arrayList = new ArrayList<>();
        Vertex<String> vertex1 = graph.addNode("Pandora");
        Vertex<String> vertex2 = graph.addNode("Metro");
        Vertex<String> vertex3 = graph.addNode("Naboo");

        graph.addEdge(vertex1,vertex2,42);
        graph.addEdge(vertex2,vertex3,73);



        assertEquals("[Vertex{key=Pandora}, Vertex{key=Metro}, Vertex{key=Naboo}]",graph.breadthFirstTraverse(vertex1).toString());
    }
    }

