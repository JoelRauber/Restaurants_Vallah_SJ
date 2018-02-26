package ch.bbcag.ch.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ch.bbcag.ch.controller.RegisterController;
import ch.bbcag.ch.model.User;

public class RegisterView extends JFrame {

	private static final long serialVersionUID = 1L;
	private final RegisterController REGISTER_CONTROLLER = RegisterController.getRegisterController();

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

	private JButton zurueck;

	public static void main(String[] args) {
		RegisterView register = new RegisterView();
		register.setSize(410, 550);
		register.setVisible(false);
	}

	public RegisterView() {

		this.setTitle("Registrieren");
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
						MainView main = new MainView();
						main.setSize(1600, 800);
						main.setVisible(true);
						setVisible(false);
						User u = new User();
						u.setName(nachname.getText());
						u.setVorname(vorname.getText());
						u.setEmail(email.getText());
						u.setUsername(userName.getText());
						u.setPassword(new String(password.getPassword()));
						REGISTER_CONTROLLER.verifyRegister(u);
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
				setVisible(false);
			}
		});

		this.add(lUserName);
		this.add(lPassword);
		this.add(lVorname);
		this.add(lNachname);
		this.add(lEMail);

		this.add(userName);
		this.add(password);
		this.add(vorname);
		this.add(nachname);
		this.add(email);

		this.add(title);
		this.add(senden);
		this.add(zurueck);

		this.add(fehler);

		this.setSize(410, 550);
		this.setLayout(null);
		this.setVisible(true);

	}
}
