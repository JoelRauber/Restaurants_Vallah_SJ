package ch.bbcag.ch.persistance;

import java.util.List;

import ch.bbcag.ch.model.User;

public interface UserDao {
	public abstract List<User> getAllUsers();

	public abstract void insertUser(User u);
}
