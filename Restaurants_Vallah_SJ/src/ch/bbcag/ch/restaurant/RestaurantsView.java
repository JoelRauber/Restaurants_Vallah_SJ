package ch.bbcag.ch.restaurant;

import java.sql.Connection;

import ch.bbcag.ch.ConnectionFactory;

public class RestaurantsView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant u = new Restaurant();
		Connection con = ConnectionFactory.getInstance().getConnection();
		RestaurantDao ud = new RestaurantsJDBCDao(con);

//		for (Restaurant restaurant : ud.getAllRestaurants()) {
//			System.out.println(restaurant.toString());
//		}
		
		for (Restaurant res : ud.getAllBySearch("a")) {
			System.out.println(res.toString());
		}
		
		// ConnectionFactory.getInstance().closeConnection();
		
	}

}
