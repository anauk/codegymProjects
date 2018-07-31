package solutions.june180629;

import java.io.*;
import java.util.ArrayList;

/*
Есть файл формата:
...
Manager: Victor
Topmanager: Sergey
Director: Masha
...
количество записей каждого типа не известно,
последовательность произвольная
Необходимо:
3.1. Посчитать количество всех Manager / Topmanager / Director
3.2. Вывести всех Manager / Topmanager / Director в формате:
Manager:10:[Victor, ..., ..., ..., ...]
Topmanager:3:[Sergey, ..., ..., ..., ...]
Director:1:[Masha]*/
public class List {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("src/main/java/solutions/june180629", "data.txt")));
        ArrayList<String> emp = new ArrayList<>();
        while (br.ready()) {
            String s = br.readLine();
            emp.add(s);
        }
        System.out.println(emp);
        int countTop = 0;
        int countMan = 0;
        int countDir=0;
        for (int i=0; i<emp.size(); i++) {
            //if (find.topmanager)countTop++;
           // if (find.manager) countMan++;
            //if (find.director) countDir++;
        }
    }
}
