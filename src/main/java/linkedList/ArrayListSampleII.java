package linkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ArrayListSampleII {
    public static void main(String[] args) {
        List<Employee> employees = new Data().get();

        employees.forEach(new EC());

        Consumer<Employee> consumer = new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee.fullName());
            }
        };

        employees.forEach(consumer);
        employees.forEach(e -> System.out.println(e.fullName()));
        employees.forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                employee.print();
            }
        });
        employees.forEach(Employee::print);

        System.out.println("=============");

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.beginYear - o2.beginYear;
            }
        });

        for (int i = 0; i <  employees.size(); i++) {
            System.out.println(employees.get(i).fullName());
        }

        employees.sort((o1, o2) -> o1.salary - o2.salary);

        for (int i = 0; i <  employees.size(); i++) {
            Employee e = employees.get(i);
            System.out.println(e.fullName());
        }

        Collections.sort(employees);

        String header="<html><body><table>";
        String footer="</table></body></html>";
        String body = employees.stream().map(e->e.html()).collect(Collectors.joining());
        System.out.println(header+body+footer);


    }
}
