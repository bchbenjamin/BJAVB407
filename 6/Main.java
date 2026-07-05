/**
 * Develop a JAVA program to create an abstract class Shape with abstract methods
 * calculateArea() and calculatePerimeter().
 * Create subclasses Circle and Triangle that extend the Shape class and implement
 * the respective methods to calculate the area and perimeter of each shape
 */
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        Circle c = new Circle(4);
        System.out.printf("Rectangle:\nArea: %f\nPerimeter: %f\n", r.calculateArea(), r.calculatePerimeter());
        System.out.printf("Circle:\nArea: %f\nPerimeter: %f\n", c.calculateArea(), c.calculatePerimeter());
    }
}
