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

public class RegisterView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame f = new JFrame("Registrieren");
		JTextField userName = new JTextField();
		JTextField vorname = new JTextField();
		JTextField nachname = new JTextField();
		JTextField email = new JTextField();
		
		JPasswordField password = new JPasswordField();
		
		JLabel lPassword = new JLabel("Passwort: ");  
		JLabel lUserName = new JLabel("Username: ");
		JLabel lVorname = new JLabel("Vorname: ");  
		JLabel lNachname = new JLabel("Nachname: ");
		JLabel lEMail = new JLabel("E-Mail: ");  
		JTextField fehler = new JTextField();
		JLabel title = new JLabel("Registrieren");
		JButton senden = new JButton("Senden");
		JButton zurück = new JButton("Zurueck");
		User u = new User();
//		Connection con = ConnectionFactory.getInstance().getConnection();
//		UserDao ud = new UserJDBCDao(con);

		title.setFont(new Font("Arial", Font.BOLD, 40));
		
		lUserName.setBounds(50, 270, 200, 30);
		userName.setBounds(130, 270, 200, 30);
		
		lPassword.setBounds(50, 320, 200, 30);
		password.setBounds(130, 320, 200, 30);
		
		lVorname.setBounds(50, 120, 200, 30);
		vorname.setBounds(130, 120, 200, 30);
		
		lNachname.setBounds(50, 170, 200, 30);
		nachname.setBounds(130, 170, 200, 30);
		
		lEMail.setBounds(50, 220, 200, 30);
		email.setBounds(130, 220, 200, 30);
		
		title.setBounds(50, 10, 400, 100);
		senden.setBounds(130, 370, 200, 30);
		fehler.setBounds(130, 470, 200, 30);
		fehler.setBorder(null);
		fehler.setBackground(new Color(238, 238, 238));
		fehler.setEditable(false);
		fehler.setForeground(Color.red);
		senden.setBackground(Color.gray);
		zurück.setBackground(Color.gray);
		zurück.setBounds(130, 420, 200, 30);

		senden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							MainGUI main = new MainGUI();
							main.setSize(1600, 800);
							main.setVisible(true);
							f.setVisible(false);
				}
			});
		
		zurück.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							LoginView login = new LoginView();
							login.setSize(400, 400);
							login.setVisible(true);
							f.setVisible(false);
				}
			});

		f.add(lUserName);
		f.add(lPassword);
		f.add(lVorname);
		f.add(lNachname);
		f.add(lEMail);
		
		f.add(userName);
		f.add(password);
		f.add(vorname);
		f.add(nachname);
		f.add(email);
		
		f.add(title);
		f.add(senden);
		f.add(zurück);

		f.add(fehler);

		f.setSize(410, 510);
		f.setLayout(null);
		f.setVisible(true);

	}
}
