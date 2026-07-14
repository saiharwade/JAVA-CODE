package com.Employee;

public class TestAcces {
    public static void main(String[]args){
        Employee e1 = new Employee("Sai",22,20000000);
        System.out.println(e1.getsalary());
        e1.displayDetails();
    }
}
