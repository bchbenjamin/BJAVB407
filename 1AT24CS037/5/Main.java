public class Main {
    public static void main(String args[])
    {
        Shape obj1 = new Shape(12, 15, 24, 3);
        Triangle obj2 = new Triangle(24, 3);
        Circle obj3 = new Circle(12, 3);
        System.out.println("--- Regular Shape ---");
        obj1.draw();
        obj1.erase();
        System.out.println("--- Triangle ---");
        obj2.draw();
        obj2.erase();
        System.out.println("--- Circle ---");
        obj3.draw();
        obj3.erase();
    }
}