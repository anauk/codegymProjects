package solutions.july0807;

import java.io.IOException;
import java.util.Map;
import java.util.function.BiConsumer;

public class AeroportTimeTable {

    public static void printTab(int count) {
        for (int i = 0; i <= count; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void printHeader() {
        System.out.printf("%-8s %-24s -> %-24s %s \n", "Fliy No", "From", "To", "Descript");

    }

    public static void main(String[] args) throws IOException {
        Map<Integer, City> cities = Aeroports.read();
        // cities.forEach((key, city)-> System.out.println(city));
        Map<String, TimeTableEntryReys> timeTable_reys = ApplicationReys.read();
        printTab(100);
        printHeader();
        printTab(100);
        timeTable_reys.forEach(new BiConsumer<String, TimeTableEntryReys>() {
            @Override
            public void accept(String s, TimeTableEntryReys entry) {
                String reys = entry.getReys();
                int from = entry.getFrom();
                int to = entry.getTo();
                int length = entry.getLength();
                City city = cities.get(from);
                String nameFrom = city.getName();
                City city1 = cities.get(to);
                String nameTo = city1.getName();

                System.out.printf(" %-8s %-24s -> %-24s %s \n", reys, nameFrom, nameTo, entry.descripTime());
                //System.out.println(entry);
            }


        });
        printTab(100);
    }
}
