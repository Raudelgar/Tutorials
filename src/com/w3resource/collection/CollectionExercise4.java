package com.w3resource.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionExercise4 {

	public static void main(String[] args) {
//		exercise1();
//		exercise2();
//		exercise3();
//		exercise4();
//		exercise5();
//		exercise6();
//		exercise7();
//		exercise8();
//		exercise9();
//		exercise9a();
//		exercise10();
//		exercise11();
//		exercise12();
//		exercise13();
//		exercise14();
//		exercise15();
		exercise16();

	}
	
	private static void exercise1() {
		//Write a Java program to create a new tree set, add some colors (string) and print out the tree set. 
		System.out.println("\nExercise 1: Write a Java program to create a new tree set, add some colors (string) and print out the tree set.");
		TreeSet<String> myColor = new TreeSet<>();
		myColor.add("Blue");
		myColor.add("White");
		myColor.add("Red");
		myColor.add("Black");
		System.out.println(myColor);
	}
	
	private static void exercise2() {
		//Write a Java program to iterate through all elements in a tree set.
		System.out.println("\nExercise 2: Write a Java program to iterate through all elements in a tree set.");
		TreeSet<String> myColor = new TreeSet<>();
		myColor.add("Blue");
		myColor.add("White");
		myColor.add("Red");
		myColor.add("Black");
		
		Iterator<String> itr = myColor.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	private static void exercise3() {
		//Write a Java program to add all the elements of a specified tree set to another tree set.
		System.out.println("\nExercise 3: Write a Java program to add all the elements of a specified tree set to another tree set.");
		TreeSet<Integer> num = new TreeSet<>();
		num.add(7);
		num.add(4);
		num.add(8);
		num.add(31);
		System.out.println("The num list is: "+num);
		
		TreeSet<Integer> myNum = new TreeSet<>();
		myNum.add(1);
		myNum.add(12);
		myNum.add(86);
		myNum.add(77);
		System.out.println("The myNum list is: "+myNum);
		myNum.addAll(num);
		System.out.println("Adding both list of numbers: "+myNum);
	}
	
	private static void exercise4() {
		//Write a Java program to create a reverse order view of the elements contained in a given tree set. 
		System.out.println("\nExercise 4: Write a Java program to create a reverse order view of the elements contained in a given tree set.");
		TreeSet<String> alp = new TreeSet<>();
		alp.add("A");
		alp.add("B");
		alp.add("C");
		alp.add("D");
		System.out.println("Original order of the list: "+alp);
		Iterator<String> unorderAlp = alp.descendingIterator();
		System.out.println("Reverse order of the list:");
		while(unorderAlp.hasNext()) {
			System.out.println(unorderAlp.next());
		}
	}
	
	private static void exercise5() {
		//Write a Java program to get the first and last elements in a tree set.
		System.out.println("\nExercise 5: Write a Java program to get the first and last elements in a tree set.");
		TreeSet<String> alp = new TreeSet<>();
		alp.add("A");
		alp.add("B");
		alp.add("C");
		alp.add("D");
		System.out.println("The whole list is: "+alp);
		System.out.println("The first element is: "+alp.first()+ " and the last element is: "+alp.last());
	}
	
	private static void exercise6() {
		//Write a Java program to clone a tree set list to another tree set.
		System.out.println("\nExercise 6: Write a Java program to clone a tree set list to another tree set.");
		TreeSet<String> myColor = new TreeSet<>();
		myColor.add("Blue");
		myColor.add("White");
		myColor.add("Red");
		myColor.add("Black");
		System.out.println("My color are: "+myColor);
		TreeSet<String> yourColor = new TreeSet<>();
		System.out.println("Checking before clone if the list is empty: "+yourColor.isEmpty());
		yourColor = (TreeSet<String>) myColor.clone();
		System.out.println("Your colors are: "+yourColor);
	}
	
	private static void exercise7() {
		//Write a Java program to get the number of elements in a tree set.
		System.out.println("\nExercise 7: Write a Java program to get the number of elements in a tree set.");
		TreeSet<String> myColor = new TreeSet<>();
		myColor.add("Blue");
		myColor.add("White");
		myColor.add("Red");
		myColor.add("Black");
		System.out.println("The number of elements in the list are: "+myColor.size());
	}
	
	private static void exercise8() {
		//Write a Java program to compare two tree sets.
		System.out.println("\nExercise 8: Write a Java program to compare two tree sets.");
		TreeSet<String> alp1 = new TreeSet<>();
		alp1.add("A");
		alp1.add("B");
		alp1.add("C");
		alp1.add("D");
		System.out.println("The first list: "+alp1);
		TreeSet<String> alp2 = new TreeSet<>();
		alp2.add("F");
		alp2.add("C");
		alp2.add("G");
		alp2.add("R");
		alp2.add("A");
		alp2.add("M");
		System.out.println("The second list: "+alp2);
		int count = 0;
		TreeSet<String> compA = new TreeSet<>();
		for(String list: alp2) {
			if(alp1.contains(list)) {
				count ++;
				compA.add(list);
			}
		}
		System.out.println("How many elements are in common between both list: "+count+ " ,they are: "+compA);
	}
	
	private static void exercise9() {
		//Write a Java program to find the numbers less than 7 in a tree set.
		System.out.println("\nExercise 9: Write a Java program to find the numbers less than 7 in a tree set.");
		TreeSet<Integer> num = new TreeSet<>();
		num.add(3);
		num.add(1);
		num.add(4);
		num.add(7);
		num.add(12);
		num.add(2);
		num.add(8);
		System.out.println("The complete list is: "+num);
		TreeSet<Integer> lessThanSeven = new TreeSet<>();
//		for(Integer list: num) {
//			if(list < 7) {
//				lessThanSeven.add(list);
//			}
//		}
		lessThanSeven = (TreeSet<Integer>) num.headSet(7);
		System.out.println("The elements less than 7 are: "+lessThanSeven);
	}
	
	private static void exercise9a() {
		//Write a Java program to find the numbers less than 7, inclusive in a tree set.
		System.out.println("\nExercise 10: Write a Java program to find the numbers less than 7, inclusive in a tree set.");
		TreeSet<Integer> num = new TreeSet<>();
		num.add(3);
		num.add(1);
		num.add(4);
		num.add(7);
		num.add(12);
		num.add(2);
		num.add(8);
		System.out.println("The completed list is: "+num);
		TreeSet<Integer> lessThanSeven = new TreeSet<>();
		lessThanSeven = (TreeSet<Integer>) num.headSet(7, true);
		System.out.println("The list less than or equal to 7 is: "+lessThanSeven);
	}
	
	private static void exercise10() {
		//Write a Java program to get the element in a tree set which is greater than or equal to the given element.
		System.out.println("\nExercise 10: Write a Java program to get the element in a tree set which is greater than or equal to the given element.");
		TreeSet<Integer> num = new TreeSet<>();
		num.add(3);
		num.add(1);
		num.add(4);
		num.add(7);
		num.add(12);
		num.add(2);
		num.add(8);
		System.out.println("The completed list is: "+num);
		int n = num.ceiling(6);
		System.out.println("Elements greater than or equal to 6: "+n);
	}
	
	private static void exercise11() {
		//Write a Java program to get the element in a tree set which is less than or equal to the given element.
		System.out.println("\nExercise 11: Write a Java program to get the element in a tree set which is less than or equal to the given element.");
		TreeSet<Integer> num = new TreeSet<>();
		num.add(3);
		num.add(1);
		num.add(4);
		num.add(7);
		num.add(12);
		num.add(2);
		num.add(8);
		
		int n = num.floor(6);
		System.out.println("The original list is: "+num);
		System.out.println("Elements less than or equal to 6: "+n);
	}
	
	private static void exercise12() {
		//Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.
		System.out.println("\nExercise 12: Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.");
		TreeSet<Integer> num = new TreeSet<>();
		num.add(3);
		num.add(1);
		num.add(4);
		num.add(7);
		num.add(12);
		num.add(2);
		num.add(8);
		
		int n = num.higher(6);
		System.out.println("The original list is: "+num);
		System.out.println("Elements strictly greater than or equal to 6: "+n);
	}
	
	private static void exercise13() {
		//Write a Java program to get an element in a tree set which is strictly less than the given element.
		System.out.println("\nExercise 13: Write a Java program to get an element in a tree set which is strictly less than the given element.");
		TreeSet<Integer> num = new TreeSet<>();
		num.add(3);
		num.add(1);
		num.add(4);
		num.add(7);
		num.add(12);
		num.add(2);
		num.add(8);
		
		int n = num.lower(7);
		System.out.println("The original list is: "+num);
		System.out.println("Elements strictly less than or equal to 7: "+n);
	}
	
	private static void exercise14() {
		//Write a Java program to retrieve and remove the first element of a tree set.
		System.out.println("\nExercise 14: Write a Java program to retrieve and remove the first element of a tree set.");
		TreeSet<String> alp1 = new TreeSet<>();
		alp1.add("A");
		alp1.add("B");
		alp1.add("C");
		alp1.add("D");
		System.out.println("The whole list is: "+alp1);
		String first = alp1.pollFirst();
		System.out.println("The first element is: "+first+ " and the list now is: "+alp1);
	}
	
	private static void exercise15() {
		//Write a Java program to retrieve and remove the last element of a tree set.
		System.out.println("\nExercise 15: Write a Java program to retrieve and remove the last element of a tree set.");
		TreeSet<String> alp1 = new TreeSet<>();
		alp1.add("A");
		alp1.add("B");
		alp1.add("C");
		alp1.add("D");
		System.out.println("The whole list is: "+alp1);
		String last = alp1.pollLast();
		System.out.println("The last element is: "+last+ " and the list now is: "+alp1);
	}
	
	private static void exercise16() {
		//Write a Java program to remove a given element from a tree set.
		System.out.println("\nExercise 16: Write a Java program to remove a given element from a tree set.");
		TreeSet<String> alp1 = new TreeSet<>();
		alp1.add("A");
		alp1.add("B");
		alp1.add("C");
		alp1.add("D");
		System.out.println("The whole list is: "+alp1);
		alp1.remove("C");
		System.out.println("Remove element C: "+alp1);
	}
}
