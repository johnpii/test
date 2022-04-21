public class Tulpan extends Flower {
    static int count;
    final String NAME = "Tulpan";
    public Tulpan() {
        count++;
        super.price += 150;
    }
}
