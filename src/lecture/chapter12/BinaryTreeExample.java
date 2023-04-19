package lecture.chapter12;

public class BinaryTreeExample {

    public static void main(String[] args) {
        BinaryTree<Integer> myNumbersTree = new BinaryTree<>();

        myNumbersTree.add(10);
        System.out.println("Add 20: " + myNumbersTree.add(20));
        System.out.println("Add 20: " + myNumbersTree.add(20));
        myNumbersTree.add(30);
        myNumbersTree.add(40);
        myNumbersTree.add(50);
        myNumbersTree.add(60);
        myNumbersTree.add(70);
        myNumbersTree.add(80);
        myNumbersTree.add(90);
        myNumbersTree.add(100);

        System.out.println("Baum ist fertig aufgebaut!");

        System.out.println("In-Order:");
        myNumbersTree.printInOrder();

        System.out.println("Pre-Order:");
        myNumbersTree.printPreOrder();

        System.out.println("Post-Order:");
        myNumbersTree.printPostOrder();

    }
}
