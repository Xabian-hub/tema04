package com.alejandropobes.tema04.metodos;
import java.util.Scanner;

public class Ejercicio10 {

    // Metodo que imprime la tabla de multiplicar de un número
    public static void imprimirTablaDeMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            // Formato de impresión: "numero * i = resultado"
            System.out.printf("%d * %d = %d%n", numero, i, numero * i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        while (numero >= 0) {
            System.out.println("Introduzca un número (negativo) para salir:");
            numero = scanner.nextInt();

            // Si el número es negativo, el bucle termina
            if (numero >= 0) {
                imprimirTablaDeMultiplicar(numero);
            }
        }
        scanner.close();
        System.out.println("S'acabao.");
    }
}
