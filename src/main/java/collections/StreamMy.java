package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMy {
    public static void main_(String[] args) {
        List<String> list1 = Arrays.stream(args)//делает из массива стрим-это источник
                .filter(s -> s.length() <= 3)//отбирает только те строки, длиной не больше 3 - промежуточный оператор
                .collect(Collectors.toList());//собирает получ. эл. в новый список - это терминальный оператор
    }

    public static void main1(String[] args) {
        IntStream.of(312, 14, 15, 456, 34, 67)
                .filter(x -> x < 67)//отбирает ел.меньше 67
                .map(x -> x + 11)//прибавляет к каждому отобраному эл. 11
                .limit(3)//ограничение чисел, их должно быть не больше 3
                .forEach(i -> System.out.println(i));//заполняети распечатывает
        // тоже, что предыдущее,только через цикл(старый вариант
        int[] arr = {312, 14, 15, 456, 34, 67};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 67) continue;
            arr[i] += 11;
            count++;
            if (count > 3) break;
            System.out.println(arr[i]);
        }
        //вызов паралельного стрима либо через метод parallelStream() вместо stream(), либо вызвав промежуточный оператор .parallel()
        /*list.parallelStream()
                .filter(x -> x > 10)
                .map(x -> x*2)
                .collect(Collectors.toList());
        IntStream.range(0, 10)
                .parallel()
                .map(x -> x*10)
                .sum();*/
    }

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .forEach(System.out::print);
        System.out.println("");
        Stream.generate(() -> 6)
                .limit(6)
                .forEach(System.out::print);
        System.out.println("");
        Stream.iterate(2, x -> x + 6)
                .limit(6)
                .forEach(obj -> System.out.print(obj + " "));
        System.out.println("");
        Stream.iterate(1, x -> x * 3)
                .limit(4)
                .forEach(obj -> System.out.print(obj + " "));
        System.out.println("");
        // in Java 9 Stream.iterate(20, x -> x <= 100, x -> x+10)
        //.forEach(obj -> System.out.print(obj +" "));
        Stream.concat(//соединение двух стримов
                Stream.of(1, 2, 3),
                Stream.of(4, 5, 6))
                .forEach(System.out::print);
        System.out.println();
        Stream.concat(
                Stream.of(10),
                Stream.of(4, 16)
        ).forEach(System.out::print);
        System.out.println();
        Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder()//добавление эл. встрим без использконтейнера
                .add(0)
                .add(1);
        for (int i = 2; i <= 8; i += 2) {
            streamBuilder.accept(i);
        }
        streamBuilder
                .add(9)
                .add(10)
                .build()
                .forEach(System.out::print);
        System.out.println();

        IntStream.range(1,10)//создание стрима из числового промежутка (rangeClosed(1,10)-включительно)
                .forEach(System.out::print);
        System.out.println();
    }

}
