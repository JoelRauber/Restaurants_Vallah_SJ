package ch.bbcag.ch.restaurants;

import java.sql.Connection;

import ch.bbcag.ch.ConnectionFactory;

public class RestaurantsView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurants u = new Restaurants();
		Connection con = ConnectionFactory.getInstance().getConnection();
		RestaurantsDao ud = new RestaurantsJDBCDao(con);

		for (Restaurants restaurant : ud.getAllRestaurants()) {
			System.out.println(restaurant.toString());
		}
		
		// ConnectionFactory.getInstance().closeConnection();
		
	}

}
