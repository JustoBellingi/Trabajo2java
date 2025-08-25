package com.mycompany.practica2facultad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class ejercicio5tp2 {static void ejercicio5tp2(Scanner sc) {
        int suma = 0, num;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = sc.nextInt();
            if (num % 2 == 0) suma += num;
        } while (num != 0);
        
        System.out.println("La suma de los números pares es: " + suma);
    }
    
}
