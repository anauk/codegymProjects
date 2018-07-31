package solutions;

import java.util.*;
/*
Отсортировать сотрудников по номеру ID
 */

public class ArrayListSortII {
//создаем клас для нового сотрудника с его данными
    static class Employee {
        int id;
        int salary;
        String name;
        int beginYear;
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner("5\n"+
                "1000 Alex 2011 300 Masha 2015 250 Sasha 2013 400 Dima 2011 100 Sergey 2013");
        int N = in.nextInt();
        System.out.println(N);
        // создаем аррей лист с указанием количества сотрудников
        ArrayList<Employee> employees = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {//в цикле заполняем лист данными по зарплате
            int salary = in.nextInt();
            Employee e = new Employee();//создаем обект для нового сотрудника ипрописываем данные
            e.id = i;
            e.salary = salary;
            e.name = in.next();
            e.beginYear = in.nextInt();
            employees.add(e);
        }
//сортируем по зарплате, через компаратор
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.salary - o2.salary;
            }
        });
//

        for (int i = 0; i <  employees.size(); i++){           //1 способ
            System.out.println(employees.get(i).id+"\n"
                    + employees.get(i).salary + "\n "
                    +employees.get(i).name +"\n"+
                    employees.get(i).beginYear);
        }
        //1=2
       /* StringBuilder sb = new StringBuilder();              //2  способ
        for (int i = 0; i <  employees.size(); i++){
            sb.append(employees.get(i).id+" ");
        }
        System.out.println(sb.toString().trim());*/

    }
}
