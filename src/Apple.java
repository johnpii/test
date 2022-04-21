public class Apple extends Frukt {
    static double total = 0;
    @Override
    public double cost(double weight) {
        total += weight * 100;
        return weight * 100;
    }
}
