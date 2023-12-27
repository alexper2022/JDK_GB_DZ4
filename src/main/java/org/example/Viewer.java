package org.example;

import java.util.List;

public class Viewer {

    public static void arrayToString(List<Employee> employees) {
        employees.forEach((s) -> System.out.print(s));
    }
}
