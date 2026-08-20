package Day_27.ClassTask;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class GraphDemo {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 0, 0, 1},
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {1, 1, 0, 1, 0}
        };
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(2,3);
        g.addEdge(1,2);
        g.addEdge(3,4);
        g.addEdge(0,4);
        g.addEdge(1,4);

        g.printAdjList();

    }
}
class Graph {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

    Graph(int v) {
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
    }

    public void printAdjList() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.println( i + "->");
            for(int j=0;j<adjList.get(i).size();j++){
                System.out.println(" " + adjList.get(i).get(j));
            }
        }
    }
}