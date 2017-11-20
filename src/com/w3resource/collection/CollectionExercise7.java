package com.w3resource.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionExercise7 {

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
		// Write a Java program to associate the specified value with the
		// specified key in a Tree Map.
		System.out.println(
				"\nExercise 1: Write a Java program to associate the specified value with the specified key in a Tree Map.");
		TreeMap<String, String> data = new TreeMap<>();
		data.put("Raudel", "Garcia");
		data.put("Marjorie", "Lopez");
		data.put("Raidel", "Garcia");
		data.put("Julio", "Vila");

		System.out.println("The first and last name are: " + data);
	}

	private static void exercise2() {
		// Write a Java program to copy a Tree Map content to another Tree Map.
		System.out.println(
				"\nExercise 2: Write a Java program to associate the specified value with the specified key in a Tree Map.");
		TreeMap<Integer, String> emp = new TreeMap<>();
		emp.put(7, "Raudel");
		emp.put(1, "Marjorie");
		emp.put(2, "Raidel");

		TreeMap<Integer, String> mng = new TreeMap<>();
		mng.put(4, "Julio");
		mng.put(3, "Roly");
		mng.put(8, "Carly");
		System.out.println("\nThe first list: ");
		for (Map.Entry<Integer, String> list : emp.entrySet()) {
			System.out.println(list.getKey() + " " + list.getValue());
		}
		System.out.println("\nThe second list: ");
		for (Map.Entry<Integer, String> l : mng.entrySet()) {
			System.out.println(l.getKey() + " " + l.getValue());
		}

		mng.putAll(emp);
		System.out.println("\nThe whole list: ");
		for (Map.Entry<Integer, String> l : mng.entrySet()) {
			System.out.println(l.getKey() + " " + l.getValue());
		}
	}

	private static void exercise3() {
		// Write a Java program to search a key in a Tree Map.
		System.out.println("\nExercise 3: Write a Java program to search a key in a Tree Map.");
		TreeMap<String, String> data = new TreeMap<>();
		data.put("Raudel", "Garcia");
		data.put("Marjorie", "Lopez");
		data.put("Raidel", "Garcia");
		data.put("Julio", "Vila");
		if (data.containsKey("Marjorie")) {
			System.out.println("The last name for Marjorie key is: " + data.get("Marjorie"));
		}
	}

	private static void exercise4() {
		// Write a Java program to search a value in a Tree Map.
		System.out.println("\nExercise 4: Write a Java program to search a value in a Tree Map.");
		TreeMap<String, String> data = new TreeMap<>();
		data.put("Raudel", "Garcia");
		data.put("Marjorie", "Lopez");
		data.put("Raidel", "Garcia");
		data.put("Julio", "Vila");
		String key = null;
		if (data.containsValue("Vila")) {
			for (Map.Entry<String, String> en : data.entrySet()) {
				if (en.getValue().equals("Vila")) {
					key = en.getKey();
				}
			}
		}
		System.out.println("The first name for Vila is: " + key);
	}

	private static void exercise5() {
		// Write a Java program to get all keys from the given a Tree Map.
		System.out.println("\nExercise 5: Write a Java program to get all keys from the given a Tree Map.");
		TreeMap<String, Integer> month = new TreeMap<>();
		month.put("January", 01);
		month.put("March", 03);
		month.put("December", 12);
		month.put("April", 04);
		Set<String> key = month.keySet();
		System.out.println("The months of the list are: ");
		for (String en : key) {
			System.out.println(en);
		}
	}

	private static void exercise6() {
		// Write a Java program to delete all elements from a given Tree Map.
		System.out.println("\nExercise 6: Write a Java program to delete all elements from a given Tree Map.");
		TreeMap<String, Integer> month = new TreeMap<>();
		month.put("January", 01);
		month.put("March", 03);
		month.put("December", 12);
		month.put("April", 04);
		System.out.println("The list before deleted: " + month);
		month.clear();
		System.out.println("Is empty the list after clear(): " + month.isEmpty());
	}

	private static void exercise7() {
		// Write a Java program to sort keys in Tree Map by using comparator.
		System.out.println("\nExercise 7: Write a Java program to sort keys in Tree Map by using comparator.");
		TreeMap<Integer, String> alp = new TreeMap<>(new exe_sort());
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println(alp);

	}

	private static void exercise8() {
		// Write a Java program to get a key-value mapping associated with the
		// greatest key and the least key in a map.
		System.out.println(
				"\nExercise 8: Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.");
		TreeMap<Integer, String> alp = new TreeMap<>(new exe_sort());
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		// System.out.println("The highest key-value is:
		// "+alp.lastKey()+"=>"+alp.get(alp.lastKey()));
		// System.out.println("The lowest key-value is:
		// "+alp.firstKey()+"=>"+alp.get(alp.firstKey()));
		System.out.println("The greates is:" + alp.firstEntry() + " and the least is: " + alp.lastEntry());
	}

	private static void exercise9() {
		// Write a Java program to get the first (lowest) key and the last
		// (highest) key currently in a map.
		System.out.println(
				"\nExercise 9: Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.");
		TreeMap<String, String> data = new TreeMap<>();
		data.put("Raudel", "Garcia");
		data.put("Marjorie", "Lopez");
		data.put("Raidel", "Garcia");
		data.put("Julio", "Vila");
		System.out.println(
				"The first (lowest) key: " + data.firstKey() + " and the last (highest) key: " + data.lastKey());
	}

	private static void exercise10() {
		// Write a Java program to get a reverse order view of the keys
		// contained in a given map.
		System.out.println(
				"\nExercise 10: Write a Java program to get a reverse order view of the keys contained in a given map.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("The original list order:");
		for (Map.Entry<Integer, String> en : alp.entrySet()) {
			System.out.println(en.getKey() + " " + en.getValue());
		}
		TreeMap<Integer, String> alp1 = new TreeMap<>(Collections.reverseOrder());
		alp1.putAll(alp);
		System.out.println("Print the reverser order:");
		for (Map.Entry<Integer, String> list : alp1.entrySet()) {
			System.out.println(list.getKey() + " " + list.getValue());
		}
	}

	private static void exercise11() {
		// Write a Java program to get a key-value mapping associated with the
		// greatest key less than or equal to the given key.
		System.out.println(
				"\nExercise 11: Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");

		System.out.println("The key-value pair less than or equal to 7 is: " + alp.floorEntry(7));
		System.out.println("The key-value pair less than or equal to 5 is: " + alp.floorEntry(5));
	}

	private static void exercise12() {
		// Write a Java program to get the greatest key less than or equal to
		// the given key.
		System.out.println(
				"\nExercise 12: Write a Java program to get the greatest key less than or equal to the given key.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("The greatest key less than or equal to 5 is: " + alp.floorKey(5));
		System.out.println("The greatest key less than or equal to 8 is: " + alp.floorKey(8));
	}

	private static void exercise13() {
		// Write a Java program to get the portion of a map whose keys are
		// strictly less than a given key.
		System.out.println(
				"\nExercise 13: Write a Java program to get the portion of a map whose keys are strictly less than a given key.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("Portion view of th map less than 5: " + alp.headMap(5));
	}

	private static void exercise14() {
		// Write a Java program to get the portion of this map whose keys are
		// less than (or equal to, if inclusive is true) a given key.
		System.out.println(
				"\nExercise 14: Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("Portion view of th map less than or equal 4: " + alp.headMap(4, true));
	}

	private static void exercise15() {
		// Write a Java program to get the least key strictly greater than the
		// given key. Return null if there is no such key.
		System.out.println(
				"\nExercise 15: Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("The least key greater than 7: " + alp.ceilingKey(7));
	}

	private static void exercise16() {
		// Write a Java program to get a key-value mapping associated with the
		// greatest key strictly less than the given key. Return null if there
		// is no such key.
		System.out.println(
				"\nExercise 16: Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("Result: " + alp.lowerEntry(7));
	}

	private static void exercise17() {
		// Write a Java program to get the greatest key strictly less than the
		// given key. Return null if there is no such key.
		System.out.println(
				"\nExercise 17: Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("Result: " + alp.lowerKey(7));
	}

	private static void exercise18() {
		// Write a Java program to get NavigableSet view of the keys contained
		// in a map.
		System.out.println(
				"\nExercise 18: Write a Java program to get NavigableSet view of the keys contained in a map.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("Original order keys: " + alp.keySet());
		System.out.println("Result: " + alp.navigableKeySet());
		// System.out.println("Result: "+alp.descendingKeySet()); => Returns in
		// descending order
	}

	private static void exercise19() {
		// Write a Java program to remove and get a key-value mapping associated
		// with the least key in a map.
		System.out.println(
				"\nExercise 19: Write a Java program to remove and get a key-value mapping associated with the least key in a map.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("The original list: " + alp);
		System.out.println("Result: " + alp.pollFirstEntry() + " and the list is now: " + alp);
	}

	private static void exercise20() {
		// Write a Java program to remove and get a key-value mapping associated
		// with the greatest key in this map.
		System.out.println(
				"\nExercise 20: Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("The original list: " + alp);
		System.out.println("Result: " + alp.pollLastEntry() + " and the list is now: " + alp);
	}

	private static void exercise21() {
		// Write a Java program to get the portion of a map whose keys range
		// from a given key (inclusive), to another key (exclusive).
		System.out.println(
				"\nExercise 21: Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("The original list: " + alp);
		System.out.println("Result: " + alp.subMap(2, 9));
	}

	private static void exercise22() {
		// Write a Java program to get the portion of a map whose keys range
		// from a given key to another key.
		System.out.println(
				"\nExercise 22: Write a Java program to get the portion of a map whose keys range from a given key to another key.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("The original list: " + alp);
		System.out.println("Result: " + alp.subMap(2, true, 7, true));
	}

	private static void exercise23() {
		// Write a Java program to get a portion of a map whose keys are greater
		// than or equal to a given key.
		System.out.println(
				"\nExercise 23: Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("The original list: " + alp);
		System.out.println("Result: " + alp.tailMap(4));
	}

	private static void exercise24() {
		// Write a Java program to get a portion of a map whose keys are greater
		// than to a given key.
		System.out.println(
				"\nExercise 24: Write a Java program to get a portion of a map whose keys are greater than to a given key.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("The original list: " + alp);
		System.out.println("Result: " + alp.tailMap(4, false));
	}

	private static void exercise25() {
		// Write a Java program to get a key-value mapping associated with the
		// least key greater than or equal to the given key.
		// Return null if there is no such key.
		System.out.println(
				"\nExercise 25: Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("The original list: " + alp);
		System.out.println("Result: " + alp.ceilingEntry(6));
		System.out.println("Result: " + alp.ceilingEntry(10));
	}
	
	private static void exercise26() {
		//Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
		System.out.println(
				"\nExercise 25: Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.");
		TreeMap<Integer, String> alp = new TreeMap<>();
		alp.put(7, "A");
		alp.put(4, "D");
		alp.put(2, "G");
		alp.put(9, "F");
		alp.put(1, "K");
		alp.put(6, "H");
		System.out.println("The original list: " + alp);
		System.out.println("Result: " + alp.ceilingKey(6));
		System.out.println("Result: " + alp.ceilingKey(10));
	}
}

class exe_sort implements Comparator<Integer> {
	@Override
	public int compare(Integer int1, Integer int2) {
		return int1.compareTo(int2);
	}
}
