package menjacnica;

import java.util.GregorianCalendar;

import menjacnicainterfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKurs(String naziv, String skraceni, double prodajni, double kupovni, double srednji,
			GregorianCalendar datum) {
		// TODO Auto-generated method stub

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
