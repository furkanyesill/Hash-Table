package veriYapilariOdev4;

public class Node {
	int key;
	String name;
	String surname;
	Node next;

	public Node(int key, String name, String surname) {
		this.key = key;
		this.name = name;
		this.surname = surname;
		next = null;
	}
}
