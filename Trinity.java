public class Trinity<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;

    private void sortTrinity() {
        T tmp;
        if (first.compareTo(second) < 0) {
            tmp = first;
            first = second;
            second = tmp;

        }
        if (second.compareTo(third) < 0) {
            tmp = second;
            second = third;
            third = tmp;

            if (first.compareTo(second) < 0) {
                tmp = first;
                first = second;
                second = tmp;
            }
        }
    }

    public Trinity(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
        sortTrinity();
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
        sortTrinity();
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
        sortTrinity();
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
        sortTrinity();
    }

}
