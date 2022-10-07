import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
    }

    public static double avgOf4Digit(int[] mass) {
        double ans = 0.0;
        int counter = 0;
        for (int i : mass) {
            if (i/1000 > 0 && i/1000 < 10) {
                ans += i;
                ++counter;
            }
        }

        return counter > 0 ? ans/counter : -1.0;
    }

    public static int[] minToBegin(int[] mass) {
        int index_of_min = 0;
        int min = mass[0];
        for (int i = 0; i < mass.length; ++i) {
            if (mass[i] < min) {
                min = mass[i];
                index_of_min = i;
            }
        }
        int[] ans = new int[mass.length];
        ans[0] = mass[index_of_min];
        for (int i = 0; i < index_of_min; ++i) ans[i+1] = mass[i];
        for (int i = index_of_min + 1; i < mass.length; ++i) ans[i] = mass[i];
        return ans;
    }
}
