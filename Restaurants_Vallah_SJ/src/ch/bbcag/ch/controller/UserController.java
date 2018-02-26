package ch.bbcag.ch.controller;

import java.sql.Connection;

import ch.bbcag.ch.model.User;
import ch.bbcag.ch.persistance.ConnectionFactory;
import ch.bbcag.ch.persistance.UserDao;
import ch.bbcag.ch.persistance.UserJDBCDao;

public class UserController {
	private static final UserController USER_CONTROLLER = new UserController();

	private Connection con;
	private UserDao ud;

	private UserController() {
		con = ConnectionFactory.getInstance().getConnection();
		ud = new UserJDBCDao(con);
	}

	public static UserController getUserController() {
		return UserController.USER_CONTROLLER;
	}
	
	public static void closeDbConnetion() {
		ConnectionFactory.getInstance().closeConnection();
	}

	public boolean verifyLogin(String userName, String password) {
		for (User user : ud.getAllUsers()) {
			if (userName.equals(user.getUsername())) {
				String dbPassword = user.getPassword().trim();
				if (dbPassword.equals(password)) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}
}
