/*
 *Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
 * El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
 *
 * Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento
 * aparece en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6,
 * incluso si no están presente en el arreglo.
 * */

import java.util.Scanner;

public class EjercicioImprimirHistograma {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int[] numeros = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
            int contador = 0;
            etiqueta:
            for (int i = 1; i <= 6; i++) {
                for (int j = 0; j < numeros.length; j++) {
                    if (i == numeros[j]) {
                        contador++;
                    }
                }
                System.out.print(i + " ");
                for (int j = 0; j < contador; j++) {
                    System.out.print("*");
                }
                System.out.println();
                contador = 0;
            }
        } catch (Exception e) {
            System.out.println("Ingrese números enteros");
        }
    }
}
