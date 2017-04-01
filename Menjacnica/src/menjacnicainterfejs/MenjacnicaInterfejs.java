package menjacnicainterfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	public void dodajKurs (String naziv, String skraceni, double prodajni, double kupovni, double srednji, GregorianCalendar datum);
	public void obrisiKurs (String naziv, GregorianCalendar datum);
	public double[] pronadjiKurs (String naziv, GregorianCalendar datum);

}
