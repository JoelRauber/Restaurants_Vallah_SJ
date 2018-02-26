package ch.bbcag.ch.view;

import java.sql.Connection;

import ch.bbcag.ch.model.Restaurant;
import ch.bbcag.ch.persistance.ConnectionFactory;
import ch.bbcag.ch.persistance.RestaurantDao;
import ch.bbcag.ch.persistance.RestaurantJDBCDao;

public class RestaurantsView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant u = new Restaurant();
		Connection con = ConnectionFactory.getInstance().getConnection();
		RestaurantDao ud = new RestaurantJDBCDao(con);

//		for (Restaurant restaurant : ud.getAllRestaurants()) {
//			System.out.println(restaurant.toString());
//		}
		
		for (Restaurant res : ud.getAllBySearch("a")) {
			System.out.println(res.toString());
		}
		
		// ConnectionFactory.getInstance().closeConnection();
		
	}

}
