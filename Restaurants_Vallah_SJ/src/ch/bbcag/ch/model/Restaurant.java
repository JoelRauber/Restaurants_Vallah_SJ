package ch.bbcag.ch.model;

public class Restaurant {
	private int id;
	private String name;
	private String beschreibung;
	private String link;
	private String nummer;
	private String kommentar;
	private String bewertung;
	private RestaurantType typ;
	private String strasse;
	private String hnummer;
	private String ort;
	private String land;



	public int getId() {
		return id;
	}



	public String getName() {
		return name;
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



	public RestaurantType getTyp() {
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



	public void setName(String name) {
		this.name = name;
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



	public void setTyp(RestaurantType typ) {
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
		result += "\nRestaurants: " + getName() + "\n";
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
		return result;
	}
}
