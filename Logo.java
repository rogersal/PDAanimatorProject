// needed for doing graphics
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
* @author -Alex Rogers
* Test strings are (ABBBBA, ABAABA, ABABBB)
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
    
    static int framex = 900;
    static int framey = 700;

    public static void main(String[] args)
    {
        //Create a window frame
        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(framex,framey);

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
        initPaint(g,4,testString);
       
        
        
        int x = 0; 
        int stateNum = 0;
        //TODO: while loop to change jframe
        /*
        while(x ==0){
            boolean goForward = false;
            boolean goBackwards = false;
            
            
            initPaint(g,stateNum,testString);
            if(testString == 1){}
            if(testString == 2){}
            if(testString == 3){}
        }
        */
    }
    public void initPaint(Graphics g,int stateNum, int stringNum){
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

    
        initText(g);
    }
    
    public void drawState(Graphics g, int x, int y, int stateNum)
    {
        // state with black outline
        g.setColor(Color.BLACK);
        if(stateNum ==4){
            g.drawOval(x+0,y+0,150,150);
        }
        else{
            g.fillOval(x+0,y+0,150,150);
            if(currentState == stateNum && stateNum != 4){
            g.setColor(Color.GREEN);
            }
            else{
            g.setColor(Color.WHITE);
            } 
        
            g.fillOval(x+5,y+5,140,140);  
        }
    }
    
    public void initText(Graphics g){
        //testString if cases, ex. Test strings are (ABBBBA, ABAABA, ABABBB)
        int stringLabelY = 50;
        if(testString == 1){
            g.drawString("A B B B B A", 400, stringLabelY);
        }
        if(testString == 2){
            g.drawString("A B A A B A", 400, stringLabelY);
        }
        if(testString == 3){
            g.drawString("A B A B B B", 400, stringLabelY);
        }
        //directed graph labels
        g.drawString("ε,ε->$", 400, q0y + 50);
        g.drawString("0, ε->0 ", q1x +250, q0y);
        g.drawString(" 1,ε->1", q1x +250, q0y+ 15);
        g.drawString(" ε,ε->ε", q1x +100, framey/2);
        g.drawString("0, 0->ε", q1x +250, q2y + 150);
        g.drawString("1,1->ε", q1x +250, q2y+ 165);
        g.drawString("ε,$->ε", 400, q3y + 50);
    }
    public void initStack(Graphics g,String currentStack){
        //initializes stack graphic
        
    
    }
}