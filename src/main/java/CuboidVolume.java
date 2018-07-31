import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
Дан массив сторон(N) кубоида.
Найдите максимальный объем кубоида, который может быть создан из этих ребер.
Обратите внимание, что кубоид имеет 12 ребер, и каждый 4 ребра имеют одинаковую длину.
 */
public class CuboidVolume {
    private static void printPQ(PriorityQueue<Integer> pq) {
        while (pq.size()>0) {
            Integer poll = pq.poll();
            System.out.print(poll+", ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("24 3 5 5 7 7 3 4 4 9 5 7 1 1 9 9 1 3 5 3 4 4 7 1 9");
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2-o1);//создаем списо, куда ложим цифры и сортируем по убыванию
        int len=in.nextInt();
        for (int i = 0; i < len; i++) {
            pq.add(in.nextInt());
        }
        int count = 1;
        int currentEl = pq.poll();
        PriorityQueue<Integer> sides = new PriorityQueue<>(3);// создаем список, кудара скидаем 4 одинаковых ребра, максимум их 3 для кубоида
        while (pq.size()>0) {//заполняем лист,пока есть цифры
            int nextEl = pq.poll();
            if (currentEl == nextEl) {//пока данные есть,считаем их
                count++;
                if (count == 4) {//если нашлись 4 одинаковых максимальных числа
                    sides.add(currentEl);//то оформляем сторону
                    if (sides.size() == 3) {//таких сторон должно быть 3, если их 3,то выходим
                        break;
                    }
                    count = 0;//обнуляем
                }
            } else {
                count = 1;
                currentEl = nextEl;
            }

        }
        int volume = -1;// задаем обьем кубоида
        if (sides.size() == 3) {//если 3 стороны найдены
            volume = sides.poll()*sides.poll()*sides.poll();// то считаем обьем
        }
        System.out.println(volume);// выводим обьем на экран
        //printPQ(pq);
    }
}
