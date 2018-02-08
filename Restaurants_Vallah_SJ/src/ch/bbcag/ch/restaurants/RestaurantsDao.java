package ch.bbcag.ch.restaurants;

import java.util.List;

public interface RestaurantsDao {
	public abstract List<Restaurants> getAllRestaurants();
	public abstract List<Restaurants> getAllAsiatisch();
	public abstract List<Restaurants> getAllAmerikanisch();
	public abstract List<Restaurants> getAllAfrikanisch();
	public abstract List<Restaurants> getAllTuerkisch();
	public abstract List<Restaurants> getAllIndisch();
	public abstract List<Restaurants> getAllItalienisch();
	public abstract List<Restaurants> getAllSchweizerisch();
	public abstract List<Restaurants> getAllSpanisch();
	public abstract List<Restaurants> getAllMexikanisch();
	public abstract List<Restaurants> getAllFranzoesisch();
	
}
