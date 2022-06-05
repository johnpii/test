public class MinMax <T extends Comparable> {
    //8
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T minElement() {
        if (array.length > 0) {
            T min = array[0];
            for (T t : array) {
                if (t.compareTo(min) < 0) {
                    min = t;
                }
            }
            return min;
        }
        return null;
    }

    public T maxElement() {
        if (array.length > 0) {
            T max = array[0];
            for (T t : array) {
                if (t.compareTo(max) > 0) {
                    max = t;
                }
            }
            return max;
        }
        return null;
    }
}
