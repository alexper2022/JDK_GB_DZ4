package org.example;

import java.util.ArrayList;
import java.util.List;

/*
 Добавить метод, который ищет сотрудника по стажу (может быть список)
 Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 Добавить метод, который ищет сотрудника по табельному номеру
 Добавить метод добавление нового сотрудника в справочник
 */

public class Employees {
    List<Employee> employees;

    public Employees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    // Добавить метод добавление нового сотрудника в справочник
    public void add(Employee employee) {
        employees.add(employee);
    }

    // Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
    public List<Employee> searchByName(String name) {
        List<Employee> outListEmployees = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getName() == name) {
                outListEmployees.add(e);
            }
        }
        return outListEmployees;
    }

    public List<Employee> searchByPhone(String phone) {
        List<Employee> outListEmployees = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getPhone().contains(phone)) {
                outListEmployees.add(e);
            }
        }
        return outListEmployees;
    }
    // Добавить метод, который ищет сотрудника по стажу (может быть список)
    public List<Employee> searchByExperience(int experience) {
        List<Employee> outListEmployees = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getWorkExperienceMonth() == experience) {
                outListEmployees.add(e);
            }
        }
        return outListEmployees;
    }

    // Добавить метод, который ищет сотрудника по табельному номеру
    public List<Employee> searchByEmployeeNumber(int number) {
        List<Employee> outListEmployees = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getEmployeeNumber() == number) {
                outListEmployees.add(e);
            }
        }
        return outListEmployees;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        employees.forEach((s) -> sb.append(s.toString()));
        return sb.toString();
    }
}
