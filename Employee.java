package org.example;

class Employee {
    private String name;
    private String email;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', email='" + email + "'}";
    }
}
