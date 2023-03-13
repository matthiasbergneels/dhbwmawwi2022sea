package lecture.chapter9;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private int id;
    private String name;
    private String familyName;
    private int age;

    public Student(int id, String name, String familyName, int age) {
        this.id = id;
        this.name = name;
        this.familyName = familyName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                '}';
    }



    @Override
    public boolean equals(Object o){
        // Referenz-Vergleich
        if(this == o){
            return true;
        }

        // null-Vergleich
        if(o == null){
            return false;
        }

        // Typ-Vergleich
        if(this.getClass() != o.getClass()){
            return false;
        }

        // Attribut-Vergleiche
        Student s = (Student)o;

        return this.compareTo(s) == 0;
        /*

        if(this.id != s.id){
            return false;
        }

        if(!this.name.equals(s.name)){
            return false;
        }

        if(!this.familyName.equals(s.familyName)){
            return false;
        }

        if(this.age != s.age) {
            return false;
        }

        return true;

         */
    }


    @Override
    public int hashCode() {
        return id ^ name.hashCode() ^ familyName.hashCode() ^ age;
    }



    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (age != student.age) return false;
        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(familyName, student.familyName);
    }

     */


    /*
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
        result = 31 * result + (int) (age ^ (age >>> 32));
        return result;
    }
    */

    @Override
    public int compareTo(Student o) {
/*
        if(!familyName.equals((o.familyName))){
            return familyName.compareTo(o.familyName);
        }

        if(!name.equals(o.name)){
            return name.compareTo(o.name);
        }

        return age - o.age;


 */

        return id - o.id;
    }
}
