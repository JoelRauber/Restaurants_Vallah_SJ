package ch.bbcag.ch.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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

	private MainGUI gui;
	private JPanel hWindow = new JPanel(new BorderLayout());
	private JPanel aWindow = new JPanel(new GridBagLayout());
	private GridBagConstraints c = new GridBagConstraints();
	private JLabel titel = new JLabel(
			"<html><div style='text-align: center;'>" + "Restaurants Vallah" + "</div></html>");
	private JPanel content = new JPanel();
	private ImageIcon restaurant = new ImageIcon(
			(new ImageIcon("resturantBild.jpeg")).getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
	private ImageIcon map = new ImageIcon(
			(new ImageIcon("image.jpg")).getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
	private JButton back = new JButton("Back");
	private JTextArea subTitel = new JTextArea("fjasdlfjkljalkjkjlllllllllllllllllllllllllllllllllllllllllllll\nasfdasdfasdfadfasdf");

	private JLabel map1 = new JLabel(map, JLabel.CENTER);
	private JLabel icon = new JLabel(restaurant, JLabel.CENTER);

	public ResaurantGUI(MainGUI mainGui) {
		this.gui = mainGui;
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

		// add(new JLabel(map));
		// add(new JLabel(restaurant), BorderLayout.WEST);

		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui.setSize(1600, 800);
				gui.setVisible(true);
				dispose();
				setVisible(false);
			}
		});

		// add(back);
		setVisible(true);
		// setPreferredSize(new Dimension(800, 800));
		pack();
		back.setHorizontalAlignment(SwingConstants.LEFT);
		// titel.setSize();
		titel.setFont(new Font("arial", Font.BOLD, 30));
//		titel.setBounds(300, 200, 100, 200);
		titel.setHorizontalAlignment(JTextField.CENTER);

		// subTitel.setHorizontalAlignment(JTextArea.CENTER);
		// subTitel.setSize(50, 50);
		subTitel.setEditable(false);
		subTitel.setBackground(new Color(238, 238, 238));
		subTitel.setBorder(null);
		// add(info);
		add(titel, BorderLayout.NORTH);
		//TODO: c für icon bearbeiten
		aWindow.add(icon, c);
		//TODO: c für subtitle bearbeiten
		aWindow.add(subTitel, c);
		//TODO: c für map1 bearbeiten
		aWindow.add(map1, c);
		add(hWindow, BorderLayout.CENTER);
		hWindow.add(aWindow, BorderLayout.CENTER);
		add(content, BorderLayout.SOUTH);

		content.add(back);

	}

	public void subTitel(String subTitle) {
		this.subTitel = new JTextArea(subTitle);
	}

}
