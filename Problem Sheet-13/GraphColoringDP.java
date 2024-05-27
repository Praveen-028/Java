import java.util.Scanner;
import java.util.Arrays; // Import the Arrays class

public class GraphColoringDP {
    static int[][] adjacencyMatrix;
    static int[][] dp;
    static int N; // Number of vertices

    // Recursive function to find the minimum number of colors required
    public static int minColors(int mask, int colors) {
        // Base case: All vertices are colored
        if (mask == (1 << N) - 1)
            return colors;

        int minColors = Integer.MAX_VALUE;
        for (int vertex = 0; vertex < N; vertex++) {
            if ((mask & (1 << vertex)) == 0) { // if vertex is not colored
                boolean[] availableColors = new boolean[colors + 1];
                Arrays.fill(availableColors, true);

                for (int v = 0; v < N; v++) {
                    if ((adjacencyMatrix[vertex][v] == 1) && ((mask & (1 << v)) != 0)) {
                        int coloredVertexColor = dp[mask & (~(1 << v))][v];
                        if (coloredVertexColor != -1) {
                            availableColors[coloredVertexColor] = false;
                        }
                    }
                }

                for (int color = 1; color <= colors; color++) {
                    if (availableColors[color]) {
                        dp[mask | (1 << vertex)][vertex] = color;
                        minColors = Math.min(minColors, minColors(mask | (1 << vertex), colors));
                        dp[mask | (1 << vertex)][vertex] = -1; // backtrack
                    }
                }
            }
        }
        return minColors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        N = scanner.nextInt();

        adjacencyMatrix = new int[N][N];
        dp = new int[1 << N][N];
        for (int i = 0; i < (1 << N); i++) {
            for (int j = 0; j < N; j++) {
                dp[i][j] = -1; // Initialize dp array with -1
            }
        }

        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                adjacencyMatrix[i][j] = scanner.nextInt();
            }
        }

        int result = minColors(0, N); // Start with no vertices colored
        System.out.println("Minimum number of colors required: " + result);

        scanner.close();
    }
}
