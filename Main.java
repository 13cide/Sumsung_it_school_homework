public class Main {

    public static <T extends Comparable<T>> int  binarySearch (T[] a, T key, int low, int hi) {
        if (low > hi) throw new IllegalArgumentException("Low > Hi");
        if (low < 0 || hi >= a.length) throw new IllegalArgumentException("Incorrect indexes");
        int mid = 0;
        while (low <= hi) {
            mid = (low + hi) / 2;
            T value = a[mid];
            if (value.compareTo(key) == 0) return mid;
            else if (value.compareTo(key) < 0) low = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
    }
}