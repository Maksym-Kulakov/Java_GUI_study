import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;  

public class SwingSubThird extends JFrame {
	
	JButton bt;
	
	JButton bt2;
	
	JLabel lb;
	
	JTextField fd; 
	
	
	SwingSubThird(String s) {
		super(s);
		setSize(400, 400);
		setVisible(true); 
		
		bt = new JButton("ok");
		bt.setSize(50,40);
		bt.setBounds(201, 110, 70, 70);
		add(bt);
		
		bt2 = new JButton("cancel");
		bt2.setSize(50,40);
		bt2.setBounds(60, 10, 140, 40);
		add(bt2);
		
		lb = new JLabel("input");
		lb.setSize(60, 90);
		lb.setBounds(160, 110, 140, 40);
		add(lb);
		
		fd = new JTextField(10);
		fd.setSize(60, 20);
		fd.setBounds(110, 110, 40, 40);
		add(fd);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 
		
	}
}
