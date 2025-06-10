import java.util.*;

public class GraphBFS {
    public static List<Integer> bfsTraversal(List<List<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

    
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter the edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u); 
        }

  
        List<Integer> bfsResult = bfsTraversal(adj, V);
        System.out.println("BFS Traversal: " + bfsResult);
    }
}
