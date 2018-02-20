package ch.bbcag.ch.restaurant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RestaurantsJDBCDao implements RestaurantDao {

	private Connection con = null;

	public RestaurantsJDBCDao(Connection connection) {
		con = connection;
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		ResultSet rs;
		try {
			List<Restaurant> restaurants = new ArrayList<Restaurant>();
			Restaurant u = null;
			String sql = "select r.*, a.* from restaurant as r, adresse as a where r.adresse_id = a.id";
			PreparedStatement ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				u = new Restaurant();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setBeschreibung(rs.getString("beschreibung"));
				u.setLink(rs.getString("link"));
				u.setNummer(rs.getString("nummer"));
				u.setKommentar(rs.getString("kommentar"));
				u.setBewertung(rs.getString("bewertung"));
				u.setTyp(RestaurantType.valueOf(rs.getString("typ").toUpperCase()));
				u.setStrasse(rs.getString("strasse"));
				u.setHnummer(rs.getString("hnummer"));
				u.setOrt(rs.getString("ort"));
				u.setLand(rs.getString("land"));
				restaurants.add(u);
			}
			if (rs != null) {
				rs.close();
			}
			if (con != null) {
				con.close();
			}
			return restaurants;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public List<Restaurant> getAllByType(String restaurantType) {
		ResultSet rs;
		try {
			List<Restaurant> restaurants = new ArrayList<Restaurant>();
			Restaurant u = null;
			String sql = "select r.*, a.* from restaurant as r, adresse as a where r.adresse_id = a.id and r.typ = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, restaurantType);
			rs = ps.executeQuery();

			while (rs.next()) {
				u = new Restaurant();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setBeschreibung(rs.getString("beschreibung"));
				u.setLink(rs.getString("link"));
				u.setNummer(rs.getString("nummer"));
				u.setKommentar(rs.getString("kommentar"));
				u.setBewertung(rs.getString("bewertung"));
				u.setTyp(RestaurantType.valueOf(rs.getString("typ")));
				u.setStrasse(rs.getString("strasse"));
				u.setHnummer(rs.getString("hnummer"));
				u.setOrt(rs.getString("ort"));
				u.setLand(rs.getString("land"));
				restaurants.add(u);
			}
			rs.close();
//			con.close();
			return restaurants;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	public List<Restaurant> getAllBySearch(String restaurantSearch) {
		ResultSet rs;
		if (restaurantSearch == null) {
			System.out.println("Fehler");
		} else {
			try {
				List<Restaurant> restaurants = new ArrayList<Restaurant>();
				Restaurant u = null;
				String sql = "select r.*, a.* from restaurant as r, adresse as a\r\n"
						+ "where r.name like \"%?%\" and r.adresse_id = a.id;";
//				if(con != null) {
//					System.out.println("true");
//				}
				PreparedStatement ps = con.prepareStatement(sql);
				System.out.println("Test");
				ps.setString(1, restaurantSearch);
				System.out.println("test");
				rs = ps.executeQuery();

				while (rs.next()) {
					u = new Restaurant();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setBeschreibung(rs.getString("beschreibung"));
					u.setLink(rs.getString("link"));
					u.setNummer(rs.getString("nummer"));
					u.setKommentar(rs.getString("kommentar"));
					u.setBewertung(rs.getString("bewertung"));
					u.setTyp(RestaurantType.valueOf(rs.getString("typ")));
					u.setStrasse(rs.getString("strasse"));
					u.setHnummer(rs.getString("hnummer"));
					u.setOrt(rs.getString("ort"));
					u.setLand(rs.getString("land"));
					restaurants.add(u);
				}
				if (rs != null) {
					rs.close();
				}
				if (con != null) {
					con.close();
				}
				return restaurants;
			} catch (SQLException ex) {
				return null;
			}
		}
	return null;
	}
}
