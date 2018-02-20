package ch.bbcag.ch.restaurant;

import java.util.List;

public interface RestaurantDao {
	public abstract List<Restaurant> getAllRestaurants();
	public abstract List<Restaurant> getAllByType(String restaurantType);
	public abstract List<Restaurant> getAllBySearch(String restaurantSearch);
	
}
