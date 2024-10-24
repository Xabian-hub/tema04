package com.alejandropobes.tema04.metodos;
import java.util.Random;

public class Ejercicio11 {

    // Metodo para generar un número aleatorio entre un valor mínimo y máximo
    public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    // Metodo que genera y muestra el resultado de los 15 partidos de la quiniela
    public static void mostrarResultadosQuiniela(int min, int max) {
        for (int partido = 1; partido <= 15; partido++) {
            int resultado = generarNumeroAleatorio(min, max);  // Generar número aleatorio (1, 2, o 3)
            String respuesta = "";

            // Asignar "1", "X" o "2" según el número aleatorio generado
            if (resultado == 1) {
                respuesta = "1";
            } else if (resultado == 2) {
                respuesta = "X";
            } else if (resultado == 3) {
                respuesta = "2";
            }
            System.out.println("Partido " + partido + ": " + respuesta);
        }
    }

    public static void main(String[] args) {
        int min = 1;
        int max = 3;
        mostrarResultadosQuiniela(min, max);
    }
}
