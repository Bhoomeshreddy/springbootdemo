package com.demo.dsa.stacks;

import java.util.Scanner;

public class StackOfStringsImplByLinkedList {
public static void main(String[] args) {
		
		StackOfStringsByLinkedListImpl linkedStackOfStrings = new StackOfStringsByLinkedListImpl();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter all inputs separated by space");
		String inputLine = scanner.nextLine(); 
		String[] inputs = inputLine.split(" ");
		
		for (String input : inputs) {
			linkedStackOfStrings.push(input);
		}
		
		System.out.println("Stack contents (popped):");
		while (!linkedStackOfStrings.isEmpty()) {
			System.out.println(linkedStackOfStrings.pop());
		}
		
		scanner.close();
	}
}


class StackOfStringsByLinkedListImpl {
	private Node top = null;
	private class Node{
		String item;
		Node next;
	}
	
	public boolean isEmpty() {
		return top==null;
	}

	public void push(String newItem) {
		Node oldTop = top;
		top = new Node();
		top.item = newItem;
		top.next = oldTop;
	}
	
	public String pop() {
		if(top != null) {
			String item = top.item;
			top = top.next;
			return item;
		}
		return null;
	}
}