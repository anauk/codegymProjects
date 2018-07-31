package solutions;
import java.util.*;
public class ArrayListSort {
/* Сортирует набор чисел: парные по возрастанию,
   не парные по убыванию
*/
//создаем отдельно в класе функцию для ввода данных
    private static List<Integer> inputArray(Scanner in) {//название метода с входными данными из сканера
    int N = in.nextInt();//в переменную(N-выдает количество элементов) получаем данные
    List<Integer> list = new ArrayList<>();// создаем арей лист
    for (int i = 0; i < N; i++) {//через цикл заполняем лист данными
        list.add(in.nextInt());
    }
    return list;//возращаем результат(заполненый лист элементами),где был вызван метод
    }
//создаем функию для печати (вывода)
    private static void printArray(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {// проходимся циклом по листу
            System.out.print(list.get(i)+" ");//выводим на печать
        }
    }
public static void main(String[] args) {
            String input ="5\n" +
                                "1 2 3 4 5";
            Scanner in = new Scanner(input);
            /*-это ввод данных,их еще можно обобщить в методе
            Scanner in = new Scanner("5\n" +
                    "1 2 3 4 5");
            int N = in.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                list.add(in.nextInt());
            }*/
// в переменную лист вызываем функцию ввода данных
            List<Integer> list = inputArray(in);
//создаем компаратор и задаем условия для сортировки данных
            Comparator<Integer> comp = new Comparator<Integer>() {
                @Override
                public int compare(Integer n1, Integer n2) {
                    if (n1 % 2 == 0 && n2 % 2 == 0) {//если два числа парные-сортирует по возрастанию
                        return n1-n2;
                    }
                    if (n1 % 2 != 0 && n2 % 2 != 0) {//если не парные,сортирует по убыванию
                        return n2-n1;
                    }
                    if (n1 % 2 == 0 && n2 % 2 != 0) {//если одно парное, а второе нет, то ставит парное в начало списка
                        return -1;
                    }
                    if (n1 % 2 != 0 && n2 % 2 == 0) {//если первое не парноеб то ставит его в конец списка
                        return 1;
                    }
                    return 0;
                }
            };
            //сортируем по заданым условиям
            Collections.sort(list, comp);
            // вызываем функцию распечатки результата
            printArray(list);
            //System.out.println(list);
        }
}