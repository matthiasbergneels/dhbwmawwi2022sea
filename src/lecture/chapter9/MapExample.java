package lecture.chapter9;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, Student> studentMap = new TreeMap<Integer, Student>();

        studentMap.put(4711, new Student(4711, "Zeus", "Herrmann", 34));
        studentMap.put(4712, new Student(4712, "Fritz", "Herrmann", 25));
        studentMap.put(4713, new Student(4713, "Fritz", "Rüdiger", 21));
        studentMap.put(4722, new Student(4722, "Gabi", "Stapler", 22));

        System.out.println(studentMap.get(4711));

        Set<Integer> studentMapKeys = studentMap.keySet();
        for(int key : studentMapKeys){
            System.out.println("Key: " + key + " - Wert: " + studentMap.get(key) );
        }

        Collection<Student> studentList = studentMap.values();

        for(Student currentStudent : studentList){
            System.out.println(currentStudent);
        }


    }
}
