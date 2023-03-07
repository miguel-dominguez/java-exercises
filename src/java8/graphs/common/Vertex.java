package java8.graphs.common;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

  private String name;
  private boolean visited; // no more child
  private boolean isBeingVisited; // visiting child in process
  private List<Vertex> adjacenciesList;

  public Vertex(String name) {
    this.name = name;
    this.adjacenciesList = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isVisited() {
    return visited;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

  public boolean isBeingVisited() {
    return isBeingVisited;
  }

  public void setBeingVisited(boolean beingVisited) {
    isBeingVisited = beingVisited;
  }

  public List<Vertex> getNeighbors() {
    return adjacenciesList;
  }

  public void addNeighbor(Vertex vertex) {
    this.adjacenciesList.add(vertex);
  }

  @Override
  public String toString() {
    return name;
  }

}
