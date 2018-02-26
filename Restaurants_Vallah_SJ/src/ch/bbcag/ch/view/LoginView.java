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

import ch.bbcag.ch.controller.UserController;
import ch.bbcag.ch.model.User;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;

	private final UserController USER_CONTROLLER = UserController.getUserController();

	private JTextField userName;
	private JPasswordField password;
	private JLabel lPassword;
	private JLabel lUserName;
	private JTextField fehler;
	private JLabel title;
	private JButton senden;
	private JButton registrieren;
	private User u;

	public static void main(String[] args) {
		LoginView login = new LoginView();
		login.setSize(400, 400);
		login.setVisible(true);
	}

	public LoginView() {
		setTitle("Login");
		userName = new JTextField("FritzMeier");
		password = new JPasswordField("Fmeier");
		lPassword = new JLabel("Passwort: ");
		lUserName = new JLabel("Username: ");
		fehler = new JTextField();
		title = new JLabel("Login");
		senden = new JButton("Login");
		registrieren = new JButton("Registrieren");

		title.setFont(new Font("Arial", Font.BOLD, 40));
		userName.setBounds(130, 120, 200, 30);
		password.setBounds(130, 170, 200, 30);
		lUserName.setBounds(50, 120, 200, 30);
		lPassword.setBounds(50, 170, 200, 30);
		title.setBounds(50, 10, 200, 100);
		senden.setBounds(130, 220, 200, 30);
		registrieren.setBounds(130, 270, 200, 30);
		fehler.setBounds(130, 310, 200, 30);

		fehler.setBorder(null);
		fehler.setBackground(new Color(238, 238, 238));
		fehler.setEditable(false);
		fehler.setForeground(Color.red);
		senden.setBackground(Color.gray);
		registrieren.setBackground(Color.gray);

		senden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (USER_CONTROLLER.verifyLogin(userName.getText(), new String(password.getPassword()))) {
					MainView main = new MainView();
					main.setSize(1600, 800);
					main.setVisible(true);
					setVisible(false);
				} else {
					fehler.setText("Falscher Benutzername oder falsches Passwort!");
					System.err.println("Falscher Benutzername oder falsches Passwort!");
				}
			}
		});

		registrieren.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
//				ConnectionFactory.getInstance().closeConnection();
				RegisterView register = new RegisterView();
				register.setSize(410, 550);
				register.setVisible(true);
				setVisible(false);
			}
		});
		
		add(lUserName);
		add(lPassword);
		add(userName);
		add(password);
		add(title);
		add(senden);
		add(registrieren);

		add(fehler);

		setSize(400, 400);
		setLayout(null);
		setVisible(true);

	}
}
