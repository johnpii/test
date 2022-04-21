public class Circle {
    double radius;
    final double PI = 3.14;
    Circle(double radius)
    {
        this.radius = radius;
    }
    Circle()
    {

    }
    public double ploshad()
    {
        return radius*radius*PI;
    }
    public double dlina()
    {
       return 2*radius*PI;
    }
}
