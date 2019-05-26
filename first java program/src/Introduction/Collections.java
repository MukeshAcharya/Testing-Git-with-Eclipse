package Introduction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		//Practicing Array List
		//the main advantage of using array list is that we can add/remove string value any time at any index.
		//it is dynamic method
		ArrayList<String> a=new ArrayList<String>();
		a.add("Mukesh");
		a.add("Rahul");
		a.add("Mukki");
		a.addAll(a);
		a.add("Acharya");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a);
//	}
//	public static void Hashset()
//	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Mukki");
		hs.add("Mukesh");
		hs.add("Canada");
		hs.add("US");
		hs.add("Australia");
		System.out.println(hs);
		System.out.println(hs.size());
		Iterator<String> i=hs.iterator();
		System.out.println(i.hasNext());
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	}		
	
	}

