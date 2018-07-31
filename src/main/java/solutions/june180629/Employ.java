package solutions.june180629;

public class Employ {
    public String rang;
    public String name;

    public Employ(String r, String n){
        this.rang = r;
        this.name = n;
    }

    public String getRang(){
        return rang;
    }
    public String getName() {
        return name;
    }
    public static String extractRang(String s) {
        return s.substring(0,s.indexOf(":"));
    }

    public static String extractName(String s) {
        return s.substring(s.indexOf(":") + 1, s.length());
    }

    @Override
    public String toString() {
        return String.format("s%: [s%]", this.rang, this.name);
    }
}
