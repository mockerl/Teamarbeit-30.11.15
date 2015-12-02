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
	 * @param s ist die Seitenlänge Pyramide
	 * @param h ist die höhe der Pyramide
	 * @return v das Volumen
	 */
	public double pyramide(double s, double h) {
		double v = (s * s) * h / 3;
		return v;
	}
	/**
	 * Berechnet das Volumen eines Kegels 
	 * @param r ist der Radius des Kegels
	 * @param h ist die höhe des Kegels
	 * @return v das Volumen
	 */
	public double kegel(double r, double h) {
		double v = (1/3) * (3.141*(r*r))*h;
		return v;
	}
	/**
	 * Berechnet das Volumen eines Quaders 
	 * @param r ist der Radius des Quaders
	 * @return v das Volumen
	 */
	public double quader(double r) {
		double v = r*r*r;
		return v;
	}
}
