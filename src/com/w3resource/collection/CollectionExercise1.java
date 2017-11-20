package com.w3resource.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExercise1 {

	public static void main(String[] args) {
		 exercise1();
		 exercise2();
		 exercise2a();
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
		 exercise13a();
		exercise14();
		exercise15();
		exercise16();
		exercise17();
		exercise17a();
		exercise19();
		exercise20();
		exercise21();
		exercise22();

	}

	private static void exercise1() {

		System.out.println(
				"Execise 1: Write a Java program to create a new array list, add some colors (string) and print out the collection.");
		List<String> list_color = new ArrayList<String>();
		list_color.add("Blue");
		list_color.add("Red");
		list_color.add("White");
		System.out.println(list_color + "\n");

	}

	private static int[] exercise2() {
		// Write a Java program to iterate through all elements in a array list.
		System.out.println("Execise 2: Write a Java program to iterate through all elements in a array list.");
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		return arr;
	}

	private static void exercise2a() {
		// Write a Java program to iterate through all elements in a array list.
		System.out.println("Execise 2a: Write a Java program to iterate through all elements in a array list.");
		List<String> list_color = new ArrayList<String>();
		list_color.add("Blue");
		list_color.add("Red");
		list_color.add("White");
		for (String list : list_color)
			System.out.println(list);
	}

	private static void exercise3() {
		// Write a Java program to insert an element into the array list at the
		// first position.
		System.out.println(
				"\n Execise 3: Write a Java program to insert an element into the array list at the first position.");
		List<String> list_color = new ArrayList<String>();
		list_color.add("Blue");
		list_color.add("Red");
		list_color.add("White");
		for (String list : list_color)
			System.out.println(list);

		System.out.println("Adding new element at the beginning");
		list_color.add(0, "First");
		for (String list : list_color)
			System.out.println(list);
	}

	private static void exercise4() {
		// Write a Java program to retrieve an element (at a specified index)
		// from a given array list.
		System.out.println(
				"\n Execise 4: Write a Java program to retrieve an element (at a specified index) from a given array list.");
		System.out.println("Retreive third number:");
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < arr.length; i++) {
		}
		System.out.println(arr[2]);

		System.out.println("Print all string list");
		List<String> list_color = new ArrayList<String>();
		list_color.add("Blue");
		list_color.add("Red");
		list_color.add("White");
		for (String list : list_color) {
			System.out.println(list);
		}
		String one = list_color.get(0);
		System.out.println("Retreive first color:");
		System.out.println(one);
	}

	private static void exercise5() {
		// Write a Java program to update specific array element by given
		// element.
		System.out.println("\nExecise 5: Write a Java program to update specific array element by given element.");
		System.out.println("Print old string list");
		List<String> list_color = new ArrayList<String>();
		list_color.add("Blue");
		list_color.add("Red");
		list_color.add("White");
		for (String list : list_color) {
			System.out.println(list);
		}
		System.out.println("Print new string list");
		list_color.set(0, "Lightblue");
		for (String newList : list_color) {
			System.out.println(newList);
		}
	}

	private static void exercise6() {
		// Write a Java program to remove the third element from a array list.
		System.out.println("\nExecise 6: Write a Java program to remove the third element from a array list.");
		System.out.println("Print old string list");
		List<String> list_color = new ArrayList<String>();
		list_color.add("Blue");
		list_color.add("Red");
		list_color.add("White");
		list_color.add("LastColor");
		for (String list : list_color) {
			System.out.println(list);
		}
		System.out.println("Removing the third element:");
		list_color.remove(2);
		for (String list : list_color) {
			System.out.println(list);
		}
	}

	private static void exercise7() {
		// Write a Java program to search an element in a array list.
		System.out.println("\nExecise 7: Write a Java program to search an element in a array list.");
		List<String> list_color = new ArrayList<String>();
		list_color.add("Blue");
		list_color.add("Red");
		list_color.add("White");
		list_color.add("LastColor");
		if (list_color.contains("Blue")) {
			System.out.println("List of color has Blue");
		} else {
			System.out.println("List of color doesn't has Blue");
		}
	}

	private static void exercise8() {
		// Write a Java program to sort a given array list.
		System.out.println("\nExecise 8: Write a Java program to sort a given array list.");
		List<Integer> num = new ArrayList<Integer>();
		num.add(2);
		num.add(4);
		num.add(1);
		num.add(5);
		num.add(7);
		System.out.println("Print unsorted list");
		for (Integer unSortedNum : num) {
			System.out.println(unSortedNum);
		}
		System.out.println("Print sorted list");
		Collections.sort(num);
		for (Integer sortedNum : num) {
			System.out.println(sortedNum);
		}
		System.out.println("Print unsorted alphabet");
		List<String> list_alphabet = new ArrayList<String>();
		list_alphabet.add("M");
		list_alphabet.add("A");
		list_alphabet.add("R");
		list_alphabet.add("L");
		list_alphabet.add("G");
		for (String unSortedList : list_alphabet) {
			System.out.println(unSortedList);
		}
		System.out.println("Print sorted alphabet");
		Collections.sort(list_alphabet);
		for (String sortedList : list_alphabet) {
			System.out.println(sortedList);
		}
	}

	private static void exercise9() {
		// Write a Java program to copy one array list into another.
		System.out.println("\nExecise 9: Write a Java program to copy one array list into another.");
		List<String> or_alphabet = new ArrayList<String>();
		or_alphabet.add("M");
		or_alphabet.add("A");
		or_alphabet.add("R");
		or_alphabet.add("L");
		or_alphabet.add("G");
		System.out.println("Print or_alphabet");
		for (String originalList : or_alphabet) {
			System.out.println(originalList);
		}
		List<String> co_alphabet = new ArrayList<String>();
		co_alphabet.add("C");
		co_alphabet.add("J");
		co_alphabet.add("V");
		co_alphabet.add("G");
		co_alphabet.add("R");
		System.out.println("Print co_alphabet");
		for (String copyList : co_alphabet) {
			System.out.println(copyList);
		}
		Collections.copy(co_alphabet, or_alphabet);
		System.out.println("Print final alphabet");
		for (String finalList : co_alphabet) {
			System.out.println(finalList);
		}
	}

	private static void exercise10() {
		// Write a Java program to shuffle elements in a array list.
		System.out.println("\nExecise 10: Write a Java program to shuffle elements in a array list.");
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("Print original list of numbers");
		for (Integer original_list : num) {
			System.out.println(original_list);
		}
		System.out.println("Print shuffle list of numbers");
		Collections.shuffle(num);
		for (Integer shuffle_list : num) {
			System.out.println(shuffle_list);
		}
	}

	private static void exercise11() {
		// Write a Java program to reverse elements in a array list.
		System.out.println("\nExecise 11: Write a Java program to reverse elements in a array list.");
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("Print original order of the list");
		for (Integer original_order : num) {
			System.out.println(original_order);
		}
		Collections.reverse(num);
		System.out.println("Print reverse order of the list");
		for (Integer reverse_order : num) {
			System.out.println(reverse_order);
		}
	}

	private static void exercise12() {
		// Write a Java program to extract a portion of a array list.
		System.out.println("\nExecise 12: Write a Java program to extract a portion of a array list.");
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("Print the whole list");
		for (Integer all_list : num) {
			System.out.println(all_list);
		}
		List<Integer> sub_num = num.subList(2, num.size());
		System.out.println("Print portion of the original list");
		for (Integer sub_list : sub_num) {
			System.out.println(sub_list);
		}
	}

	private static void exercise13() {
		// Write a Java program to compare two array lists.
		System.out.println("\nExecise 13: Write a Java program to compare two array lists.");
		List<String> employee = new ArrayList<String>();
		employee.add("Raudel");
		employee.add("Marjorie");
		employee.add("Julio");
		employee.add("Raidel");
		employee.add("Roly");
		employee.add("Carly");

		List<String> manager = new ArrayList<String>();
		manager.add("Raudel");
		manager.add("Marjorie");
		manager.add("Julio");

		List<String> comparing_list = new ArrayList<String>();
		for (String final_list : employee) {
			comparing_list.add(manager.contains(final_list) ? "Yes" : "No");
		}
		System.out.println(comparing_list);
	}

	private static void exercise13a() {
		System.out.println("\nExecise 13a: Write a Java program to compare two array lists and retreive the name...");
		List<String> employee = new ArrayList<String>();
		employee.add("Raudel");
		employee.add("Marjorie");
		employee.add("Julio");
		employee.add("Raidel");
		employee.add("Roly");
		employee.add("Carly");

		List<String> manager = new ArrayList<String>();
		manager.add("Raudel");
		manager.add("Marjorie");
		manager.add("Julio");

		List<String> comparing_list = new ArrayList<String>();
		for (String final_list : employee) {
			if (manager.contains(final_list)) {
				comparing_list.add(final_list);
			} else {
				System.out.println(final_list + " is just an Employee");
			}
		}
		for (String c : comparing_list) {
			System.out.println(c + " is Manager and Employee");
		}
	}

	private static void exercise14() {
		// Write a Java program of swap two elements in an array list.
		System.out.println(
				"\nExecise 14: Write a Java program of swap the first and the last elements in an array list.");
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("Print the list before swap");
		for (Integer b : num) {
			System.out.println(b);
		}
		Integer last = num.size() -1;
		Collections.swap(num, 0, last);
		System.out.println("Print the list after swap");
		for(Integer a : num) {
			System.out.println(a);
		}
	}
	
	private static void exercise15() {
		//Write a Java program to join two array lists.
		System.out.println("\nExecise 15: Write a Java program to join two array lists.");
		List<Integer> num1 = new ArrayList<Integer>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		System.out.println("Print list 1");
		for(Integer a : num1) {
			System.out.println(a);
		}
		
		List<Integer> num2 = new ArrayList<Integer>();
		num2.add(4);
		num2.add(5);
		num2.add(6);
		num2.add(7);
		System.out.println("Print list 2");
		for(Integer b : num2) {
			System.out.println(b);
		}
		List<Integer> num3 = new ArrayList<Integer>();
		num3.addAll(num1);
		num3.addAll(num2);
		System.out.println("Print list 1 + 2");
		for(Integer c : num3) {
			System.out.println(c);
		}
	}
	
	private static void exercise16() {
		//Write a Java program to clone an array list to another array list.
		System.out.println("\nExecise 16: Write a Java program to clone an array list to another array list.");
		ArrayList<String> employee = new ArrayList<String>();
		employee.add("Raudel");
		employee.add("Marjorie");
		employee.add("Julio");
		employee.add("Raidel");
		employee.add("Roly");
		employee.add("Carly");
		System.out.println("Print original list"); 
		for(String a : employee) {
			System.out.println(a);
		}
		ArrayList<String> friend = (ArrayList<String>)employee.clone();
		System.out.println("Print clone list");
		for(String b : friend) {
			System.out.println(b);
		}	
	}
	
	private static void exercise17() {
		//Write a Java program to empty using clear() an array list.
		System.out.println("\nExecise 17: Write a Java program to empty an array list.");
		ArrayList<String> employee = new ArrayList<String>();
		employee.add("Raudel");
		employee.add("Marjorie");
		employee.add("Julio");
		employee.add("Raidel");
		employee.add("Roly");
		employee.add("Carly");
		int content = employee.size();
		System.out.println("Original size for the lis is "+content);
		String testName = employee.get(1);
		System.out.println("Checking values in the list: "+testName);
		employee.clear();
		int otherContent = employee.size();
		System.out.println("After clear the list the size is "+otherContent);		
	}
	
	private static void exercise17a() {
		//Write a Java program to empty using removeAll() an array list.
		System.out.println("\nExecise 17: Write a Java program to empty an array list.");
		ArrayList<String> employee = new ArrayList<String>();
		employee.add("Raudel");
		employee.add("Marjorie");
		employee.add("Julio");
		employee.add("Raidel");
		employee.add("Roly");
		employee.add("Carly");
		int content = employee.size();
		System.out.println("Original size for the lis is "+content);
		String testName = employee.get(1);
		System.out.println("Checking values in the list: "+testName);
		System.out.println("Checking before is the list is empyt or not: "+employee.isEmpty());
		employee.removeAll(employee);
		int otherContent = employee.size();
		System.out.println("After clear the list the size is "+otherContent);
		System.out.println("Checking after is the list is empyt or not: "+employee.isEmpty());
	}
	
	private static void exercise19() {
		//Write a Java program to trim the capacity of an array list the current list size.
		System.out.println("\nExecise 19: Write a Java program to trim the capacity of an array list the current list size.");
		ArrayList<Integer> num = new ArrayList<Integer>(10);
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.trimToSize();
		System.out.println("The new size is "+num.size());
	}
	
	private static void exercise20() {
		//Write a Java program to increase the size of an array list.
		System.out.println("\nExecise 20: Write a Java program to increase the size of an array list.");
		ArrayList<Integer> num = new ArrayList<Integer>(3);
		num.add(1);
		num.add(2);
		num.add(3);
		System.out.println("The original capacity is "+num.size());
		num.ensureCapacity(7);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		System.out.println("The new capacity is "+num.size());
	}
	
	private static void exercise21() {
		//Write a Java program to replace the second element of a ArrayList with the specified element.
		System.out.println("\nExecise 21: Write a Java program to replace the second element of a ArrayList with the specified element.");
		List<String> alphabet = new ArrayList<String>();
		alphabet.add("A");
		alphabet.add("B");
		for(int i = 0; i < alphabet.size(); i++) {
			System.out.println(alphabet.get(i));
		}
		alphabet.set(1, "R");
		for(int i = 0; i < alphabet.size(); i++) {
			System.out.println(alphabet.get(i));
		}
	}
	
	private static void exercise22() {
		//Write a Java program to print all the elements of a ArrayList using the position of the elements.
		List<String> alphabet = new ArrayList<String>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		alphabet.add("E");
		for(int i = 0; i < alphabet.size(); i++) {
			System.out.println("The index "+i+ ": "+alphabet.get(i));
		}
	}
}
