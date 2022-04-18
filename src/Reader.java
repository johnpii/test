public class Reader {
    private String fio;
    private int numberbilet;
    private String facult;
    private String date;
    private int telefon;
    public void takeBook(int number)
    {
        System.out.println("Петров В. В. взял" + number +"книги");
    }
    public void takeBook(String... array)
    {
        System.out.print("Петров В. В. взял книги: ");
        for (String a : array) {
            System.out.print(a);
        }
    }
    public void takeBook(Book... array)
    {
        System.out.print("Петров В. В. взял книги: ");
        for (Book a : array) {
            System.out.println(a.getName());
        }
    }
    public void returnBook(int number)
    {
        System.out.println("Петров В. В. вернул" + number +"книги");
    }
    public void returnBook(String... array)
    {
        System.out.print("Петров В. В. вернул книги: ");
        for (String a : array) {
            System.out.print(a);
        }
    }
    public void returnBook(Book... array)
    {
        System.out.print("Петров В. В. вернул книги: ");
        for (Book a : array) {
            System.out.println(a.getName());
        }
    }
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumberbilet() {
        return numberbilet;
    }

    public void setNumberbilet(int numberbilet) {
        this.numberbilet = numberbilet;
    }

    public String getFacult() {
        return facult;
    }

    public void setFacult(String facult) {
        this.facult = facult;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
}
