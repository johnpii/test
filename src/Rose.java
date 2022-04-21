public class Rose extends Flower {
    static int count;
    final String NAME = "Rose";
    public Rose() {
        count++;
        super.price += 200;
    }
}
