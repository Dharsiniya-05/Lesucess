import java.util.*;

public class GraphDFS {
    public static void dfs(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> result) {
        visited[node] = true;
        result.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, result);
            }
        }
    }

    public static List<Integer> dfsTraversal(List<List<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        List<Integer> result = new ArrayList<>();
        dfs(0, adj, visited, result); 
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

   
        List<Integer> dfsResult = dfsTraversal(adj, V);
        System.out.println("DFS Traversal: " + dfsResult);
    }
}
