package lecture.chapter12;

public class LinkedList<T> {

    private Node firstNode;
    private int size;

    void add(T data){
        Node newNode = new Node(data);

        if(firstNode == null){
            firstNode = newNode;
            return;
        }


        Node nextNode = firstNode;
        while(nextNode.getNextNode() != null){
            nextNode = nextNode.getNextNode();
        }

        nextNode.setNextNode(newNode);
    }

    public void printList(){
        Node nextNode = firstNode;

        while(nextNode != null){
            System.out.println(nextNode.getData());
            nextNode = nextNode.getNextNode();
        }
    }

    public void printListRecursive(){
        if(firstNode == null){
            System.out.println("Liste ist leer");
            return;
        }

        printListRecursive(firstNode);
    }

    private void printListRecursive(Node nextNode){
        System.out.println(nextNode.getData());
        if(nextNode.getNextNode() != null){
            printListRecursive(nextNode.getNextNode());
        }
    }

    T remove(T data){
        if(firstNode != null){

            if(firstNode.getData().equals(data)){
                firstNode = firstNode.getNextNode();
                size--;
                return data;
            }

            Node currentNode = firstNode;
            while(currentNode.getNextNode() != null){
                if(currentNode.getNextNode().getData().equals(data)){
                    currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                    size--;
                    return data;
                }
                currentNode = currentNode.getNextNode();
            }

        }
        return null;
    }


    private class Node{
        private final T data;
        private Node nextNode;

        Node(T data){
            this.data = data;
        }

        T getData(){
            return data;
        }

        Node getNextNode(){
            return nextNode;
        }

        void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }
    }

}
