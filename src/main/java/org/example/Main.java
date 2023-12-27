package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.Viewer.arrayToString;

/*
 Java Development Kit (семинары)
 Урок 4. Коллекции
 Создать справочник сотрудников
 Необходимо:
 Создать класс справочник сотрудников, который содержит внутри
 коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 Табельный номер
 Номер телефона
 Имя
 Стаж
 Добавить метод, который ищет сотрудника по стажу (может быть список)
 Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 Добавить метод, который ищет сотрудника по табельному номеру
 Добавить метод добавление нового сотрудника в справочник
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employeesList = new ArrayList<>();
        Employees employees = new Employees(employeesList);
        Employee e01 = new Employee(1, "+79184440101", "Василий1", 11);
        Employee e02 = new Employee(2, "+79184440202", "Василий2", 12);
        Employee e03 = new Employee(3, "+79184440303", "Василий3", 13);
        Employee e04 = new Employee(4, "+79184440404", "Василий4", 15);
        Employee e05 = new Employee(5, "+79184440505", "Василий2", 15);
        Employee e06 = new Employee(6, "+79184440606", "Василий6", 16);
        Employee e07 = new Employee(7, "+79184440707", "Василий7", 15);
        Employee e08 = new Employee(8, "+79184440808", "Василий8", 18);
        Employee e09 = new Employee(9, "+79184440909", "Василий9", 19);
        Employee e10 = new Employee(10, "+79184441010", "Василий10", 20);
        employees.add(e01);
        employees.add(e02);
        employees.add(e03);
        employees.add(e04);
        employees.add(e05);
        employees.add(e06);
        employees.add(e07);
        employees.add(e08);
        employees.add(e09);
        employees.add(e10);

        System.out.println("Выводим полный список через toString() класса Employees:");
        System.out.println(employees);
        System.out.println("Выводим полный список через свой метод arrayToString():");
        arrayToString(employees.getEmployees());

        System.out.println("\nПоиск по табельному номеру:");
        System.out.println("Номер 5:");
        arrayToString(employees.searchByEmployeeNumber(5));
        System.out.println("Номер 7:");
        arrayToString(employees.searchByEmployeeNumber(7));

        System.out.println("\nПоиск по стажу:");
        System.out.println("По стажу 15 месяцев:");
        arrayToString(employees.searchByExperience(15));
        System.out.println("По стажу 12 месяцев:");
        arrayToString(employees.searchByExperience(12));

        System.out.println("\nПоиск по имени:");
        System.out.println("Поиск Василий2:");
        arrayToString(employees.searchByName("Василий2"));
        System.out.println("Поиск Василий4:");
        arrayToString(employees.searchByName("Василий4"));

        System.out.println("\nПоиск по номеру телефона:");
        System.out.println("Номер содержит 9184440:");
        arrayToString(employees.searchByPhone("9184440"));
        System.out.println("Номер содержит 9184440202:");
        arrayToString(employees.searchByPhone("9184440202"));

    }
}
