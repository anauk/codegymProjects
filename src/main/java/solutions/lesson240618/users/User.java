package solutions.lesson240618.users;

public class User {
    public String name;
    public int year;
    public int salary;

    public User(String n, int y, int s) {
        this.name = n;
        this.year = y;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("User: [name: %s, year: %d, salary: %d]", this.name, this.year, this.salary);
    }
    public String toStringXML(){
        return String.format("<user>\n<name>%s</name>\n<year>%s</year>\n<salary>%d</salary>\n</user>", name, year, salary);
    }
    public boolean equals1(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        return this.salary == ((User) obj).salary
                && this.name.equals(((User) obj).name);
    }

    public static String extractName(String s){
        return s.substring(6, s.length());
    }

    public static int extractYear(String s){
        return Integer.parseInt(s.substring(6, s.length()));
    }

    public static int extractSalary(String s){
        return Integer.parseInt(s.substring(8, s.length()));
    }
}