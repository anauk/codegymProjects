package linkedList;

import java.util.Arrays;
import java.util.List;

public class Employee implements Comparable<Employee>{// данные работника
    int id;
    int salary;
    String name;
    int beginYear;

    public Employee(){//конструктор с пустыми параметрами
    }
//конструктор с параметрами номера,зарплаты, имени и пустым годом поступления,который ссылается на последний конструктор
    public Employee(int id, int salary, String name){
        this(id, salary, name, 0);
    }

    public Employee(int id, int salary, String name, int beginYear ){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.beginYear = beginYear;
    }

    public String fullName() {
        return id+" " + beginYear + " " + name + " "+salary;
    }

    private String tr(String... s) {
        List<String> strings = Arrays.asList(s);
        StringBuilder sb = new StringBuilder();
        strings.forEach(s1 -> sb.append(td(s1)));
        return "<tr>"+sb.toString()+"</tr>";
    }

    private String td(String s) {
        return "<td>"+s+"</td>";
    }

    public String html() {
        return tr(Integer.toString(id), Integer.toString(beginYear), name, Integer.toString(salary));
    }

    public void print() {
        System.out.println(this.fullName());
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}