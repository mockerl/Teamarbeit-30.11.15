package smo;
/**
 * Klasse zur Berechnung von Fl�chen (Rechteck, Kreis und Dreieck)
 * @author Raphael Sauermann
 * @version 30.11.2015 
 *
 */
public class BerechnungFlaeche {
	/**
	 * berechtnet die Fl�che eines Rechtecks
	 * @param laenge die l�nge
	 * @param breite die breite
	 * @return die fl�che
	 */
	public double rechteckFlaeche(double laenge, double breite) {
		return laenge*breite;
	}
	/**
	 * Berechnet den fl�cheninhalt eines kreises
	 * @param radius der radius
	 * @return
	 */
	public double kreisFlaeche(double radius){
		double erg = radius*radius*Math.PI;
		return erg;
	}
	/**
	 * Berechnet den Fl�cheninhalt eines Dreiecks
	 * @param a die seite a
	 * @param ha die h�he von a
	 * @return die fl�chen gr��e
	 */
	public double dreiecksFlaeche (double a,double ha){
		double erg = 1/2*a*ha;
		return erg;
	}
	
}
