package smo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * eine utilty class f�r integer
 * 
 * @author kilian mock
 * @version 30.11.15
 */
public class Zahlen {

	private List<Integer> list;

	/**
	 * constructor initialisiert die/den parameter
	 */
	public Zahlen() {
		list = new ArrayList<Integer>();
	}

	/**
	 * birgt die m�glichkeit eine zahl zur liste hinzuzf�gen
	 * 
	 * @param a die zahl die hinzugef�gt werden soll
	 */
	public void add(int a) {
		list.add(a);
	}

	/**
	 * gibt den kleinsten wert der liste zur�ck
	 * 
	 * @return der kleinsten wert der liste
	 */
	public int min() {
		Collections.sort(list);
		return list.get(0);
	}

	/**
	 * gibt den gr��ten wert der liste zur�ck
	 * 
	 * @return der gr��ten wert der liste
	 */
	public int max() {
		Collections.sort(list);
		return list.get(list.size());
	}

	/**
	 * gibt die summe aller elmente zur�ck
	 * 
	 * @return die summe
	 */
	public int summe() {
		int summe = 0;
		for (int i = 0; i < list.size(); i++)
			summe = summe + list.get(i);
		return summe;
	}
}
