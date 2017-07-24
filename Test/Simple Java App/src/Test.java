import javax.swing.*;

/**
 * Created by Edwin on 2017/07/23.
 */
public class Test {

    private static SimpleJava simpleJava = new SimpleJava();

    public static void main(String[] args) {
// Default Frame settings:

        JFrame frame = new JFrame("Simple Java App");
        frame.setContentPane(simpleJava.getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
