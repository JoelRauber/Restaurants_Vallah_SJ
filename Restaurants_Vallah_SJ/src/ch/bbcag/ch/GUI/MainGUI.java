package ch.bbcag.ch.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
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

	private JTextField text2 = new JTextField("Unser Projekt");

	public static void main(String[] args) {
		MainGUI main = new MainGUI();
		main.setSize(1600, 800);
		main.setVisible(true);
	}

	public MainGUI() {

		toFront();

		add(titel, BorderLayout.NORTH);
		panelHome.add(text2, BorderLayout.NORTH);
		panelHome.add(text3, BorderLayout.CENTER);
		panelHome.setBackground(Color.BLACK);

		titel.setBounds(550, 60, 550, 60);
		titel.setFont(new Font("arial", Font.PLAIN, 60));
		titel.setHorizontalAlignment(JTextField.CENTER);
		;

		text2.setHorizontalAlignment(JTextField.CENTER);
		// text2.setAlignmentY(CENTER_ALIGNMENT);

		// text2.setFont(new Font("arial", Font.PLAIN, 22));
		// text2.setPreferredSize(new Dimension(800, 600));
		text2.setBackground(Color.RED);
		text2.setFont(new Font("arial", Font.PLAIN, 50));

		text3.setFont(new Font("arial", Font.PLAIN, 22));
		text3.setHorizontalAlignment(JTextField.CENTER);
		text3.setBackground(Color.BLUE);

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

}
