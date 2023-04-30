//Write a Java program to create radio buttons(male & female) perform event handling to display
//relevant text when radio button selected and button press is performed.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex12_2 implements ActionListener{
	
	JFrame f;
	JRadioButton rb1,rb2;
	ButtonGroup bg;
	JButton bt;
	JLabel status;
	
	public Ex12_2()
	{
		f = new JFrame("Radio Button");
		rb1 = new JRadioButton("Male");
		rb2 = new JRadioButton("Female");
		status = new JLabel("Started");
		status.setBounds(150, 150, 100, 50);
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bt = new JButton("Click");
		bt.addActionListener(this);
		
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setLayout(new FlowLayout());
		f.add(status);
		f.add(rb1);
		f.add(rb2);
		f.add(bt);
		
		

		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(rb1.isSelected())
		{
			status.setText("Selcted is Male");
			JOptionPane.showMessageDialog(null, "Selcted is Male");    
		}
		if(rb2.isSelected())
		{
			status.setText("Selcted is Female");
			//JOptionPane.showMessageDialog(null, "Selcted is Female");    
		}
		
	}
	
	public static void main(String args[])
	{
		Ex12_2 obj = new Ex12_2();
	}

	

}
