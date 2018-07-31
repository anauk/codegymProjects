package tests;

public class AdderTestInplement {
    public static boolean test1(int expected, int calculated) {
        if (expected == calculated) {
            return true;
        } else {
            return false;
        }
       // return expected == calculated;
    }
// тест на правильность выполнения суммирования для одного значения
    public static void main_(String[] args) {
        Adder a = new Adder(1,2);
        System.out.println(test1(a.get(),3)?"OK":"ERROR");
    }
    public static void main(String[] args) {
        //создаем ссылку на тест дата генератор
     //   DataProvider provider = new DataProvider;

        TestDataGenerator tg = new TestDataGenerator();
        for (TestData testItem : tg) {
            int d1 = testItem.val1();
            int d2 = testItem.val2();
            int expected = testItem.result();

            Adder a = new Adder(d1, d2);
            int calculated = a.get();
            boolean result = test1(expected, calculated);
            System.out.println(result?"OK":"ERROR");

        }
    }
    // тест на правильность выполнения суммирования для массива значений значений
    public static void main2(String[] args) {
        TestDataGenerator tg = new TestDataGenerator();
        for (TestData testItem : tg) {
            int d1 = testItem.val1();
            int d2 = testItem.val2();
            int expected = testItem.result();

            Adder a = new Adder(d1, d2);
            int calculated = a.get();
            boolean result = test1(expected, calculated);
            System.out.println(result?"OK":"ERROR");

        }
    }
    // для результатов теста и их распечатки
    public static void main1(String[] args) {
        System.out.println(new TestData(1,2,3));
    }

}
