package domain;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {

	public BinarySearchTree(E data, BinarySearchTree<E> leftTree, BinarySearchTree<E> rightTree) {
		super(data, leftTree, rightTree);
	}

	public BinarySearchTree(E data) {
		super(data);
	}

	public boolean lookup(E data) {
		if (data.compareTo(this.data) == 0) {
			return true;
		} else {
			if (data.compareTo(this.data) < 0) {
				if (this.leftTree == null) {
					return false;
				}
				return this.leftTree.lookup(data);
			} else {
				if (this.rightTree == null) {
					return false;
				} else {
					return this.rightTree.lookup(data);
				}
			}
		}
	}

	public boolean addNode(E data) {
		if (data == null) {
			throw new IllegalArgumentException();
		}
		if (this.data.compareTo(data) == 0) {
			return false; //geen twee keer zelfde data in BST
		}
		else if (this.data.compareTo(data) > 0) {
			if (this.leftTree == null) {
				this.leftTree = new BinarySearchTree<>(data);
				return true;
			}
			else return (this.leftTree.addNode(data));
		}
		else if (this.rightTree == null) {
			this.rightTree = new BinarySearchTree<>(data);
			return true;
		}
		else return (this.rightTree.addNode(data));


}



	public boolean isLeaf(){
		return this.leftTree == null && this.rightTree == null;
	}
	public boolean removeNode(E data){
		if(data.compareTo(this.data) == 0){
			if(this.isLeaf()){
				this.data = null;
				return true;
			}
			else{
				if(this.leftTree != null){
					this.data = this.leftTree.searchGreatest();
					removeNode(this.leftTree.searchGreatest());
					return true;
				}
				if(this.rightTree != null){
					this.data = this.rightTree.searchSmallest();
					removeNode(this.rightTree.searchSmallest());
					return true;
				}
			}
		}
		else{
			if (data.compareTo(this.data) < 0) {
				if(this.leftTree == null){
					return false;
				}
				else{
					return removeNode(this.leftTree.data);
				}
			}
			else{
				if(this.rightTree == null){
					return false;
				}
				else{
					return removeNode(this.rightTree.data);
				}
			}
		}
		return false;
	}

	public E searchSmallest() {
		if (this.leftTree == null) {
			return this.data; } else {
			return this.leftTree.searchSmallest(); }
	}

	public E searchGreatest() {
		if (this.rightTree == null) {
			return this.data; } else {
			return this.rightTree.searchGreatest(); }
	}
}


