package edu.uatf.tp2.lab1.model;

public class Professor {
    private final int id;
    private String name;
    private String departament;

    private static int count = 0;

    public Professor(String name, String departament){
        this.id=++count;
        this.name=name;
        this.departament=departament;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name==null||name.isBlank()){
        throw new IllegalArgumentException("Name no puede ser vacio");
        }
        this.name=name;
    }
    public String getDepartament(){
        return departament;
    }
    public void setDepartament(String departament){
        this.departament=departament;
    }
    public static int getTotalProfessor(){
        return count;
    }
    @Override
    public String toString(){
        return "Professor{id="+id+",name="+name+",departament="+departament+"}";
    }
}
