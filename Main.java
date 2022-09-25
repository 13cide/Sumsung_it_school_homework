import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            task6();
        }
    }

    public static void task1() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = n / 100 + n % 100 / 10 + n % 10;
        if (n % 2 == 0) {
            System.out.println(ans + " " + (n + 2));
        }
        else {
            System.out.println(ans + " " + (n + 1));
        }
    }

    public static void task2() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        System.out.println(n*(a*100+b)/100 + " " + n*b%100);
    }

    public static void task3() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = n/3600;
        int m = n%3600/60;
        int s = n%60;
        System.out.println(h + ":" + (m > 9 ? m : "0" + m) + ":" + (s > 9 ? s : "0" + s));
    }

    public static void task4() {
        Scanner in = new Scanner(System.in);
        double x = in.nextFloat();
        System.out.println(x >= -2 && x <= 3 || x >= 6 && x <= 9 ? "false" : "true");
    }

    public static void task5() {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        long x;
        for (int i = 0; i < 3; ++i) {
            x = in.nextLong();
            if (x % 5 == 0 && x / 1000 == 0 && x / 100 != 0) {
                ++counter;
            }
        }
        System.out.println(counter > 1 ? "true" : "false");
    }

    public static void task6() {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        boolean in_parabala = y < 2 - x*x;
        boolean upper_line = y > x;
        System.out.println(in_parabala && (upper_line || y > 0) ? "YES" : "NO");
    }
}
