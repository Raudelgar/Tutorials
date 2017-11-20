package com.w3resource.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class CollectionExercise3 {

	public static void main(String[] args) {
		exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();
		exercise6();
		exercise7();
		exercise8();
		exercise9();
		exercise10();
		exercise11();
		exercise12();
		
	}

	private static void exercise1() {
		//Write a Java program to append the specified element to the end of a hash set.
		System.out.println("\nExercise 1: Write a Java program to append the specified element to the end of a hash set.");
		//the duplicate values aren't store in the HashSet list, doesn't show any error.
		HashSet<Integer> num = new HashSet<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println(num);
	}
	
	private static void exercise2() {
		//Write a Java program to iterate through all elements in a hash list.
		System.out.println("\nExercise 2: Write a Java program to iterate through all elements in a hash list.");
		HashSet<String> alphabet = new HashSet<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		
		Iterator<String> its = alphabet.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
	}
	
	private static void exercise3() {
		//Write a Java program to get the number of elements in a hash set.
		System.out.println("\nExercise 3: Write a Java program to get the number of elements in a hash set.");
		HashSet<Integer> num = new HashSet<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		
		HashSet<String> alphabet = new HashSet<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");

		System.out.println("Number of elements in the num HashSet list: "+num.size());

		System.out.println("Number of elements in the alphabet HashSet list: "+alphabet.size());
	}
	
	private static void exercise4() {
		//Write a Java program to empty an hash set.
		System.out.println("\nExercise 4: Write a Java program to empty an hash set.");
		HashSet<Integer> num = new HashSet<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("The num list is: "+num);
		num.clear();
		System.out.println("After clear the list is empty: "+num.isEmpty());
	}
	
	private static void exercise5() {
		//Write a Java program to test a hash set is empty or not.
		System.out.println("\nExercise 5: Write a Java program to test a hash set is empty or not.");
		HashSet<String> alphabet = new HashSet<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		System.out.println("The alphabet list is empty: "+alphabet.isEmpty());
	}
	
	private static void exercise6() {
		//Write a Java program to clone a hash set to another hash set.
		System.out.println("\nExercise 6: Write a Java program to clone a hash set to another hash set.");
		HashSet<String> alphabet = new HashSet<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		
		HashSet<String> otherList = new HashSet<>();
		
		System.out.println("Size of alphabet list: "+alphabet.size()+" and Size of otherList is: "+otherList.size());
		otherList = (HashSet<String>) alphabet.clone();
		System.out.println("Size of the otherList after clone is: "+otherList.size());
	}
	
	private static void exercise7() {
		//Write a Java program to convert a hash set to an array.
		System.out.println("\nExercise 7: Write a Java program to convert a hash set to an array.");
		HashSet<Integer> num = new HashSet<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("The num HashSet list is: "+num);
		
		List<Integer> arr = new ArrayList<>(num);
		System.out.println("The arr List after convert from HashSet is: "+arr);
		System.out.println("Convert from HashSet to array string: ");
		HashSet<String> alphabet = new HashSet<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		
		String[] list = new String[alphabet.size()];
		alphabet.toArray(list);
		for(String l: list) {
		System.out.println(l);
		}
	}
	
	private static void exercise8() {
		//Write a Java program to convert a hash set to a tree set.
		System.out.println("\nExercise 8: Write a Java program to convert a hash set to a tree set.");
		HashSet<Integer> num = new HashSet<>();
		num.add(7);
		num.add(1);
		num.add(5);
		num.add(4);
		num.add(2);
		num.add(6);
		num.add(3);
		System.out.println("Print HashSet list: "+num);
		//HashSet also store the data ordered
		TreeSet<Integer> numTree = new TreeSet<>(num);
		System.out.println("Print the same list but on TreeSet: "+numTree);
		
		List<String> unorder_alp = new ArrayList<>();
		unorder_alp.add("E");
		unorder_alp.add("C");
		unorder_alp.add("A");
		unorder_alp.add("D");
		System.out.println("Print Array list unrder alphabet: "+unorder_alp);
		
		TreeSet<String> alp_Tree = new TreeSet<>(unorder_alp);
		System.out.println("Print unorder alphabet convert to TreeSet: "+alp_Tree);
	}
	
	private static void exercise9() {
		//Write a Java program to convert a hash set to a List/ArrayList.
		System.out.println("\nExercise 9: Write a Java program to convert a hash set to a List/ArrayList.");
		HashSet<String> alp = new HashSet<>();
		alp.add("E");
		alp.add("C");
		alp.add("A");
		alp.add("D");
		System.out.println("Print HashSet list unrder alphabet: "+alp);
		List<String> list = new ArrayList<>(alp);
		System.out.println("Print List/ArrayList from the HashSet list:"+list);
	}
	
	private static void exercise10() {
		//Write a Java program to compare two hash set.
		System.out.println("\nExercise 10: Write a Java program to compare two hash set.");
		HashSet<Integer> num1 = new HashSet<>();
		num1.add(4);
		num1.add(9);
		num1.add(8);
		num1.add(3);
		
		HashSet<Integer> num2 = new HashSet<>();
		num2.add(2);
		num2.add(7);
		num2.add(3);
		num2.add(9);
		
		HashSet<Integer> comp_num = new HashSet<>();
		for(Integer n: num2) {
		comp_num.add(num1.contains(n) ? 1:0);
		}
		
		System.out.println("Print num1: "+num1);
		System.out.println("Print num2: "+num2);
		//Just print one 0 and one 1 because doesn't allow duplicate
		System.out.println("Print comp_num: "+comp_num);
		for(Integer a: num1) {
			System.out.println("Compare both list directly from num1:"+num2.contains(a));
		}
	}
	
	private static void exercise11() {
		//Write a Java program to compare two sets and retain elements which are same on both sets.
		System.out.println("\nExercise 11: Write a Java program to compare two sets and retain elements which are same on both sets.");
		HashSet<Integer> num1 = new HashSet<>();
		num1.add(4);
		num1.add(9);
		num1.add(8);
		num1.add(3);
		
		HashSet<Integer> num2 = new HashSet<>();
		num2.add(2);
		num2.add(7);
		num2.add(3);
		num2.add(9);
		
		HashSet<Integer> comp_num = new HashSet<>();
			for(Integer a : num1) {
				if(num2.contains(a)) {
					comp_num.add(a);
				}
			}
			System.out.println("Print num1: "+num1);
			System.out.println("Print num2: "+num2);
			System.out.println("Print the common number between both list: "+comp_num);
			
		HashSet<String> alp1 = new HashSet<>();
		alp1.add("D");
		alp1.add("K");
		alp1.add("R");
		alp1.add("M");
		alp1.add("J");
		System.out.println("Print alp1: "+alp1);
		HashSet<String> alp2 = new HashSet<>();
		alp2.add("R");
		alp2.add("M");
		alp2.add("J");
		alp2.add("Z");
		System.out.println("Print alp2: "+alp2);
		alp1.retainAll(alp2);
		System.out.println("Print alp: "+alp1);
	}
	
	private static void exercise12() {
		//Write a Java program to remove all of the elements from a hash set.
		System.out.println("\nExercise 12: Write a Java program to remove all of the elements from a hash set.");
		HashSet<String> alp1 = new HashSet<>();
		alp1.add("D");
		alp1.add("K");
		alp1.add("R");
		alp1.add("M");
		alp1.add("J");
		System.out.println("Print size form the list: "+alp1.size());
		alp1.clear();
		System.out.println("Print size form the list after remove all: "+alp1.size());
	}
}
