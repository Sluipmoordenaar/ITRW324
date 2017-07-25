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
        simpleJava.setText("Hello!!");
        while (true) {
            System.out.println("loop");
            sleepFourSeconds();
            simpleJava.getLabelLabel1().setText("Please feel free to commit some changes!");
            sleepFourSeconds();
            simpleJava.setText("We are group 14 :)");
            sleepFourSeconds();
            simpleJava.setText("Edwin Viljoen");
            sleepFourSeconds();
            simpleJava.setText("Morné du Plooy");
            sleepFourSeconds();
            simpleJava.setText("Zane Schoonraad");
            sleepFourSeconds();
            simpleJava.setText("Stian Scholtz");
            sleepFourSeconds();
            simpleJava.setText("Justin vd Westhuizen");
            sleepFourSeconds();
            simpleJava.setText("Kristiaan Pretorius");
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
