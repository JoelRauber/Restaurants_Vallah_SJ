package ch.bbcag.ch.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
//import javax.swing.border.Border;
//
//import ch.bbc.ch.listener.OpenDetails;
import ch.bbc.ch.listener.OpenDetailsViewActionListener;
import ch.bbcag.ch.ConnectionFactory;
import ch.bbcag.ch.login.LoginView;
import ch.bbcag.ch.restaurant.Restaurant;
import ch.bbcag.ch.restaurant.RestaurantDao;
//import ch.bbcag.ch.restaurant.RestaurantType;
import ch.bbcag.ch.restaurant.RestaurantsJDBCDao;

//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.junit.Test;

public class MainGUI extends JFrame {
	
	private static MainGUI m;

	private static final long serialVersionUID = 1L;

	private static JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT, JTabbedPane.SCROLL_TAB_LAYOUT);

	private JPanel panelHome = new JPanel(new BorderLayout());
	private JPanel panelAsiatisch = new JPanel(new BorderLayout());
	private JPanel panelAfrikanisch = new JPanel(new BorderLayout());
	private JPanel panelAmerikanisch = new JPanel(new BorderLayout());
	private JPanel panelFranzoesisch = new JPanel(new BorderLayout());
	private JPanel panelIndisch = new JPanel(new BorderLayout());
	private JPanel panelItalienisch = new JPanel(new BorderLayout());
	private JPanel panelSchweizerisch = new JPanel(new BorderLayout());
	private JPanel panelSpanisch = new JPanel(new BorderLayout());
	private JPanel panelMexikanisch = new JPanel(new BorderLayout());
	private JPanel panelTuerkisch = new JPanel(new BorderLayout());
	private JPanel panelSearch = new JPanel(new BorderLayout());
	private JPanel panelSearch2 = new JPanel(new BorderLayout());

	// private JPanel contentPanelAll = new JPanel(new GridLayout(2, 3));
	private JPanel contentPanelAsiatisch = new JPanel(new GridLayout(2, 3));
	private JPanel contentPanelAfrikanisch = new JPanel(new GridLayout(2, 3));
	private JPanel contentPanelAmerikanisch = new JPanel(new GridLayout(2, 3));
	private JPanel contentPanelFranzoesisch = new JPanel(new GridLayout(2, 3));
	private JPanel contentPanelIndisch = new JPanel(new GridLayout(2, 3));
	private JPanel contentPanelItalienisch = new JPanel(new GridLayout(2, 3));
	private JPanel contentPanelSchweizerisch = new JPanel(new GridLayout(2, 3));
	private JPanel contentPanelSpanisch = new JPanel(new GridLayout(2, 3));
	private JPanel contentPanelMexikanisch = new JPanel(new GridLayout(2, 3));
	private JPanel contentPanelTuerkisch = new JPanel(new GridLayout(2, 3));
	private JPanel contentPanelSearch = new JPanel(new GridLayout(3, 3));

	private JTextField asiatisch = new JTextField("--> Asiatisch");
	private JTextField afrikanisch = new JTextField("--> Afrikanisch");
	private JTextField amerikanisch = new JTextField("--> Amerikanisch");
	private JTextField franzoesisch = new JTextField("--> Franzoesisch");
	private JTextField indisch = new JTextField("--> Indisch");
	private JTextField italienisch = new JTextField("--> Italienisch");
	private JTextField schweizerisch = new JTextField("--> Schweizerisch");
	private JTextField spanisch = new JTextField("--> Spanisch");
	private JTextField mexikanisch = new JTextField("--> Mexikanisch");
	private JTextField tuerkisch = new JTextField("--> Tuerkisch");
	private JTextField search = new JTextField("--> Search");
	private JTextField searchfield = new JTextField();

