package lecture.chapter12;

public class LinkedList<T> {

    private Node firstNode;

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

    void printList(){
        // TODO
    }

    T remove(T data){
        // TODO - removes first occurence of data (return null if no occurence)
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
