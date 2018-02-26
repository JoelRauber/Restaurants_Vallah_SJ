package ch.bbcag.ch.controller;

import java.sql.Connection;
import java.util.List;

import ch.bbcag.ch.model.Restaurant;
import ch.bbcag.ch.persistance.ConnectionFactory;
import ch.bbcag.ch.persistance.RestaurantDao;
import ch.bbcag.ch.persistance.RestaurantJDBCDao;

public class RestaurantController {
	private static final RestaurantController RESTAURANT_CONTROLLER = new RestaurantController();

	private Connection con;
	private RestaurantDao rd;
	
	
	private RestaurantController() {
		con = ConnectionFactory.getInstance().getConnection();
		rd = new RestaurantJDBCDao(con);
	}

	public static RestaurantController getRestaurantController() {
		return RestaurantController.RESTAURANT_CONTROLLER;
	}
	
	public static void closeDbConnetion() {
		ConnectionFactory.getInstance().closeConnection();
	}
	
	public List<Restaurant> getAllRestaurants() {
		return rd.getAllRestaurants();
	}
	
	
	public List<Restaurant> getAllBySearch(String suchen) {
		return rd.getAllBySearch(suchen);
	}
	
}
