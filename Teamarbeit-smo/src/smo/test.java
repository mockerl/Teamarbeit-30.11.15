package smo;

/**
 * Diese Klasse testet die anderen Klassen
 * 
 * @author Raphael Sauermann
 * @version 01.12.2015
 */
public class test {
	// Die Attribute
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
		System.out.println("##Test Rauminhalt##");
		testPyramide();
		testKegel();
		testQuader();
		System.out.println("####Test Zahlen####");
		testZahlen();
	}

	// Tests der Klasse BerechnungFlaeche
	/**
	 * Testet die Methode rechteckFlaeche in der Klasse BerechnungFlaeche
	 */
	public void testRechteckFlaeche() {
		System.out.println(bf1.rechteckFlaeche(1.3, 5.6));
		System.out.println(bf1.rechteckFlaeche(1, 1));
	}

	/**
	 * Testet die Methode kreisFlaeche in der Klasse BerechnungFlaeche
	 */
	public void testKreisFlaeche() {
		System.out.println(bf1.kreisFlaeche(3));
		System.out.println(bf1.kreisFlaeche(1));
	}

	/**
	 * Testet die Methode dreiecksFlaeche in der Klasse BerechnungFlaeche
	 */
	public void testDreiecksFlaeche() {
		System.out.println(bf1.dreiecksFlaeche(5, 4));
		System.out.println(bf1.dreiecksFlaeche(1, 1));
	}

	// Tests der Klasse Rauminhalt
	/**
	 * Testet die Methode pyramide in der Klasse Rauminhalt
	 */
	public void testPyramide (){
		System.out.println(ri1.pyramide(3.5, 5));
		System.out.println(ri1.pyramide(1, 1));
	}
	/**
	 * Testet die Methode Kegel in der Klasse Rauminhalt
	 */
	public void testKegel(){
		System.out.println(ri1.kegel(5, 3));
		System.out.println(ri1.kegel(1,1));
	}
	/**
	 * Testet die Methode Quader in der Klasse Rauminhalt
	 */
	public void testQuader(){
		System.out.println(ri1.quader(5));
		System.out.println(ri1.quader(1));
	}
	
	//Test der Klasse Zahlen
	/**
	 * Testet die Klasse Zahlen und ihre Methoden
	 */
	public void testZahlen(){
		z1.add(1);
		z1.add(2);
		z1.add(3);
		z1.add(4);
		z1.add(5);
		System.out.println(z1.min());
		System.out.println(z1.max());
		System.out.println(z1.summe());
	}
	
	public static void main(String[] args) {
		new test();
	}
}
