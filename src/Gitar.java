public class Gitar implements Instrument {
    int kollStrun;
    Gitar(int kollStrun)
    {
        this.kollStrun = kollStrun;
    }
    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн: " + kollStrun);
    }
}
