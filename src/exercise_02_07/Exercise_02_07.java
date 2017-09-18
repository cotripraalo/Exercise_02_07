/*
 * (Encuentre el número de años) Escriba un programa que pida al usuario que ingrese el
 * minutos (por ejemplo, mil millones), y muestra el número de años y días para los minutos.
 * Para simplificar, suponga que un año tiene 365 días. He aquí un ejemplo:
 */
package exercise_02_07;

import java.util.Scanner;

public class Exercise_02_07 {

    public static void main(String[] args) {
        //Creando Scanner
        Scanner input = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de minutos
        System.out.print ("Ingrese el número en minutos: ");
        int minutos = input.nextInt ();

        // Calculando el número de años y días
        int años = minutos / 525600;
        int días = (minutos% 525600) / 1440;

        // Mostrar resultados
        System.out.println (minutos + " minutos es aproximadamente " + años
        + " años y " + días + " días");
    }
    
}
