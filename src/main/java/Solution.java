import javax.xml.bind.SchemaOutputResolver;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main1(String[] args) throws IOException {
        // System.out.println("Hello DAN.IT");
//for(int i=0; i<5; i++){
        //  System.out.println("Hello DAN.IT");
//}
      /*  Scanner in = new Scanner(System.in);//object for data keyboard
        System.out.println("Ведите целое число: ");
        int a = in.nextInt();//to display on the screen
        int a1=a*a;
        System.out.println(a1);
        for (int i=0; i<10;i++) {
            System.out.println("JavaRush. Learn once - use anywhere");
        }*/
        /*System.out.println("Меня зовут Амиго.");
        System.out.println("");
        str(800,"первый");
        str(1500,"второй");
        str(2200,"третий");
        str(2700,"четвертый");
        str(3200,"пятый");
        System.out.println("");
        System.out.print("Поцелуй мой блестящий металлический зад!");

    }
    public static void str(int s,String god){

        System.out.println("Я согласен на зарплату $"+s+"/месяц в "+god+" год.");
    }*/
    /*print("Java easy to learn!");
    print("Java opens many opportunities!");
}

    public static void print(String s) {
        for (int i=0; i<2; i++){
            System.out.println(s);
        }
        //напишите тут ваш код
    }*/
        /*salary(700);
    }

    public static void salary(int a) {
        int c=a+100;
        System.out.println("Твоя зарплата составляет: "+c+" долларов в месяц.");//напишите тут ваш код
    }*/
       /* printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double c =  2 * 3.14 * radius;
        System.out.println(c);
           }*/
        /*int a=5;
        int b=10;
        System.out.println(sum(a,b));
        System.out.println(mul(a,b));
    }
    public static int sum(int a, int b){
        return a+b;
            }
    public static int mul(int a, int b){
        return a*b;
    }*/
       /* Person person = new Person();
           }

    public static class Person {
        String name;
        int age;
        int weigth;
        int money;//напишите тут ваш код
    }*/
       /* System.out.println(convertCelsiumToFahrenheit(41));
    }
    public static double convertCelsiumToFahrenheit(int celsium) {
        return (celsium * 9.0 / 5) + 32;
    }*/
        /*System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(10, 5, 10));
    }
    public static int min(int a, int b, int c) {
        int result = a;
        if (b<result) result=b;
        if (c<result) result=c;
        return result;
*/

        /*System.out.println(1 + 2 * 3 + 4 * 5 + (6 * 7 + 8) * 9 + 10 * 11 + 12 * 13 + 14 + 15);
        int sum=0;
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        for (int a: num){
            sum += a;
            System.out.println(sum);
        }*/
        /*int m = 1;
        for(int i = 1; i<11; i++){
            m *= i;
                    }
        System.out.println(m);
    }*/
       /* System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        return a*b*c;
    }*/
        /*for (int i=1; i<11; i++){
            for (int j=1;j<11;j++){
                System.out.print((i*j) + " ");
            }
            System.out.println();
        }*/
        //System.out.println("\u65e5 \u672c \u8a9e");
       /* Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int number = scanner.nextInt();
        System.out.println(name + " захватит мир через "+ number + " лет. Му-ха-ха!");*/
        /*InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        String name3 = bufferedReader.readLine();
        System.out.println(name1 +"+" +name2 +"+"+ name3 + " = Чистая любовь, да-да!");*/

        /*System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum=0;
         int i=0;
        while(number>0){
            sum +=number%10;
            number = number/10;
       i++;
        }return sum;*/
        System.out.println("Изначальный REC ( 15 , 9 )");
        System.out.println(rec(15, 9)); // запускаем sout с возвращаемым функцией [rec] результатом
    }

    static int rec(int m, int n) { // передаем в функцию [rec] 2 числа
        if (m % n == 0) { // если первое число [m] делится на второе число [n] нацело, то возвращаем его
            System.out.println("Окончателное число " + n);
            return n;
        } else {
            // если не делится нацело, то перезапускаем функцию и заносим в него другие аргументы :
            // в качестве первого уже будет второе число [n],
            // а в качестве второго будет остаток от деления первого[m] на второе[n] 15 / 9 = 1 (+ остаток 6)
            System.out.println("Заносим в REC (" + n + " , " + m % n + ")");
            return rec(n, m % n);
        }
    }

    //Ближайшее к 10. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
    public static void main2(String[] args) {
        closeToTen(8, 11);
        closeToTen(-7, 14);
    }

    public static void closeToTen(int a, int b) {
        if (abs(10 - a) <= abs(10 - b)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    //Попадём-не-попадём
    public static void main3(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {

        if (a > 50 & a < 100) {
            System.out.println("Число " + a + " содержится в интервале.");
        } else {
            System.out.println("Число " + a + " не содержится в интервале.");
        }

    }

    /*
    Времена года на Терре
     */
    public static void main4(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        /*if(month==12 | month<=2 ) System.out.println("зима");
        else if (month<=5) System.out.println("весна");
        else if (month<=8) System.out.println("лето");
        else System.out.println("осень");*/

        if (month == 12)
            month = 1;
        int num = ((int) Math.floor(month / 3));
        String season[] = {"зима", "весна", "лето", "осень"};
        System.out.println(season[num]);
    }

    //Положительное и отрицательное число
    public static void main5(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
       /* System.out.print("Введите число: ");
        int n1 = in.nextInt();
        System.out.print("Введите число: ");
        int n2 = in.nextInt();*/
        number(n);
        /*number(n1);
        number(n2);*/
    }

    public static void number(int n) {
        if (n > 0) System.out.println(n * 2);
        if (n < 0) System.out.println(n + 1);
        if (n == 0) System.out.println(n);
    }

    /*
  День недели
*/
    public static void main6(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        int n = in.nextInt();
        dayWeek(n);
    }

    public static void dayWeek(int n) {
        if (n >= 1 && n <= 7) {
            if (n == 1) System.out.println("понедельник");
            if (n == 2) System.out.println("вторник");
            if (n == 3) System.out.println("среда");
            if (n == 4) System.out.println("четверг");
            if (n == 5) System.out.println("пятница");
            if (n == 6) System.out.println("суббота");
            if (n == 7) System.out.println("воскресенье");
        } else {
            System.out.println("такого дня недели не существует");
        }
    }

    /*
    Высокосный год*/
    public static void main8(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        year(n);
    }

    public static void year(int n) {
        if (n % 4 == 0) {
            if ((n % 400 != 0) && (n % 100 == 0)) {
                System.out.println("количество дней в году: 366");
            } else {
                System.out.println("количество дней в году: 365");
            }
        } else {
            System.out.println("количество дней в году: 365");
        }
    }

    /*Треугольник*/
    public static void main9(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }

    /*Светофор*/
    public static void main10(String[] args) {
        Scanner in = new Scanner(System.in);
        double t = in.nextDouble();
        double t1 = t % 5.0;
        if (t1 < 6.0 && t1 >= 4.0) {
            System.out.println("красный");
        }
        if (t1 < 4.0 && t1 >= 3.0) {
            System.out.println("желтый");
        }
        if (t1 < 3.0 && t1 >= 0) {
            System.out.println("зеленый");
        }
    }

    /*Существует ли пара?*/
    public static void main11(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        /*if (n==n1&&n1==n2) System.out.println(n+" "+n1+" "+n2);
        if (n==n1&&n1!=n2) System.out.println(n+" "+n1);
        if (n==n2&&n!=n1) System.out.println(n2+" "+n);
        if (n1==n2&&n!=n2) System.out.println(n2+" "+n1);*/
        if (n == n1 || n == n2) {
            System.out.print(n + " ");
        }
        if (n1 == n || n1 == n2) {
            System.out.print(n1 + " ");
        }
        if (n2 == n1 || n2 == n) {
            System.out.print(n2 + " ");
        }
    }

    //минимальное число
    public static void main12(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void main13(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int b1 = Integer.parseInt(reader.readLine());
        // int b2 = Integer.parseInt(reader.readLine());
        // int b3 = Integer.parseInt(reader.readLine());
        int[] num = new int[4];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        max(num);
    }

    public static void max(int[] num) {
        int max = num[0];

        for (int i = 0; i < num.length; i++)
            if (max < num[i]) {
                max = num[i];
            }
        System.out.printf("%d", max);
    }
//вывод 4-х чисел по убыванию
    public static void main14(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int [] a = new int[3];
        for (int i = 0; i < 3 ; i++) {
            a[i] = Integer.parseInt(in.readLine());
        }
        Arrays.sort(a);
        for (int i=2; i>=0 ; i--) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main15(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String s1 = in.readLine();
        if (s.equals(s1)) {
            System.out.println("Имена идентичны");
        } else if  (s.length() == s1.length()) {
                System.out.println("Длины имен равны");
            }
    }
    public static void main16(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int b1 = Integer.parseInt(in.readLine());
        int b2 = Integer.parseInt(in.readLine());
        int b3 = Integer.parseInt(in.readLine());
        if (b1!=b2 && b1!=b3 && b2==b3){
            System.out.println("1");
        } else if (b2!=b1 && b2!=b3 && b1==b3) {
            System.out.println("2");
        } else if (b3!=b1 && b3!=b2 && b1==b2) {
            System.out.println("3");
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        if (n % 2 == 0) {
            if (n < 10 && n >= 0) System.out.println("четное однозначное число");
            if (n < 100 && n >= 10) System.out.println("четное двузначное число");
            if (n < 1000 && n >= 100) System.out.println("четное трехзначное число");
        } else {
            if (n < 10 && n >= 0) System.out.println("нечетное однозначное число");
            if (n < 100 && n >= 10) System.out.println("нечетное двузначное число");
            if (n < 1000 && n >= 100) System.out.println("нечетное трехзначное число");
        }
    }
}
