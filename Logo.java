// needed for doing graphics
import java.awt.*;
import javax.swing.*;

/**
 * Class Logo - !!! write a description of the class here !!!
 * 
 * @author !!! Put Your Name Here !!!
 * @version !!! Put Date Here !!!
 * 
 * --------------------------
 * CS203
 * Starter Code Last Updated:  Summer 2019
 * --------------------------
 */

public class Logo extends JPanel
{
    // instance variables
    // 
    // Define your variables here if you want to assign them in the init()
    // method and use them in other methods
    // 
    int testString = 3;  //example instance variable 

    public static void main(String[] args)
    {
        //Create a window frame
        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(900,700);

        // put the picture in the frame
        Logo logo = new Logo();
        logo.init();
        myFrame.add(logo);

        //show the user
        myFrame.setVisible(true);
        System.out.println("hello again");
    }

    public void init() 
    {      
        String question = "What string would you like to test? (Enter 1, 2, or 3)";
        String numString = JOptionPane.showInputDialog(question);
        testString = Integer.parseInt(numString);        
    }
    
    public void paint(Graphics g) { 
        super.paint(g);
        
        drawTree(g, 100, 50);    
        
        // check to see if we need to draw a second tree
        if(testString > 1)
        {
            drawTree(g, 150, 175);
        }

        // check to see if we need to draw a third tree
        if(testString == 3)
        {
            drawTree(g, 200, 225);
        }
    }
    
    public void drawTree(Graphics g, int x, int y)
    {
        // simple tree
        g.setColor(new Color(102,51,0)); // brown
        g.fillRect(x+20,y+50,20,50); //trunk
        g.setColor(Color.GREEN);
        g.fillOval(x+0,y+0,60,60);  //"leaves"

    }//drawTree
}