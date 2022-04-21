public class Landishi extends Flower {
    static int count;
    final String NAME = "Landish";
    public Landishi() {
        count++;
        super.price += 100;
    }
}
