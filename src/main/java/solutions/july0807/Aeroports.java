package solutions.july0807;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
/*Создаю метод, который читает city.txt в HashMap */
public class Aeroports {
    public static Map<Integer, City> read() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(new File("src/main/java/solutions/july0807", "city.txt")));
        Map<Integer, City> cities = new HashMap<>();
        String line;
        while (true) {
            line = bf.readLine();
            if (line == null) break;
            String[] s = line.split(":");
            int id = Integer.parseInt(s[0]);
            cities.put(id, new City(id, s[1]));
        }
        return cities;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read());
    }
}
