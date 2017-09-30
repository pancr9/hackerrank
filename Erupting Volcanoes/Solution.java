  import java.util.Scanner;

/**
 * Created by Rekhansh on 9/30/2017.
 */

public class Solution {
    private static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();

        int[][] matrices = new int[n][n];
        if (n > 4 && n < 301)
            if (m > 0 && m < 301)
                for (int a0 = 0; a0 < m; a0++) {
                    int[][] matrix = volcanoMatrix(in.nextInt(), in.nextInt(), in.nextInt());
                    for (int i = 0; i < n; i++)
                        for (int j = 0; j < n; j++)
                            matrices[i][j] = matrices[i][j] + matrix[i][j];
                }

        in.close();

        int max = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (matrices[i][j] > max)
                    max = matrices[i][j];
      
        System.out.print(max);

    }

    private static int[][] volcanoMatrix(int x, int y, int w) {

        int[][] vol = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (j == y && Math.abs(x - i) < w) {
                    vol[i][j] = w - Math.abs(x - i);
                } else if (i == x && Math.abs(y - j) < w) {
                    vol[i][j] = w - Math.abs(y - j);
                } else {
                    int d = Math.max(Math.abs(x - i), Math.abs(y - j));
                    if (d < w)
                        vol[i][j] = w - d;
                }
            }

        vol[x][y] = w;
        return vol;
    }
}

