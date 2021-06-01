//DisplayArrayList.java
 
package com.arraylist;
 
import java.util.*;
 
class Employee{
    public int id;
    public String name;
    public int salary;
    public static int count = 0;
 
    public Employee(){}
 
    public Employee(int id, String name,int salary)
    {
        super();
        this.id = id;
        this.name = name;
        this.salary=salary;
        count++;
    }
 
    public int getId() {
    return id;
    }
 
    public String getName() {
    return name;
    }
 
    public int getSalary() {
    return salary;
    }
}
 
public class DisplayArrayList {
public static void main(String[] args) throws Exception 
    {
     List<Employee> list = new ArrayList<Employee>();
 
     list.add(new Employee(1, "Rani",5000));
     list.add(new Employee(2, "Radhika",10000));
     list.add(new Employee(3, "Kanthi",15000));
     list.add(new Employee(4, "Anupama",20000));
 
        for (Employee e : list)
        {
            System.out.print("Emp Id, Name and Salary of the employee are : ");
            System.out.println(e.getId()+" "+e.getName()+" " +e.getSalary());
        }
    }
}