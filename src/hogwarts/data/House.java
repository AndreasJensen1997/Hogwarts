package hogwarts.data;

public class House {

    private String name;

    public static final House house1 = new House("Gryffindor");
    public static final House house2 = new House("Slytherin");
    public static final House house3 = new House("Ravenclaw");
    public static final House house4 = new House("Hufflepuff");

    public House(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                '}';
    }
}
