import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class ButtonPane extends JPanel implements KeyListener, ActionListener {

    JButton rawButton = new JButton("New Button");
    JLabel resultsLabel;
    JButton[] buttons = new JButton[10];
    static Dimension numberButtonDimension = new Dimension(60, 30);

    public ButtonPane(LayoutManager layout, Dimension dimension, JLabel resultsLabel) {
        super(layout);
        this.resultsLabel = resultsLabel;

        rawButton.setPreferredSize(new Dimension(dimension.width - 10, 30));
        rawButton.setFont(new Font("SourceCodePro", 6, 12));

        for (int i = 0; i < buttons.length - 1; i += 1) {
            buttons[i] = new JButton((i + 1) + "");
            buttons[i].setPreferredSize(numberButtonDimension);
            buttons[i].addKeyListener(this);
            buttons[i].addActionListener(this);
        }
        buttons[buttons.length - 1] = new JButton(0 + "");
        buttons[buttons.length - 1].setPreferredSize(numberButtonDimension);
        buttons[buttons.length - 1].addKeyListener(this);
        buttons[buttons.length - 1].addActionListener(this);

        this.setBackground(new Color(240, 230, 140));
        this.setPreferredSize(dimension);


        this.add(rawButton);
        for (int i = 0; i < buttons.length; i += 1) {
            this.add(buttons[i]);
        }
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getKeyChar() >= keyEvent.VK_0 && keyEvent.getKeyChar() <= keyEvent.VK_9) {
            String temp = resultsLabel.getText();
            resultsLabel.setText(temp + keyEvent.getKeyChar());
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(actionEvent.getActionCommand());
        String temp = resultsLabel.getText();
        if (temp == "" && actionEvent.getActionCommand() == "0") {

        } else {
            resultsLabel.setText(temp + actionEvent.getActionCommand());

        }
    }
}