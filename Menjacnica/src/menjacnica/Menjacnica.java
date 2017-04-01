package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicainterfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	LinkedList<Valuta> listaKurseva = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(String naziv, String skraceni, double prodajni, double kupovni, double srednji,
			GregorianCalendar datum) {
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
		if (listaKurseva.isEmpty()) 
			throw new RuntimeException("Lista je prazna");
		for (int i=0; i < listaKurseva.size(); i++) {
			if (listaKurseva.get(i).getNaziv().equals(naziv) && listaKurseva.get(i).getDatum() == datum)
				listaKurseva.remove(i);
		}
	}

	@Override
	public double[] pronadjiKurs(String naziv, GregorianCalendar datum) {
		double[] nizKurseva = new double[3];
		if (listaKurseva.isEmpty()) throw new RuntimeException("Lista je prazna");
		for (int i=0; i < listaKurseva.size(); i++) {
			if (listaKurseva.get(i).getNaziv().equals(naziv) && listaKurseva.get(i).getDatum() == datum) {
				nizKurseva[0] = listaKurseva.get(i).getProdajni();
				nizKurseva[1] = listaKurseva.get(i).getKupovni();
				nizKurseva[2] = listaKurseva.get(i).getSrednji();
				break;
			}
		}
		
		return nizKurseva;
	}

}
