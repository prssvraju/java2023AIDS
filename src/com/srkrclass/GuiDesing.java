package com.srkrclass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiDesing extends JFrame implements ActionListener,ItemListener{

	JRadioButton radio;
	JCheckBox check;
	JLabel l;
	JTextField tf;
	JToggleButton jtb;
	JTabbedPane jtp;
	JPanel p1,p2,p3;
	JTextArea ta;
	JScrollPane jsp;
	JList jl;
	JComboBox jcb;
	JMenuBar jmb;
	JMenu mainmenu;
	JMenu submenu;
	JMenuItem jmi1,jmi2,jmi3,jmi4;
	
	GuiDesing()
	{
		radio = new JRadioButton("IT");
		radio.setBounds(40,10,100,20);
		check = new JCheckBox("Cse");
		check.setBounds(40,40,100,20);
		tf= new JTextField();
		tf.setBounds(40,70,100,20);
		jtb = new JToggleButton();
		jtb.setBounds(40,100,100,20);
		
	
		
//		ta =new JTextArea(100,100);
//		p1 = new JPanel();
//		p1.add(ta);
//		
//		p2 = new JPanel();
//		p3 = new JPanel();
//		
//		jtp = new JTabbedPane();
//		jtp.setBounds(40,120,200,200);
//		jtp.add("Main",p1);
//		jtp.add("Edit",p2);
//		jtp.add("Help",p3);
		
		l = new JLabel("Message");
		l.setBounds(40, 320, 100,20);
		
		
		ta= new JTextArea(100, 100);
		jsp = new JScrollPane(ta);
		jsp.setBounds(40, 150, 100,100);
		jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		String weeks[]= {"Sun","Mon","Tues"};
		jl= new JList(weeks);
		jl.setSelectedIndex(1);
		jl.setBounds(40, 260, 100, 100);
		
		jcb = new JComboBox(weeks);
		jcb.setBounds(40, 330, 100, 100);
		
		
		jmb = new JMenuBar();
		
		

		
		

		
		radio.addItemListener(this);
		check.addActionListener(this);
		jtb.addItemListener(this);


		add(radio);
		add(check);	
		add(tf);
		add(jtb);
		add(jsp);
		add(jl);
		add(jcb);
		add(l);
		
		
		
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == radio)
		{
			if(radio.isSelected())
			{
				l.setText("It is selected");
			}
			else
			{
				l.setText("It is Not selected");
			}
		}
		if(e.getSource() == jtb)
		{
			if(jtb.isSelected())
			{
				jtb.setText("On");
			}
			else
			{
				jtb.setText("Off");
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(check.isSelected())
		{
			l.setText("Cse is selected");
		}
		else
		{
			l.setText("Cse is Not selected");
		}
		
	}
	public static void main(String args[])
	{
		new GuiDesing();
	}

}
