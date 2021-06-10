package domain;

public class BinaryIntTree {

    private int data;
    private BinaryIntTree leftTree, rightTree;

    public BinaryIntTree(int data) {
        this(data, null, null);
    }

    public BinaryIntTree(int data, BinaryIntTree leftTree, BinaryIntTree rightTree) {
        this.data = data;
        this.leftTree = leftTree;
        this.rightTree = rightTree;
    }

    public boolean isLeaf() {
        return this.leftTree == null && this.rightTree == null;
    }



    public boolean kinderSom() {
        if (this.isLeaf())
            return true;
        else {
            int left_value = (this.leftTree != null ? this.leftTree.data : 0);
            int right_value = (this.rightTree != null ? this.rightTree.data : 0);
            if (this.data != left_value + right_value)
                return false;
        }
        return (this.leftTree != null ? this.leftTree.kinderSom() : true) &&
                (this.rightTree != null ? this.rightTree.kinderSom() : true);
    }


}