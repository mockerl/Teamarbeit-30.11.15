package smo;
/**
 * Klasse zur Berechnung von Flächen (Rechteck, Kreis und Dreieck)
 * @author Raphael Sauermann
 * @version 30.11.2015 
 *
 */
public class BerechnungFlaeche {
	/**
	 * berechtnet die Fläche eines Rechtecks
	 * @param laenge die länge
	 * @param breite die breite
	 * @return die fläche
	 */
	public double rechteckFlaeche(double laenge, double breite) {
		return laenge*breite;
	}
	/**
	 * Berechnet den flächeninhalt eines kreises
	 * @param radius der radius
	 * @return
	 */
	public double kreisFlaeche(double radius){
		double erg = radius*radius*Math.PI;
		return erg;
	}
	/**
	 * Berechnet den Flächeninhalt eines Dreiecks
	 * @param a die seite a
	 * @param ha die höhe von a
	 * @return die flächen größe
	 */
	public double dreiecksFlaeche (double a,double ha){
		double erg = 1/2*a*ha;
		return erg;
	}
	
}
