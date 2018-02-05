package ch.bbcag.ch.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeListener;

public class MainGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT, JTabbedPane.SCROLL_TAB_LAYOUT);
	JPanel panelHome = new JPanel();
	JPanel panelAsiatisch = new JPanel();
	JPanel panelAfrikanisch = new JPanel();
	JPanel panelAmerikanisch = new JPanel();
	JPanel panelFranzoesisch = new JPanel();
	JPanel panelIndisch = new JPanel();
	JPanel panelItalienisch = new JPanel();
	JPanel panelSchweizerisch = new JPanel();
	JPanel panelSpanisch = new JPanel();
	JPanel panelMexikanisch = new JPanel();
	JPanel panelTuerkisch = new JPanel();

	private static JLabel titel = new JLabel(
			"<html><div style='text-align: center;'>" + "Restaurants Vallah" + "</div></html>");
	private static JLabel text = new JLabel("<html><div style='text-align: center;'>"
			+ "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet."
			+ "</div></html>");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainGUI main = new MainGUI();

		main.setSize(1600, 800);
		main.setVisible(true);

		titel.setBounds(550, 60,550, 60);
		titel.setFont(new Font("arial", Font.PLAIN, 60));
		titel.setForeground(Color.black);
		
		text.setFont(new Font("arial", Font.PLAIN, 22));
		text.setBounds(550, 300, 550, 300);

	}

	public MainGUI() {

		add(titel);
		toFront();
		
		add(text);
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
		add(tabbedPane);
		toBack();

	}
	
	void addChangeListener(ChangeListener l) {
		
	}

}
