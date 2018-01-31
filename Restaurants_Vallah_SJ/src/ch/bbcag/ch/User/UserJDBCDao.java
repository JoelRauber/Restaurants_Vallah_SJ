package ch.bbcag.ch.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserJDBCDao implements UserDao {
	
	private Connection con = null;
	
	public UserJDBCDao(Connection connection) {
		con = connection;
	}
	
	public List<User> getAllUsers(){
		try {
			List<User> users = new ArrayList<User>();
			User u = null;
			String sql = "SELECT * from user";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setVorname(rs.getString("vorname"));
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("passwort"));
				users.add(u);
			}
			return users;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
		}
	}

