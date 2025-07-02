package org.example;

public class Employees {
    private String name;
    private int age;
    private int id;
    private String dept;
    private int salary;

    public Employees(String name, int age, int id, String dept, int salary){
        this.name = name;
        this.age = age;
        this.id = id;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }

    public String getDept(){
        return dept;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", id=" + id +
                ", dept='" + dept + "', salary=" + salary + "}";
    }
}
