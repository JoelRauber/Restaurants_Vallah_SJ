package ch.bbcag.ch.GUI;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class test extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		JFrame testWindow = new JFrame("Window");
		JTextField field = new JTextField("Help");
		
		testWindow.setSize(200, 200);
		testWindow.setVisible(true);
		
		testWindow.add(field);
		
		field.addActionListener(new ActionListener(){
			
		}
		

	}
	
	public test() {
		
		
		
	}
	
	

}
