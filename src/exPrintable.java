public class exPrintable{
    //4
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Вызов");
            }
        };
        printable.print();
    }
}
