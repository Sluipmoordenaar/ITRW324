/**
 * Created by Edwin on 2017/07/22.
 */
public class MessageThread implements Runnable {
    private SimpleJava simpleJava;

    public MessageThread(SimpleJava object) {
        this.simpleJava = object;
    }

    @Override
    public void run() {
        System.out.println("Thread Started... " + this.getClass());
        while (true) {

            System.out.println("loop");
            simpleJava.setText("Hello!!");
            sleepFourSeconds();
            simpleJava.getLabelLabel1().setText("Please feel free to commit some changes!");
            sleepFourSeconds();
        }
    }

    public void sleepFourSeconds() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }
    }
}
