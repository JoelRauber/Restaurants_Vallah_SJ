package ch.bbc.ch.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch.bbcag.ch.view.MainView;
import ch.bbcag.ch.view.RestaurantView;

public class OpenDetailsViewActionListener implements ActionListener{

	private String restaurantInfo;
	private MainView gui;
	
	public OpenDetailsViewActionListener(MainView mainGui, String restaurantInfo) {
		this.gui = mainGui;
		this.restaurantInfo = restaurantInfo;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		RestaurantView res = new RestaurantView(gui);
		res.setSize(800, 800);
		res.setVisible(true);
		gui.dispose();
		gui.setVisible(false);
		res.subTitel.setText(restaurantInfo);
	}

}
