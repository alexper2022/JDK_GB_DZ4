package org.example;

public class Employee {
    private int employeeNumber; //  Табельный номер
    private String phone; // Номер телефона
    private String name; // Имя
    private int workExperienceMonth; // Стаж

    public Employee(int employeeNumber, String phone, String name, int workExperienceMonth) {
        this.employeeNumber = employeeNumber;
        this.phone = phone;
        this.name = name;
        this.workExperienceMonth = workExperienceMonth;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkExperienceMonth() {
        return workExperienceMonth;
    }

    public void setWorkExperienceMonth(int workExperienceMonth) {
        this.workExperienceMonth = workExperienceMonth;
    }

    @Override
    public String toString() {
        return "employeeNumber=" + employeeNumber +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", workExperienceMonth=" + workExperienceMonth + "\n";
    }
}
