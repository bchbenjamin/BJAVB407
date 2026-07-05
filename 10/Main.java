public class Main {
    public static void main(String[] args) {
        Thread parent = new Thread(new Task("Parent Task", 500));
        Thread child = new Thread(new Task("Child Task", 1200));
        parent.start();
        child.start();
    }
}
