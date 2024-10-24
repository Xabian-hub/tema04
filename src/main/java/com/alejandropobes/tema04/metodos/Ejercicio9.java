package com.alejandropobes.tema04.metodos;

import java.util.Scanner;

public class Ejercicio9 {

    public static int sumatorio(int numero) {
        int resultado = 0;
        // Usamos un bucle para sumar los números desde 'numero' hasta 1
        for (int i = numero; i >= 1; i--) {
            resultado += i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un número:");

        int numero = leer.nextInt();

        if (numero > 0) {
            int resultado = sumatorio(numero);
            System.out.println("El sumatorio de " + numero + " es: " + resultado);
        } else {
            System.err.println("Error: El número tiene ser mayor que 0.");
        }
        leer.close();
    }
}
