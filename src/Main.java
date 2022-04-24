import java.util.Scanner;
public class Main {
    //3
    public void testEnum(VremenaGoda vremenaGoda)
    {
        switch (vremenaGoda) {
            case spring:
                System.out.println("Я люблю весну");
                break;
            case autumn:
                System.out.println("Я люблю осень");
                break;
            case summer:
                System.out.println("Я люблю лето");
                break;
            case winter:
                System.out.println("Я люблю зиму");
                break;
        }
    }
    public static void main(String[] args) {
        //1
        Printable[] jurnals = {new Book(), new Magazine(), new Book()};
        for(Printable p : jurnals)
        {
            p.print();
        }
        //2
        System.out.println();
        Instrument[] instruments = {new Gitar(5), new Truba(4.2), new Baraban(4)};
        for(Instrument i : instruments)
        {
            i.play();
        }
        //3
        System.out.println();
        for(VremenaGoda vremenaGoda : VremenaGoda.values())
        {
            System.out.println(vremenaGoda + "\t" + vremenaGoda.srTemperature + "\t" + vremenaGoda.getDescription());
        }
        //4
        Clothing[] clothings = {new Tshirt(), new Shtani(), new Yubka(), new Galstuk()};
    }
}

