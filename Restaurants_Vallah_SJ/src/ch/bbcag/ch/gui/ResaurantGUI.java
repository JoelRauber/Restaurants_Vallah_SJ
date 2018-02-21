package ch.bbcag.ch.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import ch.bbcag.ch.login.LoginView;

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
			(new ImageIcon("image.jpg")).getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
	static JButton back = new JButton("Back");
//	static JTextField info = new JTextField(
//			"Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
	JTextArea subTitel = new JTextArea();
	public static void main(String[] args) throws IOException {
		ResaurantGUI main = new ResaurantGUI();
		main.setSize(800, 800);
		main.setVisible(true);

	}
	static JLabel map1 = new JLabel(map, JLabel.CENTER);
	static JLabel icon = new JLabel(restaurant, JLabel.CENTER);

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
		
//		add(new JLabel(map));
		//add(new JLabel(restaurant), BorderLayout.WEST);
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGUI login = new MainGUI();
				login.setSize(1600, 800);
				login.setVisible(true);
				dispose();
			}
		});
		
		
		// add(back);
		setVisible(true);
		// setPreferredSize(new Dimension(800, 800));
		pack();
		back.setHorizontalAlignment(SwingConstants.LEFT);
		// titel.setSize();
		titel.setFont(new Font("arial", Font.BOLD, 30));
		titel.setBounds(300, 200, 100, 200);
		titel.setHorizontalAlignment(JTextField.CENTER);
		
		
		
//		subTitel.setHorizontalAlignment(JTextArea.CENTER);
//		subTitel.setSize(50, 50);
		subTitel.setEditable(false);
		subTitel.setBackground(new Color(238, 238, 238));
		subTitel.setBorder(null);
		
//		add(info);
		add(titel, BorderLayout.NORTH);
		add(subTitel, BorderLayout.CENTER);
		add(content, BorderLayout.SOUTH);
		add(icon, BorderLayout.WEST);
		add(map1, BorderLayout.EAST);
		

		content.add(back);

	}

}
