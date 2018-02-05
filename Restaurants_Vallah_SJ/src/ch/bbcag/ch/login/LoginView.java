package ch.bbcag.ch.login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Login");
		JTextField userName = new JTextField();
		JPasswordField password = new JPasswordField();
		JLabel lPassword = new JLabel("Password: ");
		JLabel lUserName = new JLabel("Username: ");
		JTextField test = new JTextField();
		JLabel title = new JLabel("Login");
		JButton senden = new JButton("Senden");
		
		title.setFont(new Font("Arial", Font.BOLD, 40));
		userName.setBounds(130, 120, 200, 30);
		password.setBounds(130, 170, 200, 30);
		lUserName.setBounds(50, 120, 200, 30);
		lPassword.setBounds(50, 170, 200, 30);
		title.setBounds(130, 10, 200, 100);
		senden.setBounds(130, 220, 200, 30);
		senden.setBackground(Color.gray);
		
		senden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test.setText(" " + userName.getText());
			}
		});
		test.setBounds(10, 10, 200, 20);
		
		
		f.add(lUserName);
		f.add(lPassword);
		f.add(userName);
		f.add(password);
		f.add(title);
		f.add(senden);
		
		f.add(test);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public LoginView() {
		
	}
}
