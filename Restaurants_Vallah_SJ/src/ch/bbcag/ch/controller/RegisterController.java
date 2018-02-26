package ch.bbcag.ch.controller;

import java.sql.Connection;

import ch.bbcag.ch.model.User;
import ch.bbcag.ch.persistance.ConnectionFactory;
import ch.bbcag.ch.persistance.UserDao;
import ch.bbcag.ch.persistance.UserJDBCDao;

public class RegisterController {
	private static final RegisterController REGISTER_CONTROLLER = new RegisterController();

	private Connection con;
	private UserDao ud;

	private RegisterController() {
		con = ConnectionFactory.getInstance().getConnection();
		ud = new UserJDBCDao(con);
	}

	public static RegisterController getRegisterController() {
		return RegisterController.REGISTER_CONTROLLER;
	}

	public static void closeDbConnection() {
		ConnectionFactory.getInstance().closeConnection();

	}

	public boolean verifyRegister(User user) {

		if (user.getPassword().equals("") == false) {
			if (user.getUsername().equals("") == false) {
				registerUser(user);
				return true;
			} else
				return false;
		}
		return false;
	}

	private void registerUser(User user) {
		ud.insertUser(user);
//		ConnectionFactory.getInstance().closeConnection();
	}

}
