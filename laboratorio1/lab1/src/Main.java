import edu.uatf.tp2.lab1.model.Professor;
import edu.uatf.tp2.lab1.model.Student;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(0, "Irlanda", "Castro", "irlanda@example.com");
        Student s2 = new Student(0, "Ana", "García", "ana.garcia@example.com");

        Professor p1 = new Professor("Emiliano Verón", "Sistemas");
        Professor p2 = new Professor("María López", "Matemática");

        System.out.println("Estudiante 1: " + s1);
        System.out.println("Estudiante 2: " + s2);
        System.out.println("Profesor 1: " + p1);
        System.out.println("Profesor 2: " + p2);

        System.out.println("Total de estudiantes: " + Student.getTotalStudent());
        System.out.println("Total de profesores: " + Professor.getTotalProfessor());

        s2.setFirstName("Ana Sofía");
        System.out.println("Estudiante 2 (actualizado): " + s2);

    }
}