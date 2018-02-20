package ch.bbcag.ch.gui;

import java.awt.BorderLayout;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RestaurantGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame rsWindow = new JFrame();
		JTextField text = new JTextField("Hello");
		try {
			String latitude = "48.714728";
			String longitude = "-73.998672";
			String imageUrl = "https://map.googleapis.com/maps/api/staticmap?center=" + latitude + "," + longitude
					+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";
			String destinationFile = "image.jpg";
			// read the map image from Google
			// then save it to a local file: image.jpg
			//
			URL url = new URL(imageUrl);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream(destinationFile);
			byte[] b = new byte[2048];
			int length;
			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
			}
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}

		ImageIcon map = new ImageIcon(
				(new ImageIcon("image.jpg")).getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));
		rsWindow.setVisible(true);
		rsWindow.add(new JLabel(map));
		// rsWindow.add(text);
		rsWindow.setSize(1200, 400);
		rsWindow.setVisible(true);
		rsWindow.pack();

	}
}