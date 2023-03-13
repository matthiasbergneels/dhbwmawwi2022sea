package lecture.chapter9;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        Set<String> myNameSet = new TreeSet<String>();

        myNameSet.add("Zeus");
        myNameSet.add("Thor");
        myNameSet.add("zeus");
        myNameSet.add("adam");
        myNameSet.add("Gabi");
        myNameSet.add("Thor");
        myNameSet.add("Ute");

        for(String currentName : myNameSet){
            System.out.println(currentName);
        }

        Set<Student> myStudentSet = new TreeSet<Student>();

        Student zeus1 = new Student(4711, "Zeus", "Herrmann", 34);
        Student zeus2 = new Student(4711, "Zeus", "Herrmann", 34);

        System.out.println("Duplikat nach Comparable? " + zeus1.compareTo(zeus2));
        System.out.println("Duplikat nach equals? " + zeus1.equals(zeus2));

        myStudentSet.add(zeus1);
        myStudentSet.add(new Student(4719, "Gabi", "Stapler", 21));
        myStudentSet.add(zeus2);

        for(Student currentStudent : myStudentSet){
            System.out.println(currentStudent);
        }

        Set<Student> studentsByNameLength = new TreeSet<Student>(new SortStudentByNameLength());

        System.out.println("Sortiert nach Namenslänge:");
        studentsByNameLength.addAll(myStudentSet);

        for(Student currentStudent : studentsByNameLength){
            System.out.println(currentStudent);
        }


        System.out.println("Studenten Liste - Nach Namenslänge:");
        List<Student> myStudentList = new ArrayList<Student>();
        myStudentList.addAll(myStudentSet);

        Collections.sort(myStudentList, new SortStudentByNameLength());

        for(Student currentStudent : myStudentList){
            System.out.println(currentStudent);
        }

        System.out.println("Studenten Liste - Nach Alter:");
        Collections.sort(myStudentList, (Student o1, Student o2) -> {
            return o1.getAge() - o2.getAge();
        });

        for(Student currentStudent : myStudentList){
            System.out.println(currentStudent);
        }

    }
}
