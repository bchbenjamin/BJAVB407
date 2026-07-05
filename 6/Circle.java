public class Circle extends Shape{
    double radius;
    Circle(double radius)
        {this.radius = radius;}

    @Override
    public double calculateArea()
        {return radius * Math.PI * radius;}

    @Override
    public double calculatePerimeter()
        {return 2 * Math.PI * radius;}
}
