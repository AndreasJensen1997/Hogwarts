package hogwarts.test;

import hogwarts.data.Course;
import hogwarts.data.House;
import hogwarts.data.Student;
import hogwarts.data.Teacher;

public class Test {
    public static void main(String[] args) {

        // Houses
        House house1 = new House("Gryffindor");
        House house2 = new House("Slytherin");
        House house3 = new House("Ravenclaw");
        House house4 = new House("Hufflepuff");

        // Teachers
        Teacher teacher1 = new Teacher("Severus Snape", house2);

        // Students
        Student student1 = new Student("Harry Potter", 16, house1);
        Student student2 = new Student("Ron Weasley", 16, house1);
        Student student3 = new Student("Hermione Granger", 16, house1);

        // courses
        Course course1 = new Course("Potions", teacher1);

        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);

        System.out.println("Course: " + course1.getName());
        System.out.println(" with teacher " + course1.getTeacher());
        System.out.println(" has the following students: ");
        System.out.println(course1.getStudents());
    }

}
