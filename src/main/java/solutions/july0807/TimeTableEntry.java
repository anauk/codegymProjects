package solutions.july0807;

public class TimeTableEntry {
    public final int from;
    public final int to;
    public final int length;

    public TimeTableEntry(int from, int to, int length){
        this.from = from;
        this.to = to;
        this.length = length;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return String.format("%d : %d : %d", from, to, length);
    }
}
