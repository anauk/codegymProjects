package solutions.lesson240618;

import java.io.*;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
/*
* Прочитать текстовый файл с именами
Выбрать уникальные имена (которые не повторяются) т записать их в новый файл.*/

public class Exercize1 {
    public static void main(String[] args) throws IOException {
        File f = new File("src/main/java/solutions/lesson240618", "doc.txt");
        //f.createNewFile();
        FileInputStream fis = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        Set<String> hs = new HashSet<>();
        String line = br.readLine();
        while (line != null){
            hs.add(line);
            line = br.readLine();
        }
        PriorityQueue<String> pq = new PriorityQueue<>(hs);

        File end = new File("src/main/java/solutions/lesson240618","end.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(end));
        while (pq.size()>0) {
            String item = pq.poll();
            bw.write(item + " ");
        }
        bw.close();
    }
}
