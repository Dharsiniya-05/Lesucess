import java.util.*;

public class Rat {

    public static List<String> findPaths(int[][] maze, int n) {
        List<String> result = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];

        if (maze[0][0] == 1) {
            solve(0, 0, maze, n, "", result, visited);
        }

        return result;
    }

    private static void solve(int i, int j, int[][] maze, int n, String path, List<String> result, boolean[][] visited) {
       
        if (i == n - 1 && j == n - 1) {
            result.add(path);
            return;
        }

       
        visited[i][j] = true;

        if (i + 1 < n && maze[i + 1][j] == 1 && !visited[i + 1][j]) {
            solve(i + 1, j, maze, n, path + 'D', result, visited);
        }

   
        if (j - 1 >= 0 && maze[i][j - 1] == 1 && !visited[i][j - 1]) {
            solve(i, j - 1, maze, n, path + 'L', result, visited);
        }

   
        if (j + 1 < n && maze[i][j + 1] == 1 && !visited[i][j + 1]) {
            solve(i, j + 1, maze, n, path + 'R', result, visited);
        }

      
        if (i - 1 >= 0 && maze[i - 1][j] == 1 && !visited[i - 1][j]) {
            solve(i - 1, j, maze, n, path + 'U', result, visited);
        }

  
        visited[i][j] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        if (n < 2 || n > 10) {
        
            return;
        }


        int[][] maze = new int[n][n];
      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

      
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {

            return;
        }

   
        List<String> paths = findPaths(maze, n);
        if (paths.isEmpty()) {
            System.out.println("No paths found.");
        } else {
            System.out.println("Possible paths:");
            for (String path : paths) {
                System.out.println(path);
            }
        }
    }
}
