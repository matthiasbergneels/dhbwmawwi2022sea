package lecture.chapter12;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> numberList = new LinkedList<Integer>();

        numberList.add(15);
        numberList.add(79);
        numberList.add(99);
        numberList.add(102);


        System.out.println("Listen Ausgabe (iterativ)");
        numberList.printList();

        numberList.remove(79);

        System.out.println("Listen Ausgabe (rekursiv)");
        numberList.printListRecursive();

        System.out.println("Ende");
    }
}
