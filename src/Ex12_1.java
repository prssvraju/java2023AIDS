//Write a JAVA program that display the x and y position of the cursor movement usingMouse.


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Ex12_1 implements MouseMotionListener
{
    JFrame f;
    JLabel status;

    Ex12_1()
    {
        f = new JFrame();
        status = new JLabel("Started");
        
        f.setLayout(new FlowLayout());
        f.add(status);
        f.addMouseMotionListener(this);

        f.setSize(400,400);
        f.setVisible(true);
    }
    public void mouseDragged(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        status.setText("Moved"+" at "+x+","+y+"\n");
    }
    public void mouseMoved(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        status.setText("Moved"+" at "+x+","+y+"\n");
    }
    public static void main(String [] args)
    {
    	Ex12_1 x = new Ex12_1();
    }
}
