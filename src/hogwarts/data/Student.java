package hogwarts.data;

public class Student {

    private String id;
    private String name;
    private House house = new House();
    private int age;


    public Student(int age, House house, String name) {
        this.age = age;
        this.house = house;
        this.name = name;
    }

    // getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public House getHouse() {
        return house;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void setName(String name) {
        this.name = name;
    }
}
