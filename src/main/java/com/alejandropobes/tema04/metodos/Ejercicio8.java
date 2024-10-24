package com.alejandropobes.tema04.metodos;

import java.util.Scanner;

public class Ejercicio8 {

    // Función que verifica si un número es capicúa
    public static void esCapicua(int numero1, int numero2, int numero3, int numero4) {
        if (numero1 == numero4 && numero2 == numero3) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número de 4 dígitos:");

        int numero = scanner.nextInt();

        // Validar que el número ingresado tenga 4 dígitos
        if (numero >= 1000 && numero <= 9999) {
            // Descomposición del número en sus dígitos
            int numero4 = numero % 10;
            int numero3 = (numero / 10) % 10;
            int numero2 = (numero / 100) % 10;
            int numero1 = (numero / 1000) % 10;

            // Llamada a la función que verifica si es capicúa
            esCapicua(numero1, numero2, numero3, numero4);
        } else {
            System.err.println("Error: Tienes ingresar un número de 4 dígitos.");
        }
        scanner.close();
    }
}

