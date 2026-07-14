package com.Employee;

public class Employee {
    private final String Name;

    private int age;

    private int salary;

    public Employee(String Name, int age, int salary){
        this.Name = Name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return this.Name;
    }

    public int getage(){
        return this.age;
    }

    public int getsalary(){
        return this.salary;
    }

    public void setage(int age){
        this.age = age;
    }

    public void setsalary(int salary){
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employe Name: "+ this.Name + " Age: "+ this.age + " Salary: "+ this.salary);
    }
}
