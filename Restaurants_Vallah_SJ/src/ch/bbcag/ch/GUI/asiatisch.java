package ch.bbcag.ch.GUI;
import java.awt.Color;

import javax.swing.JTextPane;

import ch.bbcag.ch.GUI.*;

public class asiatisch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainGUI asiatisch = new MainGUI();
		for (int i = 0; i < 6; i++) {
			JTextPane felder = new JTextPane();
			felder.setText("Test");
			felder.setEditable(false);
			felder.setBackground(new Color(238, 238, 238));
			felder.setBorder(null);
			asiatisch.getContentPanelAsiatisch().add(felder);
		}
		
	}

}
