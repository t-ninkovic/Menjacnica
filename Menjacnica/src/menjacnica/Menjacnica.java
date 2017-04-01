package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicainterfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	LinkedList<Valuta> listaKurseva = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(String naziv, String skraceni, double prodajni, double kupovni, double srednji,
			GregorianCalendar datum) {
		if (naziv == null || skraceni == null || prodajni <= 0 || kupovni <= 0 || srednji <= 0 || datum == null)
			throw new RuntimeException("Neki od parametara nije ispravno unet");
		Valuta v = new Valuta();
		v.setNaziv(naziv);
		v.setSkraceni(skraceni);
		v.setProdajni(prodajni);
		v.setKupovni(kupovni);
		v.setSrednji(srednji);
		v.setDatum(datum);
		listaKurseva.add(v);
	}

	@Override
	public void obrisiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public double[] pronadjiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
