package com.w3resource.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionExercise6 {

	public static void main(String[] args) {
		exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise6();
		exercise7();
		exercise8();
		exercise9();
		exercise10();
		exercise11();
		exercise12();
	}
	private static void exercise1() {
		//Write a Java program to associate the specified value with the specified key in a HashMap.
		System.out.println("\nExercise 1: Write a Java program to associate the specified value with the specified key in a HashMap.");
		HashMap<Integer, String> emp = new HashMap<>();
		emp.put(1, "Raudel");
		emp.put(2, "Marjorie");
		emp.put(3, "Raidel");
		emp.put(4, "Julio");
		emp.put(5, "Roly");
		emp.put(6, "Raudel");
		emp.put(7, null);
		for(Map.Entry<Integer, String> list : emp.entrySet()) {
			System.out.println(list.getKey()+" "+list.getValue());
		}
	}
	
	private static void exercise2() {
		//Write a Java program to count the number of key-value (size) mappings in a map.
		System.out.println("\nExercise 2: Write a Java program to count the number of key-value (size) mappings in a map.");
		HashMap<Integer, String> emp = new HashMap<>();
		emp.put(1, "Raudel");
		emp.put(2, "Marjorie");
		emp.put(3, "Raidel");
		emp.put(4, "Julio");
		emp.put(5, "Roly");
		emp.put(6, "Carly");
		emp.put(7, "Bastet");
		
		System.out.println("Number of employees on the list: "+emp.size());
	}
	
	private static void exercise3() {
		//Write a Java program to copy all of the mappings from the specified map to another map.
		System.out.println("\nExercise 3: Write a Java program to copy all of the mappings from the specified map to another map.");
		HashMap<Integer, String> emp = new HashMap<>();
		emp.put(1, "Raudel");
		emp.put(2, "Marjorie");
		emp.put(3, "Raidel");
		emp.put(4, "Julio");
		emp.put(5, "Roly");
		emp.put(6, "Carly");
		emp.put(7, "Bastet");
		System.out.println("List of employees:");
		for(Map.Entry<Integer, String> l: emp.entrySet()) {
			System.out.println(l.getKey()+" "+l.getValue());
		}
		HashMap<Integer, String> mng = new HashMap<>();
//		mng = (HashMap<Integer, String>) emp.clone();
		mng.putAll(emp);
		System.out.println("Print the list of managers:");
		for(Map.Entry<Integer, String> a: mng.entrySet()) {
			System.out.println(a.getKey()+" "+a.getValue());
		}
	}
	
	private static void exercise4() {
		//Write a Java program to remove all of the mappings from a map.
		System.out.println("\nExercise 4: Write a Java program to remove all of the mappings from a map.");
		HashMap<Integer, String> emp = new HashMap<>();
		emp.put(1, "Raudel");
		emp.put(2, "Marjorie");
		emp.put(3, "Raidel");
		emp.put(4, "Julio");
		emp.put(5, "Roly");
		emp.put(6, "Carly");
		emp.put(7, "Bastet");
		System.out.println("List of employees is empty: "+emp.isEmpty());
		emp.clear();
		System.out.println("List of employees is empty after clear all: "+emp.isEmpty());
	}
	
	private static void exercise6() {
		//Write a Java program to get a shallow copy of a HashMap instance.
		System.out.println("\nExercise 6: Write a Java program to get a shallow copy of a HashMap instance.");
		HashMap<Integer, String> emp = new HashMap<>();
		emp.put(1, "Raudel");
		emp.put(2, "Marjorie");
		emp.put(3, "Raidel");
		emp.put(4, "Julio");
		emp.put(5, "Roly");
		emp.put(6, "Carly");
		emp.put(7, "Bastet");

		HashMap<Integer, String> mng = new HashMap<>();
		mng = (HashMap<Integer, String>) emp.clone();
		boolean result = false;
		for(Map.Entry<Integer, String> list: mng.entrySet()) {
			if(emp.containsKey(list.getKey())) {
				if(emp.containsValue(list.getValue())) {
					result = true;
				}
			} else {
				System.out.println("Ther are not equals");
			}
		}
		if(result == true) {
		System.out.println("Manager list is an instance of Employee List");
		}
	}
	
	private static void exercise7() {
		//Write a Java program to test if a map contains a mapping for the specified key.
		System.out.println("\nExercise 7: Write a Java program to test if a map contains a mapping for the specified key.");
		HashMap<Integer, String> emp = new HashMap<>();
		emp.put(1, "Raudel");
		emp.put(2, "Marjorie");
		emp.put(3, "Raidel");
		emp.put(4, "Julio");
		emp.put(5, "Roly");
		emp.put(6, "Carly");
		emp.put(7, "Bastet");
		if(emp.containsKey(1)) {
			String val = emp.get(1);
			System.out.println("Key: 1 Value: "+val);
		}
//		for(Map.Entry<Integer, String> list: emp.entrySet()) {
//			if(emp.containsKey(1)) {
//				System.out.println("The result is: "+list.getKey()+" "+list.getValue());
//			}
//		}
	}
	
	private static void exercise8() {
		//Write a Java program to test if a map contains a mapping for the specified value.
		System.out.println("\nExercise 8: Write a Java program to test if a map contains a mapping for the specified value.");
		HashMap<Integer, String> emp = new HashMap<>();
		emp.put(1, "Raudel");
		emp.put(2, "Marjorie");
		emp.put(3, "Raidel");
		emp.put(4, "Julio");
		emp.put(5, "Roly");
		emp.put(6, "Carly");
		emp.put(7, "Bastet");
		
		String val = "Marjorie";
		Integer key = null;
		for(Map.Entry<Integer, String> list : emp.entrySet()) {
			if(val.equals(list.getValue())) {
				key = list.getKey();
				break;
			}
		}
		System.out.println(key+" "+val);
	}
	
	private static void exercise9() {
		//Write a Java program to create a set view of the mappings contained in a map.
		System.out.println("\nExercise 9: Write a Java program to create a set view of the mappings contained in a map.");
		HashMap<Integer, String> emp = new HashMap<>();
		emp.put(1, "Raudel");
		emp.put(2, "Marjorie");
		emp.put(3, "Raidel");
		emp.put(4, "Julio");
		emp.put(5, "Roly");
		emp.put(6, "Carly");
		emp.put(7, "Bastet");
		Set st = emp.entrySet();
		System.out.println("Result: "+st);
	}
	
	private static void exercise10() {
		//Write a Java program to get the value of a specified key in a map.
		System.out.println("\nExercise 10: Write a Java program to get the value of a specified key in a map.");
		HashMap<Integer, String> emp = new HashMap<>();
		emp.put(1, "Raudel");
		emp.put(2, "Marjorie");
		emp.put(3, "Raidel");
		emp.put(4, "Julio");
		emp.put(5, "Roly");
		emp.put(6, "Carly");
		emp.put(7, "Bastet");
		System.out.println("The value for the key number 7 is: "+emp.get(7));
	}
	
	private static void exercise11() {
		//Write a Java program to get a set view of the keys contained in this map.
		System.out.println("\nExercise 11: Write a Java program to get a set view of the keys contained in this map.");
		HashMap<Integer, String> emp = new HashMap<>();
		emp.put(1, "Raudel");
		emp.put(2, "Marjorie");
		emp.put(3, "Raidel");
		emp.put(4, "Julio");
		emp.put(5, "Roly");
		emp.put(6, "Carly");
		emp.put(7, "Bastet");
		
		Set<Integer> key = emp.keySet();
		Iterator<Integer> itr = key.iterator();
		while(itr.hasNext()) {
			System.out.println("Key: "+itr.next());
		}
	}
	
	private static void exercise12() {
		//Write a Java program to get a collection view of the values contained in this map.
		System.out.println("\nExercise 12: Write a Java program to get a collection view of the values contained in this map.");
		HashMap<Integer, String> emp = new HashMap<>();
		emp.put(1, "Raudel");
		emp.put(2, "Marjorie");
		emp.put(3, "Raidel");
		emp.put(4, "Julio");
		emp.put(5, "Roly");
		emp.put(6, "Carly");
		emp.put(7, "Bastet");
		for(Map.Entry<Integer, String> val: emp.entrySet()) {
			System.out.println("Values: "+val.getValue());
		}
	}
}
