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
	JButton click;
	GuiDesing()
	{
		setSize(700,700);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		radio = new JRadioButton("IT");
		radio.setBounds(40,10,100,20);
		check = new JCheckBox("Cse");
		check.setBounds(40,40,100,20);
		tf= new JTextField();
		tf.setBounds(40,70,100,20);
		jtb = new JToggleButton();
		jtb.setBounds(40,100,100,20);
		
	
		
		ta =new JTextArea(100,100);
		p1 = new JPanel();
		p1.add(ta);
		
		p2 = new JPanel();
		p3 = new JPanel();
		
		jtp = new JTabbedPane();
		jtp.setBounds(40,120,200,100);
		jtp.add("Main",p1);
		jtp.add("Edit",p2);
		jtp.add("Help",p3);

		
		ta= new JTextArea(100, 100);
		jsp = new JScrollPane(ta);
		jsp.setBounds(40, 220, 100,100);
		jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		String weeks[]= {"Sun","Mon","Tues"};
		jl= new JList(weeks);
		jl.setSelectedIndex(1);
		jl.setBounds(40, 340, 100, 100);
		
		jcb = new JComboBox(weeks);
		jcb.setBounds(40, 430, 100, 100);
		
		jmb = new JMenuBar();
		mainmenu=new JMenu("Menu");  
        submenu=new JMenu("Sub Menu");  
        jmi1=new JMenuItem("Item 1");  
        jmi2=new JMenuItem("Item 2");  
        jmi3=new JMenuItem("Item 3");  
        jmi4=new JMenuItem("Item 4");  
        
        mainmenu.add(jmi1); 
        mainmenu.add(jmi2);
        submenu.add(jmi3);  
        submenu.add(jmi4);  
        mainmenu.add(submenu);  
        
        jmb.add(mainmenu);  
        setJMenuBar(jmb); 

        click = new JButton("Click");
        click.setBounds(40,530,100,20);
        
        l = new JLabel("Message");
        l.setBounds(40,550,100,40);
		
		radio.addItemListener(this);
		jtb.addItemListener(this);
		check.addActionListener(this);

		add(radio);
		add(check);	
		add(tf);
		add(jtb);
		add(jtp);
		add(jsp);
		add(jl);
		add(jcb);
		add(click);
		add(l);		
	}
	
	public void itemStateChanged(ItemEvent e) {
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
	public void actionPerformed(ActionEvent e) {
		
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
