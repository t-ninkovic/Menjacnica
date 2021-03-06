package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {
	private String naziv;
	private String skraceni;
	private double prodajni, kupovni, srednji;
	private GregorianCalendar datum;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if (naziv == null || naziv.equals("")) 
			throw new RuntimeException("Null ili prazan string. Naziv nije unet");
		this.naziv = naziv;
	}
	public String getSkraceni() {
		return skraceni;
	}
	public void setSkraceni(String skraceni) {
		if (skraceni == null || skraceni.equals(""))
			throw new RuntimeException("Null ili prazan string. Skraceni naziv nije unet");
		this.skraceni = skraceni;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if (prodajni <= 0) throw new RuntimeException("Kurs mora biti veci od 0");
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if (kupovni <= 0)  throw new RuntimeException("Kurs mora biti veci od 0");
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if (srednji <= 0)  throw new RuntimeException("Kurs mora biti veci od 0");
		this.srednji = srednji;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if (datum == null) throw new RuntimeException("Datum je null");
		this.datum = datum;
	}
	
	@Override
	public String toString() {
		return "Valuta: \n naziv =" + getNaziv() + "\n skraceni naziv =" + getSkraceni() + "\n prodajni kurs =" + getProdajni() + 
				"\n kupovni kurs =" + getKupovni() + "\n srednji kurs =" + getSrednji();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceni == null) ? 0 : skraceni.hashCode());
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Valuta))
			return false;
		
		Valuta v = (Valuta) obj;
		if (getNaziv().equals(v.getNaziv()) && getSkraceni().equals(v.getSkraceni()) && getProdajni() == v.getProdajni()
				&& getKupovni() == v.getKupovni() && getSrednji() == v.getSrednji() && getDatum() == v.getDatum())
			return true;
		return false;
	}
	

}
