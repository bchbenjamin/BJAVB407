/**
 * Develop a JAVA program to create an interface Resizable with methods 
 * resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. 
 * Create a class Rectangle that implements the Resizable interface and implements 
 * the resize methods.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        System.out.println("Current State:\n"+r);
        r.resizeWidth(3);
        r.resizeHeight(7);
        System.out.println("Current State:\n"+r);
    }
}
