import java.util.*;

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (char[] row : board)
            Arrays.fill(row, '.');

        solve(0, board, result, n);
        return result;
    }

    private void solve(int row, char[][] board, List<List<String>> result, int n) {
        if (row == n) {
            List<String> config = new ArrayList<>();
            for (char[] r : board)
                config.add(new String(r));
            result.add(config);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';
                solve(row + 1, board, result, n);
                board[row][col] = '.'; 
            }
        }
    }

    private boolean isSafe(int row, int col, char[][] board, int n) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();

        if (n < 1 || n > 9) {
         
            return;
        }

        NQueens solver = new NQueens();
        List<List<String>> solutions = solver.solveNQueens(n);

        System.out.println( solutions.size());
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
