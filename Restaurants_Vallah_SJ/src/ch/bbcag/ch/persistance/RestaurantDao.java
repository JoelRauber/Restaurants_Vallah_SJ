package ch.bbcag.ch.persistance;

import java.util.List;

import ch.bbcag.ch.model.Restaurant;

public interface RestaurantDao {
	public abstract List<Restaurant> getAllRestaurants();
	public abstract List<Restaurant> getAllByType(String restaurantType);
	public abstract List<Restaurant> getAllBySearch(String restaurantSearch);
	
}
