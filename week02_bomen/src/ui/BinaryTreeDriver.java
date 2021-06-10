package ui;

import domain.BinaryTree;

public class BinaryTreeDriver {

	public static void main(String[] args) {
		BinaryTree<String> nodeH = new BinaryTree<>("H");
		BinaryTree<String> nodeI = new BinaryTree<>("I",nodeH,null);
		BinaryTree<String> nodeG = new BinaryTree<>("G",null,nodeI);
		BinaryTree<String> nodeC = new BinaryTree<>("C");
		BinaryTree<String> nodeE = new BinaryTree<>("E");

		BinaryTree<String> nodeA = new BinaryTree<>("A");


		BinaryTree<String> nodeD = new BinaryTree<>("D",nodeC,nodeE);
		BinaryTree<String> nodeB = new BinaryTree<>("B",nodeA,nodeD);
		BinaryTree<String> boom = new BinaryTree<>("F",nodeB,nodeG);

		System.out.println(boom.countNodes());
		System.out.println(boom.countLeaves());
	}

}
