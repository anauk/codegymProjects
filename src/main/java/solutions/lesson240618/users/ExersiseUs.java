package solutions.lesson240618.users;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

import static solutions.lesson240618.users.User.extractName;
import static solutions.lesson240618.users.User.extractSalary;

/*Прочитать текстовый файл с пользователяи в формате
Name:Victor
Year:1980
Salary:2000
...
Создать класс `User`, положить их в коллекцию, отсортировать по зарплате
и положить в новый файл в томже формате
4.1 положить в формате xml
<users>
<user>
<name>Victor</name>
<year>1980</year>
<salary>2000</salary>
</user>
...
</users>*/
public class ExersiseUs {
    public static void main (String[] args) throws IOException {
        File f = new File("src/main/java/solutions/lesson240618", "name.txt");
        BufferedReader bf = new BufferedReader(new FileReader(f));
        System.out.println(f.exists());
        ArrayList<String> str = new ArrayList<>();
        ArrayList<User> us = new ArrayList<>();
        String s = bf.readLine();
        while (s != null) {
            str.add(s);
            s = bf.readLine();
        }
        str.forEach(System.out::println);
        for (int i = 0; i < str.size(); i+=3) {
            String tempName = "";
            int tempSalary = 0;
            int tempYear = 0;
            if (str.get(i).startsWith("Name")){
                tempName = extractName(str.get(i));
            }
            if (str.get(i+1).startsWith("Year")){
                tempYear = extractSalary(str.get(i + 1));
            }
            if (str.get(i+2).startsWith("Salary")){
                tempSalary = extractSalary(str.get(i + 2));
            }
            us.add(new User(tempName, tempYear, tempSalary));
        }
        us.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getSalary()-o2.getSalary();
            }
        });
        System.out.println(us);
        writeString(us);
        writeXML(us);
    }

    public static void writeString(ArrayList<User> us) throws IOException {
        File end = new File("src/main/java/solutions/lesson240618","endname.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(end));
        for (User item : us) {
            bw.write(item.toString() );
            bw.write("\n");
        }
        bw.close();
    }

    public static void writeXML(ArrayList<User> us) throws IOException {
        File end = new File("src/main/java/solutions/lesson240618","endname.xml");
        BufferedWriter bw = new BufferedWriter(new FileWriter(end));
        for (User item : us) {
            bw.write(item.toStringXML() );
            bw.write("\n");
        }
        bw.close();
    }
}
