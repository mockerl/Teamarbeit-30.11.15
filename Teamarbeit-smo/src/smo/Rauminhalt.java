package smo;

/**
 * Das ist die Klasse Rauminhalt sie berechnet das Volumen von versch. Objekte
 * 
 * @author �zer Angelo
 * @version 30.11.2015
 *
 */
public class Rauminhalt {
	/**
	 * Berechnet das Volumen einer Pyramide mit quadratischer Grundfl�che
	 * 
	 * @param s
	 *            = die Seitenl�nge Pyramide
	 * @param h
	 *            = die h�he der Pyramide
	 * @return v das Volumen
	 */
	public double pyramide(double s, double h) {
		double v = (s * s) * h / 3;
		return v;
	}

	public double Kegel(double s, double h) {
		double v = (s * s) * h / 3;
		return v;
	}
}
