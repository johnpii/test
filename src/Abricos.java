public class Abricos extends Frukt {
    static double total = 0;
    @Override
    public double cost(double weight) {
        total += weight * 200;
        return weight * 200;
    }
}
