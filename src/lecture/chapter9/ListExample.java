package lecture.chapter9;

import lecture.chapter5.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListExample {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();

        myList.add("Banane");
        myList.add("Red Bull");
        myList.add("Hemd");
        myList.add("Python");
        myList.add("Python");
        myList.add("Python");
        //myList.add(new Car(10, Car.ALLOWED_COLOR_BLUE, Car.ALLOWED_BRANDS.Jeep));
        //myList.add(myList);
        myList.add(3, "Java");

        System.out.println("Index 1: " + myList.get(1));

        for(String currentItem : myList){
            System.out.println(currentItem);
        }



        myList.remove(4);
        myList.remove("Python");



        for(Object currentItem : myList){
            System.out.println(currentItem);
            if(currentItem.equals("Python")){
                // myList.remove("Python"); <-- Modifikation während Iteration verboten
            }
        }


        Iterator<String> myListIterator = myList.iterator();

        while(myListIterator.hasNext()){
            String currentItem = myListIterator.next();
            System.out.println(currentItem);
            if(currentItem.equals("Python")){
                myListIterator.remove();
                //myList.remove("Python"); <-- Modifikation während Iteration verboten
                //myList.add("Java"); <-- Modifikation während Iteration verboten
            }
        }
    }

}
