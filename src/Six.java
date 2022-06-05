import java.io.Serializable;

public class Six <T extends Comparable, V extends Animal & Serializable, K extends Number> {
    //6
    private T a;
    private V b;
    private K c;
    public Six(T a, V b, K c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public T getA() {
        return a;
    }

    public V getB() {
        return b;
    }

    public K getC() {
        return c;
    }
    public void name()
    {
        System.out.println(a.getClass());
        System.out.println(b.getClass());
        System.out.println(c.getClass());
    }
}
