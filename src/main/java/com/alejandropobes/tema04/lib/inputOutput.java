package com.alejandropobes.tema04.lib;

import java.util.Random;
import java.util.Scanner;

public class inputOutput {
    /**
     * Solicita un texto y valida su longitud  este comprendida entre longitudMinima y longitudMaxima.
     * @param mensaje Mensaje que se le muestra al usuario.
     * @param lonitudMinima Numero minimo de caracteres del texto.
     * @param longitudMaxima numero maximo de caracteres del texto.
     * @return El texto leido ya validado.
     */

    public static String solicitarString(String mensaje, int lonitudMinima, int longitudMaxima){
        Scanner scanner = new Scanner(System.in);
        String resultado;
        boolean valido;
        do {
            System.out.println(mensaje);
            resultado = scanner.nextLine();
            valido = resultado.length() >= lonitudMinima && resultado.length() <= longitudMaxima;
            if (!valido){
                System.err.printf("La longitud que has introducido es incorrecta, por favor asegurese de introducir correctamente los datos [%d-%d\n]",lonitudMinima,longitudMaxima);
            }
        }while (!valido);
        scanner.close();
            return resultado;
    }
    public static int generarCalificacionAleatoria() {
        Random aleatorio = new Random();
        return aleatorio.nextInt(11); // Genera una nota entre 0 y 10
    }
}
