package ch.bbcag.ch.controller;


import java.awt.event.ActionEvent;
import java.sql.Connection;

import ch.bbcag.ch.persistance.ConnectionFactory;
import ch.bbcag.ch.persistance.RestaurantJDBCDao;
import ch.bbcag.ch.persistance.UserDao;
import ch.bbcag.ch.persistance.UserJDBCDao;
import ch.bbcag.ch.view.MainView;
import ch.bbcag.ch.view.RegisterView;

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
	
	
	public boolean verifyRegister(String userName, String password) {
	
		if (password.equals("") == false) {
			if (userName.equals("") == false) {
				RegisterView.insert();
				return true;
		}else
			return false;
	}
		return false;
	}
}


