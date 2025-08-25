/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
package com.mycompany.practica2;

import java.util.Scanner;

public class ejercicio1tp2 {

    public static void Ej1TP2(Scanner sc) {
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ej1TP2(sc);
        sc.close();
    }
}

