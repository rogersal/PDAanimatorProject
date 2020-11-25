import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
/**
 * Write a description of class BackListener here.
 *
 * @author Grant Nelson
 * @version 
 */
public class NextListener implements ActionListener
{
    public void actionPerformed(ActionEvent e) {
        JFrame myFrame = new JFrame();
        JButton NextButton = new JButton("Next");
        myFrame.add(NextButton);
        if (NextButton.getModel().isPressed()) {
            myFrame.setVisible(false);
            //logo.repaint();
        }

    }
}
