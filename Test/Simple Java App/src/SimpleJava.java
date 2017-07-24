import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * Created by Edwin on 2017/07/22.
 */
public class SimpleJava {
    private JButton clickMeButton;
    private JPanel panel1;
    private JLabel label1;
    private JButton exitButton;
    private ImageIcon icon;

    public SimpleJava() {
        icon = createImageIcon("164430.gif", "Wisdom");


        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                clickMeButtonClicked();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                exitButtonClicked();
            }
        });
    }

    protected ImageIcon createImageIcon(String path, String description) {
        URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            System.out.println(path);
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't load image " + path);
            return null;
        }
    }

    private void clickMeButtonClicked(){
        clickMeButton.setVisible(false);
        new Thread(new MessageThread(this)).start();
        exitButton.setVisible(true);
    }

    private void exitButtonClicked() {
        JOptionPane.showMessageDialog(null, icon, "Wise Monk", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }

    public void setText(String string){
        label1.setText(string);
    }

    public JLabel getLabelLabel1(){
        return label1;
    }
    public JPanel getPanel1(){return panel1;}


}
