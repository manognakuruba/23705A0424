import java.util.*;

public class BFSMatrix {
    public static void bfs(int[][] graph, int start) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (graph[current][neighbor] == 1 && !visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example graph (undirected)
        int[][] adjMatrix = {
            {0, 1, 1, 0},
            {1, 0, 0, 1},
            {1, 0, 0, 1},
            {0, 1, 1, 0}
        };

        System.out.println("BFS starting from node 0:");
        bfs(adjMatrix, 0);
    }
}
