package ch.bbcag.ch.GUI;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class RestaurantGUI {
 
    private JFrame fenster;
 
    private JPanel panel;
 
    private JTextField text;
 
    public RestaurantGUI() {
 
        // Frame wird erzeugt
        fenster = new JFrame("Aufgabenblatt 11");
        // Werte werden eingeben (Vorgabe: 720 x 640 Pixel)
        fenster.setSize(720, 640);
        // Position des Fensters auf dem Bildschirm wird eingerichtet
        fenster.setLocation(300, 250);
        // Bei klicken auf das "X" wird das Programm beendet
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Durch setVisible(true) wird das Fenster sichtbar gemacht
        fenster.setVisible(true);
        // Layout für JFrame wird festgelegt
        fenster.setLayout(new BorderLayout(5, 5));
 
        // Textfeld erzeugen
        text = new JTextField();
        // Textfeld im Süden des Layouts platzieren
        fenster.add(BorderLayout.SOUTH, text);
 
        // Panel erzeugen
        panel = new JPanel(new BorderLayout(5, 5));
 
        // Panel auf Frame packen
        fenster.add(BorderLayout.CENTER, panel);
        // Durch pack() wird das komplette Frame auf die optimale Größe gebracht
        fenster.pack();
        fenster.setVisible(true);
 
    }
 
    public static void main(String[] args) {
            new RestaurantGUI();
    }
}