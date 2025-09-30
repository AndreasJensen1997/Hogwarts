package hogwarts.data;

public class Teacher {

    private String name;
    private House house;

// Constructor
    public Teacher(String name, House house) {
        this.name = name;
        this.house = house;
    }

// Getters
    public String getName() {
        return name;
    }

    public House getHouse() {
        return house;
    }
}
