package steak;

public class Pair {
    private final Character ch = null;//буква
    private final Integer pos = null;//номер буквы

    public Character ch() {
        return this.ch;
    }
    public Integer pos() {
        return this.pos;
    }

    @Override
    public String toString() {
        return String.format("Letter: %s position: %d", ch, pos);
    }

    public void print() {
        System.out.println(this);
    }
}
