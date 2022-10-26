import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        byte[] mass = new byte[n/8 + (n % 8 == 0 ? 0 : 1)];
        boolean b;
        for (int i = 0; i < n; ++i) {
            b = in.nextBoolean();
            if (b) mass[i/8] = (byte) (mass[i/8] | (1 << (i%8)));
        }
        for (int i = 0; i < n ; ++i) {
            System.out.print(((mass[i/8] & (1 << (i%8))) != 0) + " ");
        }

    }
}
