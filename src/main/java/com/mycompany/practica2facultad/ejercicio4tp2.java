/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2facultad;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class ejercicio4tp2 { static void ejercicio4tp2(Scanner sc) {
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char cat = sc.next().toUpperCase().charAt(0);
        
        double descuento = 0;
        switch (cat) {
            case 'A': descuento = 0.10; break;
            case 'B': descuento = 0.15; break;
            case 'C': descuento = 0.20; break;
            default: System.out.println("Categoría inválida"); return;
        }
        
        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
    
}
