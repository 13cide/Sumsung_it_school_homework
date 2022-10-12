import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt()*2+1;
        int[][] a = new int[n][n];
        int x = 0;
        int y = n - 1;
        int k = n*n-1;
        while (k > 0) {
            for (int i = 0; i < n; ++i) {
                if (a[i][y] == 0) a[i][y] = k--;
            }
            for (int i = n-1; i >= 0; --i) {
                if (a[y][i] == 0) a[y][i] = k--;
            }
            for (int i = n - 1; i >= 0; --i) {
                if (a[i][x] == 0) a[i][x] = k--;
            }
            for (int i = 0; i < n; ++i) {
                if (a[x][i] == 0) a[x][i] = k--;
            }
            x++;
            y--;
        }
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
