package smo;

/**
 * Diese Klasse testet die anderen Klassen
 * 
 * @author Raphael Sauermann
 * @version 01.12.2015
 */
public class test {
	//Die Attribute
	private Zahlen z1;
	private Rauminhalt ri1;
	private BerechnungFlaeche bf1;
	
	/**
	 * Der konstruktor
	 */
	public test() {
		z1 = new Zahlen();
		ri1 = new Rauminhalt();
		bf1 = new BerechnungFlaeche();
		
		testRechteckFlaeche();
		testKreisFlaeche();
		testDreiecksFlaeche();
	}
	/**
	 * Testet die Methode rechteckFlaeche in der Klasse BerechnungFlaeche
	 */
	public void testRechteckFlaeche (){
		System.out.println(bf1.rechteckFlaeche(1.3,5.6));
		System.out.println(bf1.rechteckFlaeche(1,1));
	}
	/**
	 * Testet die Methode kreisFlaeche in der Klasse BerechnungFlaeche
	 */
	public void testKreisFlaeche (){
		System.out.println(bf1.kreisFlaeche(3));
		System.out.println(bf1.kreisFlaeche(1));
	}
	/**
	 * Testet die Methode dreiecksFlaeche in der Klasse BerechnungFlaeche
	 */
	public void testDreiecksFlaeche (){
		System.out.println(bf1.dreiecksFlaeche(5, 4));
		System.out.println(bf1.dreiecksFlaeche(1, 1));
	}
	public static void main(String[] args) {
		new test();
	}
}
