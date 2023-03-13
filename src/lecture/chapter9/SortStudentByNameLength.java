package lecture.chapter9;

import java.util.Comparator;

public class SortStudentByNameLength implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getFamilyName().length() + o1.getName().length()) -
                (o2.getFamilyName().length() + o2.getName().length()) ;
    }
}
