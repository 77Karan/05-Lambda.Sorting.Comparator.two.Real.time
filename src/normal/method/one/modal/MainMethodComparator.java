package normal.method.one.modal;

import java.util.ArrayList;
import java.util.Collections;

public class MainMethodComparator 
{
	public static void main(String[] args)
	{
		Person p1 = new Person(121,"ashok","@ashok.gmail");
		Person p2 = new Person(125,"david","@david.gmail");
		Person p3 = new Person(120,"raju","@raju.gmail");
		Person p4 = new Person(119,"maharaj","@maharaj.gmail");
		
		
		ArrayList<Person> arList = new ArrayList<Person>();
		arList.add(p1);
		arList.add(p2);
		arList.add(p3);
		arList.add(p4);
		
		for(Person person : arList)
		{
			System.out.println("=======Before Sorting=====");
			System.out.println(person);
		}
		
		System.out.println("===============================================================");
		
		Collections.sort(arList,new MyComparator());
		for(Person person : arList)
		{
			System.out.println("=======After Sorting=====");
			System.out.println(person);
		}
		
		
		

	}

}
