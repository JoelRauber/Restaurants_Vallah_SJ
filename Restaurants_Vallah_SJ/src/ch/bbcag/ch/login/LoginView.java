package ch.bbcag.ch.login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ch.bbcag.ch.ConnectionFactory;
import ch.bbcag.ch.GUI.MainGUI;
import ch.bbcag.ch.User.*;

public class LoginView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame f = new JFrame("Login");
		JTextField userName = new JTextField();
		JPasswordField password = new JPasswordField();
		JLabel lPassword = new JLabel("Password: ");  
		JLabel lUserName = new JLabel("Username: ");
		JTextField fehler = new JTextField();
		JLabel title = new JLabel("Login");
		JButton senden = new JButton("Senden");
		User u = new User();
		Connection con = ConnectionFactory.getInstance().getConnection();
		UserDao ud = new UserJDBCDao(con);

		title.setFont(new Font("Arial", Font.BOLD, 40));
		userName.setBounds(130, 120, 200, 30);
		password.setBounds(130, 170, 200, 30);
		lUserName.setBounds(50, 120, 200, 30);
		lPassword.setBounds(50, 170, 200, 30);
		title.setBounds(130, 10, 200, 100);
		senden.setBounds(130, 220, 200, 30);
		fehler.setBounds(130, 270, 200, 30);
		fehler.setBorder(null);
		fehler.setBackground(new Color(238, 238, 238));
		fehler.setEditable(false);
		fehler.setForeground(Color.red);
		senden.setBackground(Color.gray);

		senden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (User user : ud.getAllUsers()) {

					if (userName.getText().equals(user.getUsername())) {
						System.out.println(user.getPassword().trim());
						System.out.println(password.getPassword());
						System.out.println(user.getPassword().trim().length());
						System.out.println(password.getPassword().length);
						char[] formPassword = password.getPassword();
						String dbPassword = user.getPassword().trim();
						if (dbPassword.equals(new String(formPassword))) {
							MainGUI main = new MainGUI();
							main.setSize(1600, 800);
							main.setVisible(true);
						} else {
							fehler.setText("Falsches Passwort");
						}
					} else {
						fehler.setText("Falscher User");

					}

					ConnectionFactory.getInstance().closeConnection();
				}
			}
		});

		f.add(lUserName);
		f.add(lPassword);
		f.add(userName);
		f.add(password);
		f.add(title);
		f.add(senden);

		f.add(fehler);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

	public LoginView() {

	}
}
