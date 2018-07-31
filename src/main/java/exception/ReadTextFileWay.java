package exception;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadTextFileWay {
    public static void main1(String[] args) {
        File file = new File("src/main/java/exception", "line.txt");
        List<String> list = new ArrayList<>();
        try (Stream<String> line = new BufferedReader(new FileReader(file)).lines()) {
                line.forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    System.out.println(s);
                }
            });
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException ignored) {
        }
            System.out.println(list);
    }
    public static void main2(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/exception", "line.txt");
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
    }
   // 1 вариант записи в файл
    public static void main10(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/exception", "line1.txt");
        ArrayList<String> content = new ArrayList<>();
        content.add("Hello");
        content.add("World");
        Files.write(path, content);
    }
    // 2 вариант записи в файл
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/exception", "line1.txt");
        BufferedWriter w = new BufferedWriter(new FileWriter(file,true));
        //this line if you would like to append the content to end of the file
        //BufferedWriter w = new BufferedWriter(new FileWriter(file, true));
        Arrays.asList("line1","line2","line3","Привет").forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                try {
                    w.write(s);
                    w.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        w.close();
    }
}
