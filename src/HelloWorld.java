import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {

    private JPanel panel;
    private JLabel lblHelloWorld;

    public HelloWorld(){
        panel = new JPanel(new GridLayout(1, 1));
        lblHelloWorld = new JLabel("Hello World");
        lblHelloWorld.setHorizontalAlignment(SwingConstants.CENTER);

        panel.add(lblHelloWorld);
        setContentPane(panel);

        setPreferredSize(new Dimension(600, 600));
        pack();
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
