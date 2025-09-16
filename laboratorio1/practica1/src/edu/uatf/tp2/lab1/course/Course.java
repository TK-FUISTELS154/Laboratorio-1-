package edu.uatf.tp2.lab1.course;

public class Course {
    private String code;
    private String title;
    private int credits;
    private Professor owner;

    private static int totalCourses = 0;

    public Course(String code, String title, int credits, Professor owner) {
    
        if (code == null || code.equals("")) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        if (title == null || title.equals("")) {
            throw new IllegalArgumentException("El título no puede estar vacío");
        }
        if (credits <= 0) {
            throw new IllegalArgumentException("Los créditos deben ser mayores a 0");
        }
        if (owner == null) {
            throw new IllegalArgumentException("Debe asignarse un profesor");
        }

        this.code = code;
        this.title = title;
        this.credits = credits;
        this.owner = owner;

        totalCourses++;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code != null && !code.equals("")) {
            this.code = code;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.equals("")) {
            this.title = title;
        }
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        if (credits > 0) {
            this.credits = credits;
        }
    }

    public Professor getOwner() {
        return owner;
    }

    public void setOwner(Professor owner) {
        if (owner != null) {
            this.owner = owner;
        }
    }

    public static int getTotalCourses() {
        return totalCourses;
    }

    public String summary() {
        return code + " - " + title + " (" + credits + " créditos), Profesor: " + owner.getName();
    }
}
