import java.awt.FlowLayout;

import javax.swing.JScrollPane;  

public class SwingThird {
		
	public static void main(String[] args) {
		
		SwingSubThird some = new SwingSubThird("window");
		
		JScrollPane scr = new JScrollPane();
		
		some.setLayout(null);
		some.add(scr);
		scr.setBounds(100, 100, 100, 100);
 
		
		
//		JFrame jf = new JFrame("some");
//		jf.setSize(200, 200);
//		jf.setVisible(true);
		 
		
	}
}


