package steak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.function.Consumer;

public class Characters {
    public static void main(String[] args) {
        String line ="This is test string";
        ArrayList<Pair> list = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
          //  Pair pair = new Pair(line.charAt(i),i);
          //  list.add(pair);
        }
        //list.forEach(Pair::print);//распечатали букву с номером в виде списка
        //делаем список с букв-ключей без дубликатов
        Set<Character> keysUnsorted = new HashSet<Character>();
        list.forEach(new Consumer<Pair>() {
            @Override
            public void accept(Pair pair) {
                keysUnsorted.add(pair.ch());
            }
        });
        //сортируем список через приорити
        PriorityQueue<Character> keysSorted = new PriorityQueue<>();
        keysUnsorted.forEach(c -> { //убираем пробелы, потом поставим это в начало, чтобы не тянуть пробелы
            if (Character.isLetter(c)) {
                keysSorted.add(c);
            }
        });
        }
    }


