import javax.swing.*;  

public class SwingFirst extends JFrame {  
	
	public static void main(String[] args) {
	
	JFrame fm = new JFrame();//creating instance of JFrame  
          
	JButton bt = new JButton("click");//creating instance of JButton  
	bt.setBounds(130,100,100, 40);//x axis, y axis, width, height  
          
	fm.add(bt);//adding button in JFrame  
          
	fm.setSize(400,500);//400 width and 500 height  
	fm.setLayout(null);//using no layout managers  
	fm.setVisible(true);//making the frame visible  
	}  
}  