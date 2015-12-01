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
	}
	public void testRechteckFlaeche (){
		System.out.println(bf1.rechteckFlaeche(1.3,5.6));
		System.out.println(bf1.rechteckFlaeche(2.7,7.8));
	}
	public static void main(String[] args) {
		new test();
	}
}
