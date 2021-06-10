package ui;

import domain.BinaryIntTree;
import domain.BinaryTree;

public class BinaryIntTreeDriver {

    public static void main(String[] args) {
        BinaryIntTree node7 = new BinaryIntTree(7,null,null);



        BinaryIntTree node8 = new BinaryIntTree(8);
        BinaryIntTree nodeMin3 = new BinaryIntTree(-3);
        BinaryIntTree node5 = new BinaryIntTree(5,node8,nodeMin3);

        BinaryIntTree nodeMin1 = new BinaryIntTree(-1);
        BinaryIntTree nodeMin1Boven = new BinaryIntTree(-1,nodeMin1,null);
        BinaryIntTree node4 = new BinaryIntTree(4,node5,nodeMin1Boven);

        BinaryIntTree node10 = new BinaryIntTree(10);
        BinaryIntTree node0 = new BinaryIntTree(0);
        BinaryIntTree nodeMin7 = new BinaryIntTree(-7);
        BinaryIntTree node3 = new BinaryIntTree(3,node10,nodeMin7);
        BinaryIntTree node3Boven = new BinaryIntTree(3,node0,node3);

        BinaryIntTree boom = new BinaryIntTree(7,node4,node3Boven);

        System.out.println(nodeMin1Boven.kinderSom());

    }

}
