public class Magazine implements Printable {
    public static void printMagazines(Printable[] printable)
    {
        for (Printable p: printable) {
            if (p instanceof Magazine)
                p.print();
        }
    }
    @Override
    public void print() {
        System.out.println("Журнал");
    }
}
