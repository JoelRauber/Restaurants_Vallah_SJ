package ch.bbcag.ch.login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ch.bbcag.ch.ConnectionFactory;
import ch.bbcag.ch.gui.MainGUI;
import ch.bbcag.ch.user.*;

public class RegisterView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JFrame f;
	private static JTextField userName;
	private static JTextField vorname;
	private static JTextField nachname;
	private static JTextField email;

	private static JPasswordField password;

	private JLabel lPassword;
	private JLabel lUserName;
	private JLabel lVorname;
	private JLabel lNachname;
	private JLabel lEMail;
	private JTextField fehler;
	private JLabel title;

	private JButton senden;
	
	public static void insert() {
		User u = new User();
		Connection con = ConnectionFactory.getInstance().getConnection();
		UserDao ud = new UserJDBCDao(con);
		
		u.setName(nachname.getText());
		u.setVorname(vorname.getText());
		u.setEmail(email.getText());
		u.setUsername(userName.getText());
		u.setPassword(new String(password.getPassword()));
		ud.insertUser(u);
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		u.setName("Meier");
//		u.setVorname("Ben");
//		u.setEmail("ben@gmx.ch");
//		u.setUsername("BenMeier");
//		u.setPassword("BenMeier");
//		ud.insertUser(u);
	}
	private JButton zurueck;

	public static void main(String[] args) {
		RegisterView register = new RegisterView();
		register.setSize(410, 550);
		register.setVisible(false);
	}

	public RegisterView() {

		f = new JFrame("Registrieren");
		userName = new JTextField();
		vorname = new JTextField();
		nachname = new JTextField();
		email = new JTextField();

		password = new JPasswordField();

		lPassword = new JLabel("Passwort*: ");
		lUserName = new JLabel("Username*: ");
		lVorname = new JLabel("Vorname: ");
		lNachname = new JLabel("Nachname: ");
		lEMail = new JLabel("E-Mail: ");
		fehler = new JTextField();
		title = new JLabel("Registrieren");

		senden = new JButton("Senden");
		zurueck = new JButton("Zurueck");

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
		zurueck.setBackground(Color.gray);
		zurueck.setBounds(130, 420, 200, 30);

		senden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(new String(password.getPassword()).equals(""));
				System.out.println(userName.getText().equals("") == false);
				if (new String(password.getPassword()).equals("") == false) {
					if (userName.getText().equals("") == false) {
						MainGUI main = new MainGUI();
						main.setSize(1600, 800);
						main.setVisible(true);
						f.setVisible(false);
						insert();
					} else {
						fehler.setText("Mit Sterne bitte ausfüllen");
					}
				} else {
					fehler.setText("Mit Sterne bitte ausfüllen");
				}
			}
		});

		zurueck.addActionListener(new ActionListener() {
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
		f.add(zurueck);

		f.add(fehler);

		f.setSize(410, 550);
		f.setLayout(null);
		f.setVisible(true);

	}
}
