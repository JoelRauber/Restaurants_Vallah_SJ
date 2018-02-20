package ch.bbcag.ch.gui;
import java.awt.Dimension;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RestaurantGUI{
	public static void main(String[] args) throws IOException{
		// Das Fenster wo das GUI aufgebaut wird
		JFrame window = new JFrame();
		window.setPreferredSize(new Dimension(800, 800));
		
		try {
			String latitude = "47.386623";
			String longitude = "8.516827";
			String imageURL = "https://maps.googleapis.com/maps/api/staticmap?center=" + latitude + "," + longitude
					+ "&zoom=11&size=200x200&scale=2&maptype=roadmap";
			String mapFile ="map.jpg";
			 
			URL url = new URL(imageURL);
			InputStream input =  url.openStream();
			OutputStream output = new FileOutputStream(mapFile);
			byte[] b = new byte[2048];
			int length;
			while ((length = input.read(b)) != -1) {
				output.write(b, 0, length);
				
			}
			input.close();
			output.close();
			
			
			
			
			
		} catch (IOException e) {
			//Zeigt den Fehler in der Konsole an und zeigt auch wo sich der Fehler befindet 
			e.printStackTrace();
			System.exit(1);
			
			
		}
		
		ImageIcon map = new ImageIcon(
				(new ImageIcon("map.jpg")).getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
		
		
		
		//map.setHorizontalTextPosition(SwingConstants.RIGHT);	
		window.add(new JLabel(map));
		
		window.setVisible(true);
		window.pack();
	
		
		
		
	
		
		
		
		
		
	}
	
}



	





