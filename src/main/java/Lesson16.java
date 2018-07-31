public class Lesson16 {
    public static int i=6;

    public static void main(String[] args) {//вошли в программу
        //recursive(5);
        final int VAL=5;

        int[] asArray = new int[VAL];//массив. Обявить массив можно в классе,а записать сдесь
        int f = fact(VAL,asArray);//метод где передали 5 и массив
        System.out.println(f);//выводить резульат функции
        for (int v:asArray) {//цикл распечатывает результат метода , он равен циклу ниже
           // for (int j = 0; j <asArray.length ; j++) {
            //    int v=asArray[i];
            //    System.out.println(v);
            //}
            System.out.println(v);
        }
    }

    public static void recursive(int value) {
        int j =value;
        if (value==0) return;
        System.out.println(value);
        recursive(value-1);
        System.out.printf("returned found i:%d\n",value);
    }
    public static int fact(int value, int[] asArray){
        if (value<1) return 1;
        int factorial = value*fact(value-1, asArray);
        asArray[value-1]=factorial;
        return factorial;
    }
}
