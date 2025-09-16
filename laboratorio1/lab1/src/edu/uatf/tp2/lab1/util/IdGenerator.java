package edu.uatf.tp2.lab1.util;


public class IdGenerator {
    private static int current = 1000;

    @SuppressWarnings("unused")
    private static int next(){
        return ++current;
    }

    private IdGenerator(){}
    
}
