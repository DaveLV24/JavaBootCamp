package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; //added it but why

import sef.module9.sample.ListSample;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List list = new ArrayList();
		
		list.add("Bob");
		list.add("Jen");
		list.add("Janis");
		
		//2 - Call print method to print the list passed as its parameter.
	    ListActivity obj=new ListActivity();
	    obj.print(list);
	}
	
	void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
		//call a method which prints this list
		Iterator i = l.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next());

	
		
	}
}
