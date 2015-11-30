package smo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Zahlen {

	private List<Integer> list;
	
	public Zahlen() {
		list = new ArrayList<Integer>();
	}
	
	public void add (int a)
	{
		list.add(a);
	}
	
	public int min ()
	{
		Collections.sort(list);
		return list.get(0);
	}
	
	public int max ()
	{
		Collections.sort(list);
		return list.get(list.size());
	}
}
