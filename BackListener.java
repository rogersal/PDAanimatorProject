 
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
 
public class BackListener implements ActionListener
{
    public void actionPerformed(ActionEvent e) {
        JFrame myFrame = new JFrame();
        JButton BackButton = new JButton("BACK");
        myFrame.add(BackButton);
        if (BackButton.getModel().isPressed()) {
            myFrame.setVisible(false);
            //logo.repaint();
        }

    }
}
