package ui;

import domain.BinaryIntTree;
import domain.BinarySearchTree;

public class BinarySearchTreeDriver {

	public static void main(String[] args) {
		BinarySearchTree<Integer> boom = new BinarySearchTree<>(6);
		boom.addNode(4);
		boom.addNode(8);
		boom.addNode(3);
		boom.addNode(5);
		boom.addNode(7);
		boom.addNode(9);

		System.out.println(boom.lookup(2));

		
	}

	private static void printBoomInfo(BinarySearchTree<Integer> boom) {
		System.out.println(boom.lookup(4));


	}
}
