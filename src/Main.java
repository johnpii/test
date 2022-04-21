public class Main {
    public static void main(String[] args) {
        //2
        Tulpan tulpan1 = new Tulpan();
        Landishi landishi1 = new Landishi();
        Gvosdiki gvosdiki1 = new Gvosdiki();
        Flower[] flowers = {tulpan1, landishi1, gvosdiki1};
        Tulpan tulpan2 = new Tulpan();
        Rose rose = new Rose();
        Flower[] flowers2 = {tulpan2, rose};
        Landishi landishi2 = new Landishi();
        Landishi landishi3 = new Landishi();
        Gvosdiki gvosdiki4 = new Gvosdiki();
        Flower[] flowers3 = {landishi2, landishi3, gvosdiki4};
        System.out.println("Первый букет: " + (flowers[0].price + flowers[1].price + flowers[2].price));
        System.out.println("Второй букет: " + (flowers2[0].price + flowers2[1].price));
        System.out.println("Третий букет: " + (flowers3[0].price + flowers3[1].price + flowers3[2].price));
        System.out.println("Всего цветов: " + (Landishi.count + Gvosdiki.count + Tulpan.count + Rose.count));
        //3
        System.out.println();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Grusha grusha1 = new Grusha();
        Grusha grusha2 = new Grusha();
        Grusha grusha3 = new Grusha();
        Abricos abricos1 = new Abricos();
        apple1.cost(0.7);
        apple2.cost(2);
        grusha1.cost(2.4);
        grusha2.cost(3.4);
        grusha3.cost(1.8);
        abricos1.cost(6);
        System.out.println("Итог по яблокам: " + Apple.total);
        System.out.println("Итог по грушам: " + Grusha.total);
        System.out.println("Итог по абрикосам: " + Abricos.total);
        System.out.println("Итог по всем фруктам: " + (Apple.total + Grusha.total + Abricos.total));
        //4
        System.out.println();
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(5);
        System.out.println(circle1.dlina());
        System.out.println(circle2.ploshad());
    }
}

