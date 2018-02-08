package ch.bbcag.ch.GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch.bbcag.ch.restaurants.Restaurants;
import ch.bbcag.ch.restaurants.RestaurantsDao;

public class Spanisch implements RestaurantsDao {

	private Connection con = null;

	public Spanisch(Connection connection) {
		con = connection;
	}

	@Override
	public List<Restaurants> getAllSpanisch() {
		ResultSet rs;
		try {
			List<Restaurants> restaurants = new ArrayList<Restaurants>();
			Restaurants u = null;
			String sql = "select r.*, a.* from restaurant as r, adresse as a\r\n"
					+ "where r.adresse_id = a.id and typ = \"spanisch\";";
			PreparedStatement ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				u = new Restaurants();
				u.setId(rs.getInt("id"));
				u.setRestaurants(rs.getString("name"));
				u.setBeschreibung(rs.getString("beschreibung"));
				u.setLink(rs.getString("link"));
				u.setNummer(rs.getString("nummer"));
				u.setKommentar(rs.getString("kommentar"));
				u.setBewertung(rs.getString("bewertung"));
				u.setTyp(rs.getString("typ"));
				u.setStrasse(rs.getString("strasse"));
				u.setHnummer(rs.getString("hnummer"));
				u.setOrt(rs.getString("ort"));
				u.setLand(rs.getString("land"));
				restaurants.add(u);
			}
			rs.close();
			con.close();
			return restaurants;
		} catch (SQLException ex) {
		}
		return null;
	}

	@Override
	public List<Restaurants> getAllRestaurants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurants> getAllAmerikanisch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurants> getAllAfrikanisch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurants> getAllTuerkisch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurants> getAllIndisch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurants> getAllItalienisch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurants> getAllSchweizerisch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurants> getAllMexikanisch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurants> getAllFranzoesisch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurants> getAllAsiatisch() {
		// TODO Auto-generated method stub
		return null;
	}

}
