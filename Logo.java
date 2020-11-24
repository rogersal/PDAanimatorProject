// needed for doing graphics
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
* @author -Alex Rogers
* 
 * --------------------------
 */

public class Logo extends JPanel
{
    // instance variables
    // 
    // 
    int testString = 3;  //example instance variable
    int q0x = 100;
    int q0y = 100;
    int q1x = 500;
    int q1y = q0y;
    int q2x = q1x;
    int q2y = 400;
    int q3x = q0x;
    int q3y = q2y;
    
    int currentState = 0;
    int currentFrame = 0;
    
    

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
        
        
        
        
        
        myFrame.setVisible(true);
        //System.out.println("hello again");
        
        
        
    }

    public void init() 
    {      
        String question = "What string would you like to test? (Enter 1, 2, or 3)";
        String numString = JOptionPane.showInputDialog(question);
        testString = Integer.parseInt(numString);        
    }
    
    public void paint(Graphics g) { 
        super.paint(g);
        initPaint(g);
       
        
        
        int x = 0; 
        //TODO: while loop to change jframe
        while(x > 3){
            
            
        }
    }
    public void initPaint(Graphics g){
        drawState(g, q1x+75, q0y-75,4); //q1 arrow to itself, 4 removes it from accept color possiblity
        drawState(g, q2x+75, q2y+75,4);
        
        drawState(g, q0x, q0y,0); //q0 
        drawState(g, q1x, q0y,1); //q1
        drawState(g, q2x, q2y,2);//q2
        drawState(g, q3x, q3y,3);//q3
        //accept circle
        g.setColor(Color.BLACK);
        g.fillOval(q3x+10,q3y+10,130,130);
        g.setColor(Color.WHITE);
        g.fillOval(q3x+15,q3y+15,120,120);  
        g.setColor(Color.BLACK);
        
        g.fillRect(150+q0x,70+q0y,q1x-145-q0x,10);
        g.fillRect(q1x+70,150+q0y,10,q2y-145-q1y);
        g.fillRect(150+q0x,70+q3y,q1x-145-q0x,10);
        g.fillPolygon(new int[] {q1x+5, q1x-10,q1x-10}, new int[] {75+q0y,90+q0y,60+q0y}, 3);//first arrow
        g.fillPolygon(new int[] {q2x+75, q1x+90,q1x+60}, new int[] {q2y+5,q2y-10,q2y-10}, 3);//seccond arrowhead
        g.fillPolygon(new int[] {q3x+145, q3x+160,q3x+160}, new int[] {75+q3y,95+q3y,55+q3y}, 3);//third arrowhead
        
        g.fillPolygon(new int[] {q2x+75,q2x+65, q2x+85}, new int[] {145+q2y,160+q2y,160+q2y}, 3);
        g.fillPolygon(new int[] {q2x+75, q2x+65,q2x+85}, new int[] {q1y+5,q1y-10,q1y-10}, 3);

    
    }
    
    public void drawState(Graphics g, int x, int y, int stateNum)
    {
        // state with black outline
        g.setColor(Color.BLACK);
        if(stateNum == 4){
            g.drawOval(x+0,y+0,150,150);
        }
        else{
        g.fillOval(x+0,y+0,150,150);
            if(currentState == stateNum){
            g.setColor(Color.GREEN);
        }
            g.setColor(Color.WHITE);
            g.fillOval(x+5,y+5,140,140);  
       }
    }
    
    public void initText(Graphics g){
        //testString if cases
        
        //directed graph labels
        
    }
}