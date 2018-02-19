package ch.bbcag.ch.user;

import java.util.List;

public interface UserDao {
	public abstract List<User> getAllUsers();

	public abstract void insertUser(User u);
}
