package javaProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day1 {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(3);
		myList.add(2);
		myList.add(5);
		myList.add(6);
		myList.add(6);
		myList.add(5);

		Set<Integer> uniqueSet = new HashSet<>(myList);
		List<Integer> filteredList = new ArrayList<>(uniqueSet);
		System.out.println(filteredList);
		System.out.println(filteredList.size());
		
		List<String> list=new ArrayList<>();
		list.add("rahul");
		list.add("rahul");
		list.add("Kumar");
		list.add("Dev");
		
		Set<String>set=new HashSet<>(list);
		List<String> filteredlist=new ArrayList<>(set);
		System.out.println(filteredlist);
		System.out.println(filteredlist.size());
	}
	
}
