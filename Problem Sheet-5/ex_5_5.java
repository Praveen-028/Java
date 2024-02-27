import java.util.Scanner;

public class ex_5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N (must be an odd number): ");
        int N = scanner.nextInt();

        if (N % 2 == 0) {
            System.out.println("N must be an odd number.");
            scanner.close();
            return;
        }

        int[][] magicSquare = new int[N][N];

        int num = 1;
        int i = N / 2;
        int j = N - 1;

        while (num <= N * N) {
            if (i == -1 && j == N) {
                j = N - 2;
                i = 0;
            } else {
                if (j == N)
                    j = 0;
                if (i < 0)
                    i = N - 1;
            }

            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else {
                magicSquare[i][j] = num++;
            }

            j++;
            i--;
        }

        System.out.println("The Magic Square for N = " + N + " is:");
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print(magicSquare[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
