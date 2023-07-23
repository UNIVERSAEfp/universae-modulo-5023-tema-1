package com.universae.tema1;

public class SwitchExample {
 
    public static void main(String[] args) {
        
        int diaSemana = 3; 
        String nombreDia; 
        
        switch (diaSemana) { 
            case 1: 
                nombreDia = "Lunes"; 
                break; 
            case 2: 
                nombreDia = "Martes"; 
                break; 
            case 3: 
                nombreDia = "Miércoles"; 
                break; 
            case 4: 
                nombreDia = "Jueves"; 
                break; 
            case 5: 
                nombreDia = "Viernes"; 
                break; 
            case 6: 
                nombreDia = "Sabado"; 
                break; 
            case 7: 
                nombreDia = "Domingo"; 
                break; 
            default: 
                nombreDia = "Día inválido"; 
        } 
        
        System.out.println("Hoy es: " + nombreDia); 
    }
}
