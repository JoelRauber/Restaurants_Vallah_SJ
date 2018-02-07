package ch.bbcag.ch.restaurants;

public class Restaurants {
	private int id;
	private String restaurant;
	private String beschreibung;
	private String link;
	private String nummer;
	private String kommentar;
	private String bewertung;
	private String typ;
	private String strasse;
	private String hnummer;
	private String ort;
	private String land;



	public int getId() {
		return id;
	}



	public String getRestaurants() {
		return restaurant;
	}



	public String getBeschreibung() {
		return beschreibung;
	}



	public String getLink() {
		return link;
	}



	public String getNummer() {
		return nummer;
	}



	public String getKommentar() {
		return kommentar;
	}



	public String getBewertung() {
		return bewertung;
	}



	public String getTyp() {
		return typ;
	}



	public String getStrasse() {
		return strasse;
	}



	public String getHnummer() {
		return hnummer;
	}



	public String getOrt() {
		return ort;
	}



	public String getLand() {
		return land;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setRestaurants(String restaurant) {
		this.restaurant = restaurant;
	}



	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}



	public void setLink(String link) {
		this.link = link;
	}



	public void setNummer(String nummer) {
		this.nummer = nummer;
	}



	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}



	public void setBewertung(String bewertung) {
		this.bewertung = bewertung;
	}



	public void setTyp(String typ) {
		this.typ = typ;
	}



	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}



	public void setHnummer(String hnummer) {
		this.hnummer = hnummer;
	}



	public void setOrt(String ort) {
		this.ort = ort;
	}



	public void setLand(String land) {
		this.land = land;
	}



	public String toString() {
		String result = "";
		result += "****************Restaurant "+ getId() + "****************\n\n";
		result += "Id: " + getId() + "\n";
		result += "Restaurants: " + getRestaurants() + "\n";
		result += "Beschreibung: " +getBeschreibung() + "\n";
		result += "Link: " + getLink() + "\n";
		result += "Nummer: " + getNummer() + "\n";
		result += "Kommentar: " + getKommentar() + "\n" ;
		result += "Bewertung: " + getBewertung() + "\n";
		result += "Typ: " + getTyp() + "\n";
		result += "Strasse: " + getStrasse() + "\n";
		result += "Hausnummer: " + getHnummer() + "\n";
		result += "Ort: " + getOrt() + "\n";
		result += "Land: " + getLand() + "\n \n";
		result += "**************************************\n";
		return result;
	}
}
