package ch.bbcag.ch.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.nio.FloatBuffer;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class MainGUI extends JFrame {

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
	private JPanel contentPanelAll = new JPanel(new GridLayout(2, 3));

	private JLabel titel = new JLabel(
			"<html><div style='text-align: center;'>" + "Restaurants Vallah" + "</div></html>");
	private JTextField text3 = new JTextField(
			"Lorem ipsum dolor  justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");

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

	public static void main(String[] args) {
		MainGUI main = new MainGUI();
		main.setSize(1600, 800);
		main.setVisible(true);
	}

	public MainGUI() {

		toFront();

		for (int y = 0; y < 10; y++) {
			for (int i = 0; i < 6; i++) {
				JTextPane felder = new JTextPane();
				felder.setText("Test");
				felder.setEditable(false);
				felder.setBackground(new Color(238, 238, 238));
				felder.setBorder(null);
				contentPanelAll.add(felder);
			}
		}

		titel.setBounds(550, 60, 550, 60);
		titel.setFont(new Font("arial" , Font.PLAIN, 60));
		titel.setHorizontalAlignment(JTextField.CENTER);

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

		panelAsiatisch.add(contentPanelAll, BorderLayout.CENTER);
		panelAfrikanisch.add(contentPanelAll, BorderLayout.CENTER);
		panelAmerikanisch.add(contentPanelAll, BorderLayout.CENTER);
		panelFranzoesisch.add(contentPanelAll, BorderLayout.CENTER);
		panelIndisch.add(contentPanelAll, BorderLayout.CENTER);
		panelItalienisch.add(contentPanelAll, BorderLayout.CENTER);
		panelSchweizerisch.add(contentPanelAll, BorderLayout.CENTER);
		panelSpanisch.add(contentPanelAll, BorderLayout.CENTER);
		panelMexikanisch.add(contentPanelAll, BorderLayout.CENTER);
		panelTuerkisch.add(contentPanelAll, BorderLayout.CENTER);
		// contentPanelAll.add(contentPanelAll, BorderLayout.CENTER);

		panelHome.add(text3, BorderLayout.CENTER);

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