//	private JLabel searchdescription = new JLabel();
	private JButton login = new JButton();

	private JButton searchbutton = new JButton();

	private JLabel titel = new JLabel(
			"<html><div style='text-align: Center;'>" + "Restaurants Vallah" + "</div></html>");
	private JTextField text3 = new JTextField(
			"Lorem ipsum dolor  justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		MainGUI.m = new MainGUI();
//	}
//	
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//		MainGUI.m = null;
//	}
//	
//	/**
//	 * Test {
//	 * @param args
//	 */
//	@Test
	public static void main(String[] args) {
		MainGUI main = new MainGUI();
		main.setSize(1600, 800);
		main.setVisible(true);
	}
	
	public MainGUI() {

		toFront();

		// ***************************
		Connection con = ConnectionFactory.getInstance().getConnection();
		RestaurantDao ud = new RestaurantsJDBCDao(con);

		for (Restaurant restaurant : ud.getAllRestaurants()) {
			JButton weiter = new JButton();
			ImageIcon icon = new ImageIcon("restaurantBild.jpeg");
			weiter.setText(
					"<html><center><br><br><br><br><br><br><br>*******************************************<br><br>"
							+ restaurant.getName() + "<br><br>" + restaurant.getLink() + " <br><br> "
							+ restaurant.getStrasse() + " " + restaurant.getHnummer() + " <br>" + restaurant.getOrt()
							+ "<br>" + restaurant.getLand()
							+ "<br><br>*******************************************<br><br<br><br><br><br><br></center></html>");
			weiter.setIcon(icon);
			weiter.setBackground(new Color(238, 238, 238));
			weiter.setBorder(null);
			
			weiter.addActionListener(new OpenDetailsViewActionListener(this, restaurant.toString()));
			revalidate();
			switch (restaurant.getTyp()) {
			case ASIATISCH:
				contentPanelAsiatisch.add(weiter);
				break;
			case AFRIKANISCH:
				contentPanelAfrikanisch.add(weiter);
				break;
			case AMERIKANISCH:
				contentPanelAmerikanisch.add(weiter);
				break;
			case FRANZOESISCH:
				contentPanelFranzoesisch.add(weiter);
				break;
			case INDISCH:
				contentPanelIndisch.add(weiter);
				break;
			case ITALIENISCH:
				contentPanelItalienisch.add(weiter);
				break;
			case SCHWEIZERISCH:
				contentPanelSchweizerisch.add(weiter);
				break;
			case SPANISCH:
				contentPanelSpanisch.add(weiter);
				break;
			case MEXIKANISCH:
				contentPanelMexikanisch.add(weiter);
				break;
			case TUERKISCH:
				contentPanelTuerkisch.add(weiter);
				break;
			default:
				System.err.println("Restaurant type not defined!");
				break;
			}
		}

		
		// *************************************

		titel.setBounds(550, 60, 550, 60);
		titel.setFont(new Font("arial", Font.PLAIN, 60));
		titel.setHorizontalAlignment(JTextField.CENTER);

		login.setSize(107, 70);
		login.setLocation(0, 0);
		login.setBackground(new Color(238, 238, 238));
		// login.setBorder(null);
		login.setText("Abmelden");
		login.setFont(new Font("arial", Font.PLAIN, 15));
		login.setVisible(true);

		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginView login = new LoginView();
				login.setSize(400, 400);
				login.setVisible(true);
				dispose();
			}
		});
		ConnectionFactory.getInstance().closeConnection();
		
		
		searchbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con1 = ConnectionFactory.getInstance().getConnection();
				RestaurantDao ud1 = new RestaurantsJDBCDao(con1);
				for (Restaurant restaurant : ud1.getAllBySearch(searchfield.getText())) {
					
					System.out.println("test");
					JButton weiter = new JButton();
					weiter.setText(
							"<html><center><br><br><br><br><br><br><br>*******************************************<br><br>"
									+ restaurant.getName() + "<br><br>" + restaurant.getLink() + " <br><br> "
									+ restaurant.getStrasse() + " " + restaurant.getHnummer() + " <br>" + restaurant.getOrt()
									+ "<br>" + restaurant.getLand()
									+ "<br><br>*******************************************<br><br<br><br><br><br><br></center></html>");
					weiter.setBackground(new Color(238, 238, 238));
					weiter.setBorder(null);
					System.out.println("test2");
					contentPanelSearch.add(weiter, BorderLayout.SOUTH);
//					weiter.addActionListener(new OpenDetails(this, restaurant.toString()));
					revalidate();
				}
				ConnectionFactory.getInstance().closeConnection();
			}
		});
		
		
		panelHome.setBackground(Color.BLACK);

		// JScrollPane scroll = new JScrollPane(contentPanelAsia);

		asiatisch.setHorizontalAlignment(JTextField.CENTER);
		asiatisch.setEditable(false);
		asiatisch.setBackground(new Color(238, 238, 238));
		asiatisch.setBorder(null);

		asiatisch.setFont(new Font("arial", Font.PLAIN, 35));

		afrikanisch.setHorizontalAlignment(JTextField.CENTER);
		afrikanisch.setEditable(false);
		afrikanisch.setBackground(new Color(238, 238, 238));
		afrikanisch.setBorder(null);

		afrikanisch.setFont(new Font("arial", Font.PLAIN, 35));

