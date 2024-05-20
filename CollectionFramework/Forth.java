package CollectionFramework;

import java.util.List;
import java.util.Vector;

class Student{
    String name;
    long ID;
    double cgpa;

    Student(){
        name = "";
        ID = 0;
        cgpa = 0;
    }

    Student(String name, long ID, double cgpa){
        this.name = name;
        this.ID = ID;
        this.cgpa = cgpa;
    }

    void display(List<Student> students){
        for(Student student : students){
            if(student.cgpa > 3.5){
                System.out.println("Student cga: " + student.cgpa);
            }
        }
    }
}

public class Forth {
    public static void main(String[] args) {
        Student student = new Student("Fardin",21225103451L,3.93);
        Student student1 = new Student("Ali",21225103432L,3.00);
        Student student2 = new Student("Omair",21225103411L,3.74);
        Student student3 = new Student("Shariar",21225103451L,2.98);

        List<Student> students = new Vector<Student>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Student student4 = new Student();
        student4.display(students);
    }
}
