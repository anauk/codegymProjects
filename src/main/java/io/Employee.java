package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Employee {
   /* static Logger log = LoggerFactory.getLogger(Example2.class);

    public static String extractName(String s){
        return s.substring(6, s.length());
    }

    public static int extractSalary(String s){
        return Integer.parseInt(s.substring(8, s.length()));
    }

    public static void main(String[] args) throws FileNotFoundException {

        File employeesData = new File("./src/main/java/io", "data.txt");
        log.info("File: " + employeesData.toString() + " found " + employeesData.exists());

        BufferedReader bf = new BufferedReader(new FileReader(employeesData));
        ArrayList<String> emp = new ArrayList<>();
        bf.lines()
                .filter(s -> s.contains("Name:") || s.contains("Salary:"))
                .forEachOrdered(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        log.info(s);
                        emp.add(s);
                    }
                });
        emp.forEach(System.out::println);

    }*/
   public static void main(String[] args) {
       int[] a = {1, 2, 3, 4, 5};
       String s = "" + a;
       System.out.println(a);
       System.out.println(s);
       System.out.println(Arrays.toString(a));


   }
}
