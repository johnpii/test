public class Baraban implements Instrument {
    int rasmer;
    Baraban(int rasmer)
    {
        this.rasmer = rasmer;
    }
    @Override
    public void play() {
        System.out.println("Играет барабан с размером: " + rasmer);
    }
}
