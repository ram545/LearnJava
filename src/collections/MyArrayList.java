import java.util.ArrayList;
import java.lang.System;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ListIterator;
import java.lang.String;

class Record{
	String name;
	int age;
	boolean result;

	Record(String name, int age, boolean result){
		this.name = name;
		this.age = age;
		this.result = result;
	}

	public String toString(){
		return (name + " " + age + " " + result + "\n");
	}
}

class SortByName implements Comparator<Record>{

	public int compare(Record a, Record b){
		return a.name.compareTo(b.name);
	}
}


class MyArrayList{
	static ArrayList<Integer> al;
	static ArrayList<Record> records;

	MyArrayList(){
		al = new ArrayList<Integer>();
		records = new ArrayList<Record>();
	}

	MyArrayList(int capacity){
		al = new ArrayList<Integer>(capacity);
		records = new ArrayList<Record>(capacity);
	}

	static void intArrayList(){
		al.add(2);
		al.add(4);
		al.add(5);

		try {
		System.out.println("get" + al.get(4));
		System.out.println("get" + al.get(1));
		}
		catch(IndexOutOfBoundsException ex){
			System.out.println("Out of bounds: " + ex.getMessage());
		}
		catch(Exception e){
			System.out.println("Exception Caught");
		}

		al.add(5);
		al.add(7);
		al.add(4,25);
		al.add(9);

		al.set(al.indexOf(5), 3);

		System.out.println(al.contains(5));
		System.out.println(al.contains(10));

		al.remove(3);

		for(Integer a : al)
			System.out.print(a + " ");
		System.out.println("");

		Collections.sort(al);

		Iterator<Integer> iter = al.iterator();
		while( iter.hasNext()){
			System.out.print(iter.next() + " ");
		}
		System.out.println("");

		// not working leaving for future modification
		// iter = al.iterator();
		// iter.hasEachRemaining(  a -> {System.out.print(a);});
		// System.out.println("");

		// iterate in reverse
		ListIterator revIter = al.listIterator(al.size());
		while( revIter.hasPrevious())
			System.out.print(revIter.previous() + " ");
		System.out.println(""); 

		// has protected access hence can only be used after inheriting it
		// al.removeRange(0,2);

		ArrayList<Integer> al2 = new ArrayList<Integer>();

		al2.add(58);
		al2.add(56);

		al2.addAll(al);

		al2.add(100);

		al2.removeIf(a -> { return (a%2 == 0) ? false : true;});

		al2.forEach(a -> {System.out.print(a + " ");});
		System.out.println("");


		al2.removeAll(al);

		al2.forEach(a -> {System.out.print(a + " ");});
		System.out.println("");

		al.clear();
		al2.clear();

		System.out.println("Is Empty: " + al2.isEmpty());

		al.forEach(a -> {System.out.print(a + " ");});
		System.out.println("");
	}

	static void recordArrayList(){
		records.add(new Record("ram",25,true));
		records.add(new Record("harish",25,true));
		records.add(new Record("mallesh",25,false));

		records.forEach( i -> {System.out.print(i + " ");});

		records.set(2, new Record("D'souza",35,false));

		System.out.println(records.get(1));

		records.add(new Record("ruby",18,true));
		records.add(new Record("nash",20,false));

		Collections.sort(records, new SortByName());

		ListIterator iter = records.listIterator(records.size());
		while(iter.hasPrevious())
			System.out.print(iter.previous());
	}
	

	public static void main(String args[]){
		MyArrayList m = new MyArrayList(6);
		intArrayList();
		recordArrayList();
	}
}