package ch.bbcag.ch.restaurants;

import java.util.List;

public interface RestaurantsDao {
	public abstract List<Restaurants> getAllRestaurants();
	public abstract List<Restaurants> getAllAsiatisch();
}