//		search.setHorizontalAlignment(JTextField.CENTER);
//		search.setEditable(false);
//		search.setBackground(new Color(238, 238, 238));
//		search.setBorder(null);
//
//		search.setFont(new Font("arial", Font.PLAIN, 35));

//		searchdescription.setLocation(600, 50);
//		searchdescription.setSize(600, 30);
//		searchdescription.setText("Welches Restaurant in Zürich wollen Sie suchen? ");
//		searchdescription.setFont(new Font("arial", Font.PLAIN, 15));

		searchfield.setLocation(450, 800);
		searchfield.setSize(600, 30);

//		searchbutton.setLocation(650, 150);
		searchbutton.setPreferredSize(new Dimension(200, 30));
		searchbutton.setBackground(new Color(238, 238, 238));
		// searchbutton.setBorder(null);
		searchbutton.setText("Suchen");
		searchbutton.setFont(new Font("arial", Font.PLAIN, 15));

		amerikanisch.setHorizontalAlignment(JTextField.CENTER);
		amerikanisch.setEditable(false);
		amerikanisch.setBackground(new Color(238, 238, 238));
		amerikanisch.setBorder(null);

		amerikanisch.setFont(new Font("arial", Font.PLAIN, 35));

		franzoesisch.setHorizontalAlignment(JTextField.CENTER);
		franzoesisch.setEditable(false);
		franzoesisch.setBackground(new Color(238, 238, 238));
		franzoesisch.setBorder(null);

		franzoesisch.setFont(new Font("arial", Font.PLAIN, 35));

		indisch.setHorizontalAlignment(JTextField.CENTER);
		indisch.setEditable(false);
		indisch.setBackground(new Color(238, 238, 238));
		indisch.setBorder(null);

		indisch.setFont(new Font("arial", Font.PLAIN, 35));

		italienisch.setHorizontalAlignment(JTextField.CENTER);
		italienisch.setEditable(false);
		italienisch.setBackground(new Color(238, 238, 238));
		italienisch.setBorder(null);

		italienisch.setFont(new Font("arial", Font.PLAIN, 35));

		schweizerisch.setHorizontalAlignment(JTextField.CENTER);
		schweizerisch.setEditable(false);
		schweizerisch.setBackground(new Color(238, 238, 238));
		schweizerisch.setBorder(null);

		schweizerisch.setFont(new Font("arial", Font.PLAIN, 35));

		spanisch.setHorizontalAlignment(JTextField.CENTER);
		spanisch.setEditable(false);
		spanisch.setBackground(new Color(238, 238, 238));
		spanisch.setBorder(null);

		spanisch.setFont(new Font("arial", Font.PLAIN, 35));

		mexikanisch.setHorizontalAlignment(JTextField.CENTER);
		mexikanisch.setEditable(false);
		mexikanisch.setBackground(new Color(238, 238, 238));
		mexikanisch.setBorder(null);

		mexikanisch.setFont(new Font("arial", Font.PLAIN, 35));

		tuerkisch.setHorizontalAlignment(JTextField.CENTER);
		tuerkisch.setEditable(false);
		tuerkisch.setBackground(new Color(238, 238, 238));
		tuerkisch.setBorder(null);

		tuerkisch.setFont(new Font("arial", Font.PLAIN, 35));

		text3.setFont(new Font("arial", Font.PLAIN, 22));
		text3.setHorizontalAlignment(JTextField.CENTER);

		panelAsiatisch.add(asiatisch, BorderLayout.NORTH);
		panelAfrikanisch.add(afrikanisch, BorderLayout.NORTH);
		panelAmerikanisch.add(amerikanisch, BorderLayout.NORTH);
		panelFranzoesisch.add(franzoesisch, BorderLayout.NORTH);
		panelIndisch.add(indisch, BorderLayout.NORTH);
		panelItalienisch.add(italienisch, BorderLayout.NORTH);
		panelSchweizerisch.add(schweizerisch, BorderLayout.NORTH);
		panelSpanisch.add(spanisch, BorderLayout.NORTH);
		panelMexikanisch.add(mexikanisch, BorderLayout.NORTH);
		panelTuerkisch.add(tuerkisch, BorderLayout.NORTH);
