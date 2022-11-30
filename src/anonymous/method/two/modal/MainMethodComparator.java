package anonymous.method.two.modal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import normal.method.one.modal.Person;

public class MainMethodComparator 
{
	public static void main(String[] args) 
	{
		
	

	Person p1 = new Person(119,"maharaj","@maharaj.gmail");
	Person p2 = new Person(121,"ashok","@ashok.gmail");
	Person p3 = new Person(125,"david","@david.gmail");
	Person p4 = new Person(120,"raju","@raju.gmail");

	
	List<Person> arList = Arrays.asList(p1,p2,p3,p4);
	
	for(Person person : arList)
	{
		System.out.println("=======Before Sorting=========");
		System.out.println(person);
	}

	System.out.println("==========================================================");
	
	Comparator<Person> comp = new Comparator<Person>() {
		@Override
		public int compare(Person p1, Person p2)
		{
			return p1.getpName().compareTo(p2.getpName());
		}
		
	};
	
	Collections.sort(arList,comp);
	for(Person person : arList)
	{
		System.out.println("=======After Sorting=========");
		System.out.println(person);
	}

	
	
	}

}
