package lecture.chapter12;

public class BinaryTree<T extends Comparable> {

    private Node root = null;
    private int size = 0;

    public boolean add(T data){
        Node newNode = new Node(data);

        if(root == null){
            this.root = newNode;
            this.size++;
            return true;
        }

        return add(newNode, root);
    }

    private boolean add(Node newNode, Node currentNode){

        int compareToResult = currentNode.getData().compareTo(newNode.getData());

        if(compareToResult > 0){
            // leftSide
            if(currentNode.getLeftNode() != null){
                return add(newNode, currentNode.getLeftNode());
            } else {
                currentNode.setLeftNode(newNode);
                this.size++;
                return true;
            }

        } else if(compareToResult < 0){
            // rightSide
            if(currentNode.getRightNode() != null){
                return add(newNode, currentNode.getRightNode());
            } else {
                currentNode.setRightNode(newNode);
                this.size++;
                return true;
            }
        }

        return false;
    }

    public int size(){
        return this.size;
    }

    // traversierung (path traversal)

    // in-Order --> left - current (part-tree root) - right
    public void printInOrder(){

        if(root == null){
            System.out.println("Der Baum ist leer!");
            return;
        }

        System.out.println("In-Order Ausgabe:");
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(Node currentNode){

        if(currentNode.getLeftNode() != null){
            printInOrder(currentNode.getLeftNode());
        }

        System.out.print(currentNode.getData() + ", ");

        if(currentNode.getRightNode() != null){
            printInOrder(currentNode.getRightNode());
        }
    }

    // pre-order current-left-right
    public void printPreOrder(){

        if(root == null){
            System.out.println("Der Baum ist leer!");
            return;
        }

        System.out.println("Pre-Order Ausgabe:");
        printPreOrder(root);
        System.out.println();
    }

    private void printPreOrder(Node currentNode){
        System.out.print(currentNode.getData() + ", ");

        if(currentNode.getLeftNode() != null){
            printPreOrder(currentNode.getLeftNode());
        }

        if(currentNode.getRightNode() != null){
            printPreOrder(currentNode.getRightNode());
        }
    }

    // post-order left-right-current
    public void printPostOrder(){

        if(root == null){
            System.out.println("Der Baum ist leer!");
            return;
        }

        System.out.println("Post-Order Ausgabe:");
        printPostOrder(root);
        System.out.println();
    }

    private void printPostOrder(Node currentNode){
        if(currentNode.getLeftNode() != null){
            printPostOrder(currentNode.getLeftNode());
        }

        if(currentNode.getRightNode() != null){
            printPostOrder(currentNode.getRightNode());
        }

        System.out.print(currentNode.getData() + ", ");
    }

    private class Node{
        private final T data;
        private Node leftNode;
        private Node rightNode;

        public Node(T data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }

        public T getData(){
            return this.data;
        }

        public Node getLeftNode(){
            return this.leftNode;
        }

        public Node getRightNode(){
            return this.rightNode;
        }

        public void setLeftNode(Node leftNode){
            this.leftNode = leftNode;
        }

        public void setRightNode(Node rightNode){
            this.rightNode = rightNode;
        }
    }

}
