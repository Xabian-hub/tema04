package com.alejandropobes.tema04.metodos;
import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio7 {
    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no puede operar para numeros negativos.");
        }

        BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero para calcular su factorial: ");
        int numero = scanner.nextInt();

        try {
            System.out.println("El factorial de " + numero + " es " + factorial(numero));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
