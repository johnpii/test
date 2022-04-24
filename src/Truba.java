public class Truba implements Instrument{
    double diametr;
    Truba(double diametr)
    {
        this.diametr = diametr;
    }
    @Override
    public void play() {
        System.out.println("Играет труба с диаметром: " + diametr);
    }
}
