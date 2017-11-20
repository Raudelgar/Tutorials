package com.w3resource.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class CollectionExercise5 {

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
//		exercise10();
//		exercise11();
		exercise12();
	}
	
	private static void exercise1() {
		//Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.
		System.out.println("\nExercise 1: Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.");
		PriorityQueue<String> color = new PriorityQueue<>();
		color.add("Blue");
		color.add("White");
		color.add("Black");
		color.add("Red");
		color.add("Blue");
		System.out.println("Print the priority queue list: "+color);
		//Priority Queue accepted duplicated
	}
	
	private static void exercise2() {
		//Write a Java program to iterate through all elements in priority queue.
		System.out.println("\nExercise 2: Write a Java program to iterate through all elements in priority queue.");
		PriorityQueue<Integer> num = new PriorityQueue<>();
		num.add(7);
		num.add(3);
		num.add(1);
		num.add(9);
		num.add(2);
		
		Iterator<Integer> list = num.iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
	}
	
	private static void exercise3() {
		//Write a Java program to add all the elements of a priority queue to another priority queue. 
		System.out.println("\nExercise 3: Write a Java program to add all the elements of a priority queue to another priority queue.");
		PriorityQueue<Integer> num = new PriorityQueue<>();
		num.add(9);
		num.add(3);
		num.add(1);
		num.add(7);
		num.add(2);
		System.out.println("Print the original list: "+num.size());
		PriorityQueue<Integer> otherNum = new PriorityQueue<>();
		System.out.println("Print the size from the new list before adding: "+otherNum.size());
		otherNum.addAll(num);
		System.out.println("Print the size after adding: "+otherNum.size());
	}
	
	private static void exercise4() {
		//Write a Java program to insert a given element into a priority queue.
		System.out.println("\nExercise 4: Write a Java program to insert a given element into a priority queue.");
		PriorityQueue<String> color = new PriorityQueue<>();
		color.add("Blue");
		color.add("White");
		color.add("Black");
		color.add("Red");
		color.add("Blue");
		System.out.println("Print the priority queue list: "+color);
		color.offer("lightBlue");
		System.out.println("Print after the insert a new element: "+color);
	}
	
	private static void exercise5() {
		//Write a Java program to remove all the elements from a priority queue.
		System.out.println("\nExercise 5: Write a Java program to remove all the elements from a priority queue.");
		PriorityQueue<String> color = new PriorityQueue<>();
		color.add("Blue");
		color.add("White");
		color.add("Black");
		color.add("Red");
		color.add("Blue");
		System.out.println("Checking if the list is empty: "+color.isEmpty());
		color.clear();
		System.out.println("Checking if is empty after remoove all: "+color.isEmpty());
	}
	
	private static void exercise6() {
		//Write a Java program to count the number of elements in a priority queue.
		System.out.println("\nExercise 6: Write a Java program to count the number of elements in a priority queue.");
		PriorityQueue<Integer> num = new PriorityQueue<>();
		num.add(9);
		num.add(3);
		num.add(1);
		num.add(7);
		num.add(2);
		System.out.println("Count the number of elements in the list: "+num.size());
	}
	
	private static void exercise7() {
		//Write a Java program to compare two priority queues.
		System.out.println("\nExercise 7: Write a Java program to compare two priority queues.");
		PriorityQueue<String> animal1 = new PriorityQueue<>();
		animal1.add("Cat");
		animal1.add("Dog");
		animal1.add("Parrot");
		animal1.add("Tiger");
		
		PriorityQueue<String> animal2 = new PriorityQueue<>();
		animal2.add("Horse");
		animal2.add("Tiger");
		animal2.add("Dog");
		animal2.add("Cat");
		
		PriorityQueue<String> commonAnimal = new PriorityQueue<>();
		int count = 0;
		for(String l: animal1) {
			if(animal2.contains(l)) {
				commonAnimal.add(l);
				count ++;
			}
		}
		System.out.println("Animal list one: "+animal1);
		System.out.println("Animal list two: "+animal2);
		System.out.println("Number of common animal: "+count+" and they are: "+commonAnimal);
	}
	
	private static void exercise8() {
		//Write a Java program to retrieve the first element of the priority queue.
		System.out.println("\nExercise 8: Write a Java program to retrieve the first element of the priority queue.");
		PriorityQueue<Integer> num = new PriorityQueue<>();
		num.add(7);
		num.add(3);
		num.add(1);
		num.add(9);
		num.add(2);
		System.out.println("First element of the list option one: "+num.element());
		System.out.println("First element of the list option two: "+num.peek());
	}
	
	private static void exercise9() {
		//Write a Java program to retrieve and remove the first element.
		System.out.println("\nExercise 9: Write a Java program to retrieve and remove the first element.");
		PriorityQueue<Integer> num = new PriorityQueue<>();
		num.add(7);
		num.add(3);
		num.add(1);
		num.add(9);
		num.add(2);
		System.out.println("First element of the list: "+num.poll()+ " and list after is: "+num);
	}
	
	private static void exercise10() {
		//Write a Java program to convert a priority queue to an array containing all of the elements of the queue.
		System.out.println("\nExercise 10: Write a Java program to convert a priority queue to an array containing all of the elements of the queue.");
		PriorityQueue<Integer> num = new PriorityQueue<>();
		num.add(7);
		num.add(3);
		num.add(1);
		num.add(9);
		num.add(2);
		System.out.println("Print the priority queue: "+num);
//		Integer[] list = new Integer[num.size()];
//		list = num.toArray(list);
//		for(Integer l: list) {
//		System.out.println("Print the array: "+l);}
		List<Integer> list = new ArrayList<>(num);
		System.out.println("Print the array: "+list);
	}
	
	private static void exercise11() {
		//Write a Java program to convert a Priority Queue elements to a string representation.
		System.out.println("\nExercise 11: Write a Java program to convert a Priority Queue elements to a string representation.");
		PriorityQueue<Integer> num = new PriorityQueue<>();
		num.add(7);
		num.add(3);
		num.add(1);
		num.add(9);
		num.add(2);
		System.out.println("Print the priority queue Integer: "+num);
		System.out.println("Print the priority queue as a String :"+num.toString());
	}
	
	private static void exercise12() {
		//Write a Java program to change priorityQueue to maximum priorityqueue.
		System.out.println("\nExercise 12: Write a Java program to change priorityQueue to maximum priorityqueue.");
		PriorityQueue<Integer> num = new PriorityQueue<>();
		num.add(7);
		num.add(3);
		num.add(1);
		num.add(9);
		num.add(2);
		System.out.println("Print the default priority queue: "+num);
		PriorityQueue<Integer> tempPQ = new PriorityQueue<>(num.size(),Collections.reverseOrder());
		tempPQ.addAll(num);
		System.out.println("Print the priority queue reverse order: "+tempPQ);
		Integer val = null;
		List<Integer> list = new ArrayList<>();
		while((val = tempPQ.poll()) != null) {
			list.add(val);
		}
		System.out.println("Print the maximum priority queue: "+list);
	}
}
