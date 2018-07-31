package solutions.july0807;

public class City {
    public final int id;
    public final String name;

    public City(final int id, final String name){
        this.id = id;
        this.name = name;
    }
    public int id() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("City{id= %d, name=%s}", id, name);
    }
}
