package ch.bbc.ch.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch.bbcag.ch.gui.MainGUI;
import ch.bbcag.ch.gui.ResaurantGUI;

public class OpenDetailsViewActionListener implements ActionListener{

	private String restaurantInfo;
	private MainGUI gui;
	
	public OpenDetailsViewActionListener(MainGUI mainGui, String restaurantInfo) {
		this.gui = mainGui;
		this.restaurantInfo = restaurantInfo;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ResaurantGUI res = new ResaurantGUI(gui);
		res.setSize(800, 800);
		res.setVisible(true);
		gui.dispose();
		gui.setVisible(false);
		res.subTitel(restaurantInfo);
	}

}
