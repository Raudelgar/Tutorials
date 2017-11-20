package com.w3resource.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionExercise2 {

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
		 exercise13();
		 exercise14();
		 exercise15();
		 exercise16();
		 exercise17();
		 exercise18();
		 exercise19();
		 exercise20();
		 exercise21();
		 exercise22();
		 exercise23();
		 exercise24();
		 exercise25();
		 exercise26();

	}

	private static void exercise1() {
		// Write a Java program to append the specified element to the end of a
		// linked list.
		System.out.println(
				"\nExercise 1: Write a Java program to append the specified element to the end of a linked list.");
		LinkedList<String> animal = new LinkedList<>();
		animal.add("tiger");
		animal.add("cat");
		animal.add("dog");
		animal.add("horse");
		System.out.println("The list of animal is " + animal);
	}

	private static void exercise2() {
		// Write a Java program to iterate through all elements in a linked
		// list.
		System.out.println("\nExercise 2: Write a Java program to iterate through all elements in a linked list.");
		LinkedList<String> animal = new LinkedList<>();
		animal.add("tiger");
		animal.add("cat");
		animal.add("dog");
		animal.add("horse");
		for (String a : animal) {
			System.out.println(a);
		}
	}

	private static void exercise3() {
		// Write a Java program to iterate through all elements in a linked list
		// starting at the specified position.
		System.out.println(
				"\nExercise 3: Write a Java program to iterate through all elements in a linked list starting at the specified position.");
		LinkedList<String> alphabet = new LinkedList<>();
		alphabet.add("R");
		alphabet.add("M");
		alphabet.add("J");
		alphabet.add("C");
		Iterator<String> l = alphabet.listIterator(2);
		while (l.hasNext()) {
			System.out.println(l.next());
		}
	}

	private static void exercise4() {
		// Write a Java program to iterate a linked list in reverse order.
		System.out.println("\nExercise 4: Write a Java program to iterate a linked list in reverse order.");
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("Print the original order of the linked list");
		for (Integer a : num) {
			System.out.println(a);
		}
		System.out.println("Print the reverse order of the linked list");
		Iterator<Integer> list = num.descendingIterator();
		while (list.hasNext()) {
			System.out.println(list.next());
		}
	}

	private static void exercise5() {
		// Write a Java program to insert the specified element at the specified
		// position in the linked list.
		System.out.println(
				"\nExercise 5: Write a Java program to insert the specified element at the specified position in the linked list.");
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("Print the original linked list");
		for (Integer a : num) {
			System.out.println(a);
		}
		System.out.println("Insert the number 77 at 2dn position");
		num.add(1, 77);
//		for (Integer b : num) {
//			System.out.println(b);
//		}
		Iterator<Integer> b = num.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
	}
	
	private static void exercise6() {
		//Write a Java program to insert elements into the linked list at the first and last position.
		System.out.println("\nExercise 6: Write a Java program to insert elements into the linked list at the first and last position.");
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("Print original linked list");
		Iterator<Integer> l = num.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("Insert element at first and last position");
		num.addFirst(77);
		num.addLast(99);
		Iterator<Integer> list = num.iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
	}
	
	private static void exercise7() {
		//Write a Java program to insert the specified element at the front of a linked list.
		System.out.println("\nExercise 7: Write a Java program to insert the specified element at the front of a linked list.");
		LinkedList<String> word = new LinkedList<>();
		word.add("Second");
		word.add("Third");
		word.add("Fourth");
		System.out.println("Print orginal Linked list:");
		for(String a : word) {
			System.out.println(a);
		}
		System.out.println("Add element at the front");
		word.offerFirst("First");
		Iterator<String> list = word.iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
	}
	
	private static void exercise8() {
		//Write a Java program to insert the specified element at the end of a linked list.
		System.out.println("\nExercise 8: Write a Java program to insert the specified element at the end of a linked list.");
		LinkedList<String> word = new LinkedList<>();
		word.add("Second");
		word.add("Third");
		word.add("Fourth");
		System.out.println("Print orginal Linked list:");
		for(String a : word) {
			System.out.println(a);
		}
		System.out.println("Add element at the end");
		word.offerLast("Last");
		Iterator<String> list = word.iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
	}
	
	private static void exercise9() {
		//Write a Java program to insert some elements at the specified position into a linked list.
		System.out.println("\nExercise 9: Write a Java program to insert some elements at the specified position into a linked list.");
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("Print original linked list:");
		Iterator<Integer> l = num.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("Insert new elements");
		LinkedList<Integer> num2 = new LinkedList<>();
		num2.add(77);
		num2.add(99);
		num2.add(31);
		num.addAll(3, num2);
		Iterator<Integer> list = num.iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
	}
	
	private static void exercise10() {
		//Write a Java program to get the first and last occurrence of the specified elements in a linked list.
		System.out.println("\nExercise 10: Write a Java program to get the first and last occurrence of the specified elements in a linked list.");
		LinkedList<String> alphabet = new LinkedList<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		System.out.println("Print the whole linked list:");
		for(String l : alphabet) {
			System.out.println(l);
		}
		System.out.println("Retreive the first and last occurrence of the list:");
		LinkedList<String> smallAlphabet = new LinkedList<>();
		smallAlphabet.add(alphabet.getFirst());
		smallAlphabet.add(alphabet.getLast());
		Iterator<String> sl = smallAlphabet.iterator();
		while(sl.hasNext()) {
			System.out.println(sl.next());
		}
	}
	
	private static void exercise11() {
		//Write a Java program to display the elements and their positions in a linked list.
		System.out.println("\nExercise 11: Write a Java program to display the elements and their positions in a linked list.");
		LinkedList<String> alphabet = new LinkedList<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		for(int i = 0 ; i < alphabet.size(); i++) {
			System.out.println("Index " +i+" : " +alphabet.get(i));
		}
	}
	
	private static void exercise12() {
		//Write a Java program to remove a specified element from a linked list.
		System.out.println("\nExercise 12: Write a Java program to remove a specified element from a linked list.");
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		Iterator<Integer> list = num.iterator();
		System.out.println("Print original linked list: ");
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.println("Remove the second element: ");
		num.remove(1);
		Iterator<Integer> l = num.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
	}
	
	private static void exercise13() {
		//Write a Java program to remove first and last element from a linked list.
		System.out.println("\nExercise 13: Write a Java program to remove first and last element from a linked list.");
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		Iterator<Integer> list = num.iterator();
		System.out.println("Print original linked list: ");
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.println("Removing first and last element from the linked list: ");
		num.removeFirst();
		num.removeLast();
		for(Integer a : num) {
			System.out.println(a);
		}
	}
	
	private static void exercise14() {
		//Write a Java program to remove all the elements from a linked list.
		System.out.println("\nExercise 14: Write a Java program to remove all the elements from a linked list.");
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		Iterator<Integer> list = num.iterator();
		System.out.println("Print original linked list: ");
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.println("Removing all elements from the list: ");
		num.clear();
		//clear() is faster than removeAll()
		if(num.isEmpty()) {
			System.out.println("The list is empty");
		}
		System.out.println("The list has: "+num);
	}
	
	private static void exercise15() {
		//Write a Java program of swap two elements in an linked list.
		System.out.println("\nExercise 15: Write a Java program of swap two elements in an linked list.");
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		Iterator<Integer> list = num.iterator();
		System.out.println("Print original linked list: ");
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.println("Swap second element with the third element: ");
		Collections.swap(num, 1, 2);
		for(Integer a : num) {
			System.out.println(a);
		}
	}
	
	private static void exercise16() {
		//Write a Java program to shuffle the elements in a linked list.
		System.out.println("\nExercise 16: Write a Java program to shuffle the elements in a linked list.");
		LinkedList<String> alphabet = new LinkedList<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		System.out.println("Print the original list");
		for(String a : alphabet) {
			System.out.println(a);
		}
		Collections.shuffle(alphabet);
		System.out.println("Shuffle the list: ");
		Iterator<String> list = alphabet.iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
	}
	
	private static void exercise17() {
		//Write a Java program to join two linked lists.
		System.out.println("\nExercise 17: Write a Java program to join two linked lists.");
		LinkedList<String> word1 = new LinkedList<>();
		word1.add("Hello");
		LinkedList<String> word2 = new LinkedList<>();
		word2.add("World");
		System.out.println("Print first word: "+word1);
		System.out.println("Print second word: "+word2);
		LinkedList<String> oneWord = new LinkedList<>();
		oneWord.addAll(word1);
		oneWord.addAll(word2);
		System.out.println("Print first word + second word: "+oneWord);
	}
	
	private static void exercise18() {
		//Write a Java program to clone an linked list to another linked list.
		System.out.println("\nExercise 18: Write a Java program to clone an linked list to another linked list.");
		//copy() doesn't work with Generics
		LinkedList<Integer> num1 = new LinkedList<>();
		num1.add(0);
		num1.add(2);
		num1.add(4);
		System.out.println("Print number list one: "+num1);
		LinkedList<Integer> num2 = new LinkedList<>();
		num2.add(1);
		num2.add(3);
		num2.add(7);
		System.out.println("Print number list second: "+num2);
		num2 = (LinkedList<Integer>) num1.clone();
		System.out.println("Print number list second after clone from number list one: "+num2);
	}
	
	private static void exercise19() {
		//Write a Java program to remove and return the first element of a linked list.
		System.out.println("\nExercise 19: Write a Java program to remove and return the first element of a linked list.");
		LinkedList<String> alphabet = new LinkedList<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		System.out.println("Print the original list");
		for(String a : alphabet) {
			System.out.println(a);
		}
		System.out.println("Remove and return the first element: ");
		String result = alphabet.poll();
		//alphabet.pop() this is another solution with the same result
		System.out.println("First element: "+result+" and the rest of the list "+alphabet);
	}
	
	private static void exercise20() {
		//Write a Java program to retrieve but does not remove, the first element of a linked list.
		System.out.println("\nExercise 20: Write a Java program to retrieve but does not remove, the first element of a linked list.");
		LinkedList<String> alphabet = new LinkedList<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		System.out.println("Print the original list "+alphabet);
		System.out.println("Retreive the first element without remove it: ");
		String first = alphabet.peekFirst();
		System.out.println("The first element is : "+first+ " and list is : "+alphabet);
	}
	
	private static void exercise21() {
		//Write a Java program to retrieve but does not remove, the last element of a linked list.
		System.out.println("\nExercise 21: Write a Java program to retrieve but does not remove, the first element of a linked list.");
		LinkedList<String> alphabet = new LinkedList<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		System.out.println("Print the original list "+alphabet);
		System.out.println("Retreive the last element without remove it: ");
		String last = alphabet.peekLast();
		System.out.println("The first element is : "+last+ " and list is : "+alphabet);
	}
	
	private static void exercise22() {
		//Write a Java program to check if a particular element exists in a linked list.
		System.out.println("\nExercise 22: Write a Java program to check if a particular element exists in a linked list.");
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("Check if the list has the number 7: ");
		if(num.contains(7)) {
			System.out.println("The number 7 exist!");
		}else {
		System.out.println("Number not found");
		}
	}
	
	private static void exercise23() {
		//Write a Java program to convert a linked list to array list.
		System.out.println("\nExercise 23: Write a Java program to convert a linked list to array list.");
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("Print the linked list: "+num);
		List<Integer> otherNum = new ArrayList<>(num);
		System.out.println("Check is the convertion works: "+otherNum);
	}
	
	private static void exercise24() {
		//Write a Java program to compare two linked lists.
		System.out.println("\nExercise 24: Write a Java program to compare two linked lists.");
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("First list: "+num);
		LinkedList<Integer> num1 = new LinkedList<>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		System.out.println("Second list: "+num1);
		LinkedList<Integer> compList = new LinkedList<>();
		for(Integer l: num) {
			compList.add(num1.contains(l) ? 1:0);
		}
		System.out.println("Comparing both list :"+compList);
	}
	
	private static void exercise25() {
		//Write a Java program to test an linked list is empty or not.
		System.out.println("\nExercise 25: Write a Java program to test an linked list is empty or not.");
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		LinkedList<Integer> num1 = new LinkedList<>();
		System.out.println("The list num is empty: "+num.isEmpty()+ "\nAnd the list num1 is empty: "+num1.isEmpty());
	}
	
	private static void exercise26() {
		//Write a Java program to replace an element in a linked list.
		System.out.println("\nExercise 26: Write a Java program to replace an element in a linked list.");
		LinkedList<String> alphabet = new LinkedList<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		System.out.println("Print the original list:\n"+alphabet);
		System.out.println("Replace the third element of the list: ");
		alphabet.set(2, "R");
		System.out.println(alphabet);
	}
}
