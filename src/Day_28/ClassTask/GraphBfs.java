package Day_28.ClassTask;

import java.util.*;

public class GraphBfs {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 0, 0, 1},
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {1, 1, 0, 1, 0}
        };
        Graph1 g = new Graph1(5);
        g.addEdge(0,1);
        g.addEdge(2,3);
        g.addEdge(1,2);
        g.addEdge(3,4);
        g.addEdge(0,4);
        g.addEdge(1,4);

        g.printAdjList();

    }
}
class Graph1 {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

    Graph1(int v) {
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void printAdjList() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.println(i + "->");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.println(" " + adjList.get(i).get(j));
            }
        }
    }

    public void bfs(int v) {
        int V = adjList.size();
        boolean[] visited = new boolean[v];
//
//        visited[v] = true;
//        Queue<Integer> q = new LinkedList<>() {
//            q.add(v);
//
//            while(q.size()!=0){
//                int vertex = q.remove();
//            }
//        }

    }
}
