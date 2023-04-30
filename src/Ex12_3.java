//Write a java program to Demonstrate KeyAdapter classes.

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Ex12_3 extends KeyAdapter{
	
	JLabel l;    
    JTextArea area;    
    JFrame f;  
    
    public Ex12_3()
    {
    	l = new JLabel("Started");
    	l.setBounds (20, 300, 200, 20);    
    	area = new JTextArea();
    	area.setBounds (20, 80, 300, 150); 
    	f = new JFrame("Adapter Class");
    	
    	f.add(l);
    	f.add(area);
    	area.addKeyListener(this);

    	
    	f.setSize(300,300);
    	f.setVisible(true);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//f.setLayout(new FlowLayout());
    	f.setLayout(null);
    	
    	
    	
    	
    	
    	
    }
    
    public void keyReleased (KeyEvent e) {    
        String text = area.getText();    
        String words[] = text.split ("\\s");    
        l.setText ("Words: " + words.length + " Characters:" + text.length());    
    } 

    public static void main(String args[])
    {
    	new Ex12_3();
    }
    
}
