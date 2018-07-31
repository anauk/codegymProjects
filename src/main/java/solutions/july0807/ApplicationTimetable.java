package solutions.july0807;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*Читаю файл time.txt в HashSet*/

public class ApplicationTimetable {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(new File("src/main/java/solutions/july0807", "time.txt")));
        Set<TimeTableEntry> timeTable_reys = new HashSet<>();

        while ( bf.ready()) {
            String[] s = bf.readLine().split(":");
            //String reys = s[0];
            int from = Integer.parseInt(s[0]);
            int to = Integer.parseInt(s[1]);
            int length = Integer.parseInt(s[2]);
            TimeTableEntry tte = new TimeTableEntry( from, to, length);
            timeTable_reys.add(tte);

        }
        System.out.println(timeTable_reys);
    }
}
