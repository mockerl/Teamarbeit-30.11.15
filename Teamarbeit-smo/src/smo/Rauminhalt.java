package smo;

/**
 * Das ist die Klasse Rauminhalt sie berechnet das Volumen von versch. Objekte
 * 
 * @author Özer Angelo
 * @version 30.11.2015
 *
 */
public class Rauminhalt {
	/**
	 * Berechnet das Volumen einer Pyramide mit quadratischer Grundfläche
	 * 
	 * @param s
	 *            = die Seitenlänge Pyramide
	 * @param h
	 *            = die höhe der Pyramide
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
