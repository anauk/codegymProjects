package solutions.july0807.tools;

import java.io.*;
import java.util.function.Consumer;

public class NumberIt {
    public static final String PATH = "src/main/java/solutions/july0807";
    private static final String CITIES_IN_RAW = "draft/cities.txt";
    public static final String CITIES_OUT_FORMATTED = "citiesNumber.txt";
    private static int counter = 0;

    public static void main(String[] args) throws IOException {
        BufferedWriter w = new BufferedWriter(new FileWriter(new File(PATH, CITIES_OUT_FORMATTED)));
       new BufferedReader(new FileReader(new File(PATH, CITIES_IN_RAW))).lines()
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(final String s) {
                        try {
                            w.write(String.format("%d:%s\n",++counter,s.trim()));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
        w.close();
    }
}
