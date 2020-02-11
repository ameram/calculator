import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Window extends JFrame {

    JLabel nameLable = new JLabel("Amir Ram");

    public Window() {
        super("Custom JFrame");
        this.setSize(new Dimension(400, 300));
        nameLable.setSize(new Dimension(120, 50));
        this.setDefaultCloseOperation(3);
        nameLable.setToolTipText("NAME");
        nameLable.setBorder(new TitledBorder("MY NAME IS..."));
        this.add(nameLable);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Window();
    }
}
