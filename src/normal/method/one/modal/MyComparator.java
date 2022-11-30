package normal.method.one.modal;

import java.util.Comparator;

public class MyComparator implements Comparator<Person>
{
	public int  compare(Person p1,Person p2)
	{
		return p1.getpName().compareTo(p2.getpName());
	}

}
