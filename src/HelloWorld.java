import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {

    private JPanel panel;
    private JLabel lblHelloWorld;
    private JLabel lblHelloWorld2;

    public HelloWorld(){
        panel = new JPanel(new GridLayout(1, 1));
        lblHelloWorld = new JLabel("Hello World  2");
        lblHelloWorld2 = new JLabel("O andré esteve aqui");
        lblHelloWorld.setHorizontalAlignment(SwingConstants.CENTER);
        lblHelloWorld2.setHorizontalAlignment(SwingConstants.CENTER);

        panel.add(lblHelloWorld);
        panel.add(lblHelloWorld2);
        setContentPane(panel);


        setPreferredSize(new Dimension(600, 600));
        pack();
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
