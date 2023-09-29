/*
 * Employee

Id
Name
Sal
Design


ArrayList<emp>

Salary < 50,000
Design = dev


2.

Add 10000 


ArrayList<emp> emp = ArrayList.asList(…)

Emp.stream().filter(p-> {
P.salary < 50000 && p.desig == “dev”
}).map(p->p.salary += 10000).sort(Comparator.comparing(Integer:: collect(Collections.toList());
 */

package Programs;

public class Employee {
    int id;
    double salary;

    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
}
