import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static class HeavyBox {
        //6
        int i;

        public HeavyBox(int i) {
            this.i = i;
        }
    }

    public static void main(String[] args) {
        //1
        Printable p = () -> System.out.println("print");
        p.print();
        //2
        Predicate<String> predicate = (s) -> {
            return s == null;
        };
        String str = null;
        System.out.println(predicate.test(str));
        //3
        Predicate<String> predicate1 = (s) -> {
            return s != "";
        };
        String str1 = "";
        System.out.println(predicate1.test(str1));
        //4
        String str2 = "";
        if (predicate.and(predicate1).test(str2)) {
            System.out.println("Hello");
        }
        //5
        Predicate<String> predicate2 = (s) -> {
            return s.startsWith("J") || s.startsWith("N") || s.endsWith("A");
        };
        String str3 = "Jhwgygfq";
        System.out.println(predicate2.test(str3));
        //6
        Consumer<HeavyBox> consumer = (HeavyBox n) -> {
            System.out.println("Отгрузили ящик с весом " + n.i);
        };
        Consumer<HeavyBox> consumer2 = (HeavyBox n) -> {
            System.out.println("Отправляем ящик с весом " + n.i);
        };
        HeavyBox h = new HeavyBox(5);
        consumer.andThen(consumer2).accept(h);
        //7
        Function<Integer, String> f = ch -> {
            String res = "Ноль";
            if (ch > 0) {
                res = "Положительное число";
            } else if (ch < 0) {
                res = "Отрицательное число";
            }
            return res;
        };
        System.out.println(f.apply(5));
        //8
        Supplier<Integer> supplier = () -> (int)(Math.random()*10);
        System.out.println(supplier.get());
        //9
        Printable printable = System.out::println;
        printable.print();
    }
}