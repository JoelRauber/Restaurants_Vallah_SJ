package ch.bbcag.ch.User;

import java.sql.Connection;

import ch.bbcag.ch.ConnectionFactory;

public class UserView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User();
		Connection con = ConnectionFactory.getInstance().getConnection();
		UserDao ud = new UserJDBCDao(con);
		
		
//		u.setName("Meier");
//		u.setVorname("Ben");
//		u.setEmail("ben@gmx.ch");
//		u.setUsername("BenMeier");
//		u.setPassword("BenMeier");
//		ud.insertUser(u);
		
		
		for (User user : ud.getAllUsers()) {
			System.out.println(user.toString());
		}
		// ConnectionFactory.getInstance().closeConnection();
		
	}

}
