package solutions.july0807;

public class TimeTableEntryReys {
    public final String reys;
    public final int from;
    public final int to;
    public final int length;

    public TimeTableEntryReys(String reys, int from, int to, int length) {
        this.reys = reys;
        this.from = from;
        this.to = to;
        this.length = length;
    }
    public String getReys() {
        return reys;
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
        return String.format("%s : %d : %d : %d", reys, from, to, length);
    }
    public  String descripTime() {
        return String.format("%dh %dm", this.length/60, this.length%60);
}
}
