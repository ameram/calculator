import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    JLabel nameLabel = new JLabel("");
    JTextField numberTextField = new JTextField(15);
    ButtonPane pane = new ButtonPane(new FlowLayout(), new Dimension(270, 280), nameLabel);

    public Window() {
        super("Custom JFrame");
        this.setFont(new Font("SourceCodePro", 1, 12));
        this.setSize(new Dimension(270, 360));
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.setUndecorated(true);
        this.setFocusable(false);

        numberTextField.setEditable(false);
        numberTextField.setPreferredSize(new Dimension(270, 30));
        numberTextField.setText("HELLO");
        numberTextField.setFont(new Font("SourceCodePro", 5, 12));

        nameLabel.setPreferredSize(new Dimension(270, 30));
        nameLabel.setToolTipText("Results");

        this.setDefaultCloseOperation(3);
        this.add(nameLabel);
        this.add(numberTextField);
        this.add(pane);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Window();
    }
}
