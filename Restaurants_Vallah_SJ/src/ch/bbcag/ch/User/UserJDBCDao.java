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

	public List<User> getAllUsers() {
		ResultSet rs;
		try {
			List<User> users = new ArrayList<User>();
			User u = null;
			String sql = "SELECT * from user";
			PreparedStatement ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

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
			if (rs != null) {
				rs.close();
			}
			if (con != null) {
				con.close();
			}
			return users;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	public void insertUser(User u) {
		try {
			String sql = "INSERT INTO user(vorname, name, eMail, userName, passwort) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, u.getVorname());
			ps.setString(2, u.getName());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getUsername());
			ps.setString(5, u.getPassword());

			ps.executeUpdate();
		} catch (SQLException ex) {
		}
	}
}
