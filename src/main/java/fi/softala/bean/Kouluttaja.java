package fi.softala.bean;

public class Kouluttaja {
	
	private String opiskelijanro;
	private String etunimi;
	private String sukunimi;
	private String salasana;
	private String suola;
	
	public Kouluttaja() {
		opiskelijanro = null;
		etunimi = null;
		sukunimi = null;
		salasana = null;
		suola = null;
	}
	
	public Kouluttaja(String onro, String enimi, String snimi, String ssana, String suola) {
		this.opiskelijanro = onro;
		this.etunimi = enimi;
		this.sukunimi = snimi;
		this.salasana = ssana;
		this.suola = suola;
	}

	public String getOpiskelijanro() {
		return opiskelijanro;
	}

	public void setOpiskelijanro(String opiskelijanro) {
		this.opiskelijanro = opiskelijanro;
	}

	public String getEtunimi() {
		return etunimi;
	}

	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}

	public String getSalasana() {
		return salasana;
	}

	public void setSalasana(String salasana) {
		this.salasana = salasana;
	}

	public String getSuola() {
		return suola;
	}

	public void setSuola(String suola) {
		this.suola = suola;
	}

	@Override
	public String toString() {
		return "KouluttajaImpl [opiskelijanro=" + opiskelijanro + ", etunimi="
				+ etunimi + ", sukunimi=" + sukunimi + ", salasana=" + salasana
				+ ", suola=" + suola + "]";
	}

}
