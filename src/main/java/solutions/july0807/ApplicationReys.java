package solutions.july0807;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*Создаю метод, который читает time1.txt в HashMap*/
public class ApplicationReys {
    public static Map<String, TimeTableEntryReys> read() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(new File("src/main/java/solutions/july0807", "time1.txt")));
        Map<String, TimeTableEntryReys> timeTable_reys = new HashMap<>();
        while (bf.ready()) {
            String[] s = bf.readLine().split(":");
            String reys = s[0];
            int from = Integer.parseInt(s[1]);
            int to = Integer.parseInt(s[2]);
            int length = Integer.parseInt(s[3]);
            TimeTableEntryReys tte = new TimeTableEntryReys(reys, from, to, length);
            timeTable_reys.put(reys, tte);
        }
        //System.out.println(timeTable_reys);
        return timeTable_reys;
    }
}
