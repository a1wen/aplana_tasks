package ru.aplana.homework.lesson3.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by a1wen on 23.03.2017.
 */
public class Application {
    public static void main(String[] args) throws Exception {
        new Application().run();
    }
    private void run() throws IOException{
        Employee emp = inputEmployee();
        System.out.println("=======================================================");
        System.out.println("=======================================================");
        System.out.println(emp); //проверка содержимого объекта
        //output();  добавить реализацию вывода данных о работнике
    }

    private Employee inputEmployee() throws IOException {
        System.out.println("  Input employee ->");
        String surname = inputData("    Surname");
        String name = inputData("    Name");
        String position = inputData("    Position");
        String salary = inputData("    Salary");

        Employee employee = new Employee();
        employee.setSurname(surname);
        employee.setName(name);
        employee.setPosition(position);
        employee.setSalary(Float.valueOf(salary));

        return employee;
    }
    private String inputData(String message) throws IOException {
        System.out.print(message + ": ");
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String result = buff.readLine();
        return result;
    }
}
