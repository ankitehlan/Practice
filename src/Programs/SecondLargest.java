package Programs;

import java.util.ArrayList;
import java.util.Comparator;

public class SecondLargest {
        public static void main(String[] args) throws Exception {
        ArrayList<Employee> emp = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.salary = 152000.0;
        Employee emp2 = new Employee();
        emp2.id = 2;
        emp2.salary = 153000.0;
        Employee emp3 = new Employee();
        emp3.id = 3;
        emp3.salary = 142000.0;
        Employee emp4 = new Employee();
        emp4.id = 4;
        emp4.salary = 123000.0;
        Employee emp5 = new Employee();
        emp5.id = 5;
        emp5.salary = 113000.0;

        emp.add(0, emp1);
        emp.add(1, emp2);
        emp.add(2, emp3);
        emp.add(3, emp4);
        emp.add(4, emp5);

        int id = emp.stream()
        .sorted(Comparator
        .comparingDouble(Employee::getSalary)
        .reversed())
        .skip(1)
        .findFirst()
        .get().getId();

        System.out.println(id);

        // emp.stream()
        // .sorted(Comparator.comparingDouble(Employee::getSalary))
        // .forEach((employee) -> {
        //     System.out.println(employee.salary);
        // });
    }
}
