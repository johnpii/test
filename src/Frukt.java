public abstract class Frukt {
    double weight;
    public final void printManufacturerInfo()
    {
        System.out.print("Made in Ukraine");
    }
    public abstract double cost(double weight);
}
