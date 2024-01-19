package org.example;


public class Employee {
    private String name;
    private String occupation;
    private String email;
    private String phoneNumber;
    private int age;
    private int salary;


    public Employee(String name, String occupation, String email, String phoneNumber, int age, int salary) {
        this.name = name;
        this.occupation = occupation;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
    }

    public void getInfoEmployee() {
        System.out.println("NAME:" + name + " OCCUPATION:" + occupation + " EMAIL:" + email + " PHONE:" +
                phoneNumber + " AGE:" + age + " SALARY:" + salary);
    }
}

