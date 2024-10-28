package com.alejandropobes.tema04.metodos;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio12 {

    /**
     * Enum que representa las diferentes calificaciones.
     */
    public enum Calificacion {
        INSUFICIENTE,
        SUFICIENTE,
        BIEN,
        NOTABLE,
        EXCELENTE,
        ERROR
    }

    /**
     * Calcula la calificación correspondiente a una nota dada.
     *
     * @param nota la nota a evaluar, debe ser un entero entre 0 y 10.
     * @return la calificación correspondiente como un valor del enum {@code Calificacion}.
     */
    public static Calificacion calcularCalificacion(int nota) {
        if (nota < 5) {
            return Calificacion.INSUFICIENTE;
        } else if (nota <= 6) {
            return Calificacion.SUFICIENTE;
        } else if (nota <= 7) {
            return Calificacion.BIEN;
        } else if (nota <= 9) {
            return Calificacion.NOTABLE;
        } else if (nota == 10) {
            return Calificacion.EXCELENTE;
        } else {
            return Calificacion.ERROR;
        }
    }

    /**
     * Genera una calificación aleatoria entre 0 y 10.
     *
     * @return un entero representando una calificación aleatoria.
     */
    public static int generarCalificacionAleatoria() {
        Random aleatorio = new Random();
        return aleatorio.nextInt(11); // Genera una nota entre 0 y 10
    }

    /**
     * Metodo principal que solicita al usuario si desea calcular
     * 50 calificaciones aleatorias y las muestra en la consola.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Opción para calcular calificaciones aleatorias
        System.out.println("¿Deseas calcular 50 calificaciones aleatorias? (s/n)");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            // Calcular y mostrar 50 calificaciones al azar
            for (int i = 0; i < 50; i++) {
                int nota = generarCalificacionAleatoria();
                Calificacion resultado = calcularCalificacion(nota);
                System.out.printf("Nota: %d - Calificación: %s%n", nota, resultado);
            }
        } else {
            System.out.println();
        }
        scanner.close();
    }
}
