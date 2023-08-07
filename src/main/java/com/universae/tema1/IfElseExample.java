package com.universae.tema1;

public class IfElseExample {
    
    public static void main(String[] args) {
        int edad = 20; 

        if (edad < 18) { 
            System.out.println("Eres menor de edad."); 
        } else if (edad >= 18 && edad < 65) { 
            System.out.println("Eres adulto."); 
        } else { 
            System.out.println("Eres un adulto mayor."); 
        } 
    }

}
