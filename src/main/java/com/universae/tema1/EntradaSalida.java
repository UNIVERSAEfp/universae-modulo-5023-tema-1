package com.universae.tema1;

import java.util.Scanner; 

public class EntradaSalida { 

    public static void main(String[] args) { 

        // Crear un objeto Scanner para leer datos de entrada 
        Scanner scanner = new Scanner(System.in); 

        // Leer un número entero 
        System.out.print("Ingrese un número entero: "); 
        int numero = scanner.nextInt(); 

        // Mostrar los resultados en la salida estándar 
        System.out.println("El número ingresado es: " + numero); 

        // Cerrar el objeto Scanner 
        scanner.close(); 
    } 
}
