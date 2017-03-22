package ru.aplana.homework.lesson3.task5;

/**
 * Created by a1wen on 23.03.2017.
 */
public class Employee {
    private int id = 0;
    private String surname;
    private String name;
    private String position;
    private float salary;

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public Employee(){
        this.id = id++;
    }
}
