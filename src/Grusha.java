public class Grusha extends Frukt {
    static double total = 0;
    @Override
    public double cost(double weight) {
        total += weight * 150;
        return weight * 150;
    }
}
