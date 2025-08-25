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

public class ejercicio11tp2 {

    static double descuentoGlobal = 0.10;

    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoGlobal;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        return precio - descuentoAplicado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        double precioFinal = calcularDescuentoEspecial(precio);
        System.out.println("El precio final con descuento es: " + precioFinal);

        sc.close();
    }
}
