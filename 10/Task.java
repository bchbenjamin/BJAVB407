/**
 * Write a program to illustrate creation of threads using runnable Interface.
 * (start
 * method start each of the newly created thread. Inside the run method there is
 * sleep() for suspend the thread for 500 milliseconds).
 */

public class Task implements Runnable {
    private String threadName;
    private int time;

    public Task(String taskName, int time) {
        this.threadName = taskName;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Executing task " + i + " of " + this.threadName);
                Thread.sleep(this.time);
            }
        } catch (InterruptedException ex) {
            System.out.println("Task Interrupted!!\n" + ex.getMessage());
        } finally {
            System.out.println(this.threadName + " executed successfully!!");
        }
    }
}
