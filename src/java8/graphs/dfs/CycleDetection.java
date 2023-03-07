package java8.graphs.dfs;

import java8.graphs.common.Vertex;

import java.util.List;

public class CycleDetection {

  public static void main(String[] args) {
    List<Vertex> graph = initializeGraph();
    CycleDetection cd = new CycleDetection();
    cd.detectCycle(graph);
  }

  public static List<Vertex> initializeGraph() {
    Vertex v0 = new Vertex("A");
    Vertex v1 = new Vertex("B");
    Vertex v2 = new Vertex("C");
    Vertex v3 = new Vertex("D");
    Vertex v4 = new Vertex("E");
    Vertex v5 = new Vertex("F");

    v5.addNeighbor(v0);
    v0.addNeighbor(v4);
    v0.addNeighbor(v2);
    v4.addNeighbor(v5);
    v2.addNeighbor(v1);
    v2.addNeighbor(v3);

    List<Vertex> graph = List.of(v0, v1, v2, v3, v4, v5);
    return graph;
  }

  public void detectCycle(List<Vertex> graph) {
    for (Vertex v: graph) {
      if (!v.isVisited()){
        dfs(v);
      }
    }
  }

  public void dfs(Vertex vertex) {
    vertex.setBeingVisited(true);
    for (Vertex v: vertex.getNeighbors()) {
      if (v.isBeingVisited()) {
        System.out.println("Backward edge... There is a cycle from " + vertex + " to " + v);
        return;
      }
      if (!v.isVisited()) {
        v.setVisited(true);
        dfs(v);
      }
      vertex.setBeingVisited(false);
      vertex.setVisited(true);
    }
  }

}
