package edu.uatf.tp2.lab1.course;

public class Professor {
    private String name;

    public Professor(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.name = name;
    }
}
