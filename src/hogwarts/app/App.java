package hogwarts.app;

import hogwarts.app.ui.TextUI;
import hogwarts.data.House;
import hogwarts.data.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    ArrayList<Student> listOfStudentsObjects = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Applikationen er startet");
        showMenu();
    }


    private void loadStudents() {
        House house1 = new House("Gryffindor");
        House house2 = new House("Slytherin");
        House house3 = new House("Ravenclaw");
        House house4 = new House("Hufflepuff");

        Student student1 = new Student("Harry Potter", 16, house1);
        Student student2 = new Student("Ron Weasley", 16, house1);
        Student student3 = new Student("Hermione Granger", 16, house1);
        Student student4 = new Student("Peter", 42, house2);
        listOfStudentsObjects.add(student1);
        listOfStudentsObjects.add(student2);
        listOfStudentsObjects.add(student3);
        listOfStudentsObjects.add(student4);
    }

    private void showMenu() {
        System.out.println("""
                Student menu
                ------------
                1) List all students
                2) Create new student
                
                0) Exit application
                """);
        while (true) {
            int choice = TextUI.promptInt("Choose from menu");
            if (choice == 1) {
                listAllStudents();
            } else if (choice == 2) {
                createNewStudent();
            } else if (choice == 0) {
                System.out.println("Exiting application");
                return; // Afslutter metoden
            } else {
                System.out.println("Invalid input. Try again");
            }

        }
    }


    private void listAllStudents() {
        loadStudents();
        System.out.printf("There are %d students in the system%n", listOfStudentsObjects.size());
        System.out.println("===================================================");
        for (Student student : listOfStudentsObjects) {
            System.out.printf("%18s - age: %-2d - House: %-5s%n", student.getName(), student.getAge(), student.getHouse().getName());
        }
        System.out.println("===================================================");

    }

    private void createNewStudent() {

        String name = TextUI.promptString("What is the name of the student?");
        int age = TextUI.promptInt("What is the age of the student?");
        System.out.println("===================================================");
        System.out.printf("House: %-5s%n", "1) Gryffindor");
        System.out.printf("House: %-5s%n", "2) Slytherin");
        System.out.printf("House: %-5s%n", "3) Ravenclaw");
        System.out.printf("House: %-5s%n", "4) Hufflepuff");
        System.out.println("===================================================");

        int choice = 0;
        House house = null;

        while (house == null) {
            choice = TextUI.promptInt("Select the house by number: ");
            switch (choice) {
                case 1 -> house = House.house1;
                case 2 -> house = House.house2;
                case 3 -> house = House.house3;
                case 4 -> house = House.house4;
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        Student student = new Student(name, age, house);
        listOfStudentsObjects.add(student);
        System.out.println("Student created: " + student.getName() + " from " + house.getName());

    }

}





