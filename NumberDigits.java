public class NumberDigits {
    public static void main(String[] args) {
    }

    public static int sumOFchar(int n) {
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }

    public static int sumOfSeven(int a, int b) {
        int ans = 0;
        for (int i = a; i <= b; ++i) {
            if (i % 7 == 0) {
                ans += sumOFchar(i);
            }
        }
        return ans;
    }
}
