package ch.bbcag.ch.GUI;


import java.sql.Connection;

import ch.bbcag.ch.ConnectionFactory;
import ch.bbcag.ch.restaurants.Restaurants;
import ch.bbcag.ch.restaurants.RestaurantsDao;

public class AsiatischView {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Restaurants u = new Restaurants();
			Connection con = ConnectionFactory.getInstance().getConnection();
			RestaurantsDao ud = new Afrikanisch(con);

			for (Restaurants restaurant : ud.getAllAfrikanisch()) {
				System.out.println(restaurant.toString());
			}
			
			// ConnectionFactory.getInstance().closeConnection();
			
		}

	}

