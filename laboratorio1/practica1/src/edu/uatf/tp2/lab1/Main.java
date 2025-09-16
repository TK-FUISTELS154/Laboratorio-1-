package edu.uatf.tp2.lab1;

import edu.uatf.tp2.lab1.course.Course;
import edu.uatf.tp2.lab1.course.Professor;

public class Main {
    public static void main(String[] args) {

        Professor prof1 = new Professor("Dr. Juan Pérez");
        Professor prof2 = new Professor("Ing. María López");

        Course c1 = new Course("INF-101", "Programación I", 5, prof1);
        Course c2 = new Course("INF-102", "Estructuras de Datos", 6, prof2);
        Course c3 = new Course("INF-201", "Bases de Datos", 5, prof1);

        System.out.println(c1.summary());
        System.out.println(c2.summary());
        System.out.println(c3.summary());

        System.out.println("Total de cursos creados: " + Course.getTotalCourses());
    }
}