//		panelSearch.add(search, BorderLayout.SOUTH);
		panelSearch.add(searchfield, BorderLayout.NORTH);
//		panelSearch.add(searchdescription, BorderLayout.CENTER);
		panelSearch2.add(searchbutton, BorderLayout.NORTH);

		panelAsiatisch.add(contentPanelAsiatisch, BorderLayout.CENTER);
		panelAfrikanisch.add(contentPanelAfrikanisch, BorderLayout.CENTER);
		panelAmerikanisch.add(contentPanelAmerikanisch, BorderLayout.CENTER);
		panelFranzoesisch.add(contentPanelFranzoesisch, BorderLayout.CENTER);
		panelIndisch.add(contentPanelIndisch, BorderLayout.CENTER);
		panelItalienisch.add(contentPanelItalienisch, BorderLayout.CENTER);
		panelSchweizerisch.add(contentPanelSchweizerisch, BorderLayout.CENTER);
		panelSpanisch.add(contentPanelSpanisch, BorderLayout.CENTER);
		panelMexikanisch.add(contentPanelMexikanisch, BorderLayout.CENTER);
		panelTuerkisch.add(contentPanelTuerkisch, BorderLayout.CENTER);
		panelSearch2.add(contentPanelSearch, BorderLayout.CENTER);
		panelSearch.add(panelSearch2, BorderLayout.CENTER);

		panelHome.add(text3, BorderLayout.CENTER);

		add(titel, BorderLayout.NORTH);
		add(login);
		tabbedPane.removeAll();
		
		tabbedPane.addTab("Home", panelHome);
		tabbedPane.addTab("Asiatisch", panelAsiatisch);
		tabbedPane.addTab("Afrikanisch", panelAfrikanisch);
		tabbedPane.addTab("Amerikanisch", panelAmerikanisch);
		tabbedPane.addTab("Franzoesisch", panelFranzoesisch);
		tabbedPane.addTab("Indisch", panelIndisch);
		tabbedPane.addTab("Italienisch", panelItalienisch);
		tabbedPane.addTab("Schweizerisch", panelSchweizerisch);
		tabbedPane.addTab("Spanisch", panelSpanisch);
		tabbedPane.addTab("Mexikanisch", panelMexikanisch);
		tabbedPane.addTab("Tuerkisch", panelTuerkisch);
		tabbedPane.addTab("Search", panelSearch);
		add(tabbedPane, BorderLayout.CENTER);
		toBack();

	}

}
