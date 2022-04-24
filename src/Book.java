public class Book implements Printable
{
    public static void printBooks(Printable[] printable)
    {
        for (Printable p: printable) {
            if (p instanceof Book)
                p.print();
        }
    }
    @Override
    public void print() {
        System.out.println("Книга");
    }
}
