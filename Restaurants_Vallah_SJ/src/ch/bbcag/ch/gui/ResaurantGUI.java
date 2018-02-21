package ch.bbcag.ch.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ResaurantGUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Das Fenster wo das GUI aufgebaut wird
	static JFrame window = new JFrame();
	static JLabel titel = new JLabel(
			"<html><div style='text-align: center;'>" + "Restaurants Vallah" + "</div></html>");
	static JPanel content = new JPanel();
	static ImageIcon restaurant = new ImageIcon(
			(new ImageIcon("resturantBild.jpeg")).getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
	static ImageIcon map = new ImageIcon(
			(new ImageIcon("image.jpg")).getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));
	static JButton back = new JButton("Back");
	static JTextField info = new JTextField(
			"Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
	static JTextField subTitel = new JTextField("Burgerking");
	public static void main(String[] args) throws IOException {
		ResaurantGUI main = new ResaurantGUI();
		main.setSize(800, 800);
		main.setVisible(true);

	}

	public ResaurantGUI() {

		try {
			String latitude = "48.714728";
			String longitude = "-73.998672";

			String imageURL = "https://maps.googleapis.com/maps/api/staticmap?center=" + latitude + "," + longitude
					+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";

			String mapFile = "map.jpg";

			URL url = new URL(imageURL);
			InputStream input = url.openStream();
			OutputStream output = new FileOutputStream(mapFile);
			byte[] b = new byte[2048];
			int length;
			while ((length = input.read(b)) != -1) {
				output.write(b, 0, length);

			}
			input.close();
			output.close();

		} catch (IOException e) {
			// Zeigt den Fehler in der Konsole an und zeigt auch wo sich der Fehler befindet
			e.printStackTrace();
			System.exit(1);

		}

		add(new JLabel(map), BorderLayout.EAST);
		add(new JLabel(restaurant), BorderLayout.WEST);
	
		// add(back);
		setVisible(true);
		// setPreferredSize(new Dimension(800, 800));
		pack();
		back.setHorizontalAlignment(SwingConstants.LEFT);
		// titel.setSize();
		titel.setFont(new Font("arial", Font.BOLD, 30));
		titel.setBounds(300, 200, 100, 200);
		titel.setHorizontalAlignment(JTextField.CENTER);
		
		subTitel.setHorizontalAlignment(JTextField.CENTER);
		subTitel.setEditable(false);
		subTitel.setBackground(new Color(238, 238, 238));
		subTitel.setBorder(null);


		
		add(info);
		add(titel, BorderLayout.NORTH);
		add(subTitel);
		add(content, BorderLayout.SOUTH);
		

		content.add(back);

	}

}