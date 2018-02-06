package ch.bbcag.ch.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.nio.FloatBuffer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainGUI extends JFrame {

	private static final long serialVersionUID = 1L;

	private static JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT, JTabbedPane.SCROLL_TAB_LAYOUT);
	private JPanel panelHome = new JPanel(new BorderLayout());
	private JPanel panelAsiatisch = new JPanel();
	private JPanel panelAfrikanisch = new JPanel();
	private JPanel panelAmerikanisch = new JPanel();
	private JPanel panelFranzoesisch = new JPanel();
	private JPanel panelIndisch = new JPanel();
	private JPanel panelItalienisch = new JPanel();
	private JPanel panelSchweizerisch = new JPanel();
	private JPanel panelSpanisch = new JPanel();
	private JPanel panelMexikanisch = new JPanel();
	private JPanel panelTuerkisch = new JPanel();

	private JLabel titel = new JLabel(
			"<html><div style='text-align: center;'>" + "Restaurants Vallah" + "</div></html>");
	private JTextField text3 = new JTextField(
			"Lorem ipsum dolor  justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");

	private JTextField asiatisch = new JTextField("--> Asiatisch");
	private JTextField asiatisch1 = new JTextField("Srb ist gay");

	public static void main(String[] args) {
		MainGUI main = new MainGUI();
		main.setSize(1600, 800);
		main.setVisible(true);
	}

	public MainGUI() {

		toFront();
		
		
		titel.setBounds(550, 60, 550, 60);
		titel.setFont(new Font("arial", Font.PLAIN, 60));
		titel.setHorizontalAlignment(JTextField.CENTER);
		
		panelHome.setBackground(Color.BLACK);

		asiatisch.setHorizontalAlignment(JTextField.CENTER);
		asiatisch.setEditable(false);
		asiatisch.setBackground(new Color(238, 238, 238));
		asiatisch.setBorder(null);
		
		asiatisch1.setBackground(Color.BLUE);
		asiatisch1.setHorizontalAlignment(JTextField.CENTER);

		asiatisch.setFont(new Font("arial", Font.PLAIN, 35));

		text3.setFont(new Font("arial", Font.PLAIN, 22));
		text3.setHorizontalAlignment(JTextField.CENTER);
		
		panelAsiatisch.add(asiatisch, BorderLayout.CENTER);
		panelHome.add(text3, BorderLayout.CENTER);
		panelAsiatisch.add(asiatisch1, GridLayout(3, 1));
		add(titel, BorderLayout.NORTH);
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
		add(tabbedPane, BorderLayout.CENTER);
		toBack();

	}

	private Object GridLayout(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
