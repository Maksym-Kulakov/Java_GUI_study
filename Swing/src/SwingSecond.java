

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
 
 
	
public class SwingSecond extends JFrame {

	static JTextField tf;
	
	public static void main(String[] args) {
		
		SwingSecond awt = new SwingSecond();
		
		JFrame fm = new JFrame();
		
		JScrollPane scrPane = new JScrollPane();
		fm.add(scrPane);
		scrPane.setBounds(150,120,60,30);
		
		JButton bt = new JButton("ok");
		bt.setBounds(50,100,60,30);
		
		JLabel lb = new JLabel("www");
		lb.setBounds(30,30,150,20);
		
//		Checkbox cb = new Checkbox();
//		cb.setBounds(210,50,150,20);
		
//		Canvas can = new Canvas();
//		can.setBackground(Color.BLUE);
//		can.setSize(50, 50);
//		can.setBounds(220,200, 150,20);
		
//		Canvas can2 = new Canvas();
// 		can2.setBackground(Color.YELLOW);
//		can2.setSize(50, 50);
//		can2.setBounds(220,220, 150,20);
		
//		MyCanvas mc = new MyCanvas();
//		mc.setBounds(100, 200, 100, 100);
//		mc.setBackground(Color.blue);
		
		tf = new JTextField();
		tf.setBounds(50,50, 150,20);
		
		
		JList ls = new JList ();
		ls.setBounds(220,150, 150,20);
			
		fm.add(bt);
 		fm.add(tf);
 		fm.add(lb);
//		fm.add(cb);
 		fm.add(ls);
//		fm.add(can);
//		fm.add(can2);
//		fm.add(mc);
		
		fm.setSize(400, 400);
		fm.setLayout(null);
		fm.setVisible(true);
		
//		bt.addActionListener(awt);
//		fm.addWindowListener(awt);
		
	}
	
	
	
}
