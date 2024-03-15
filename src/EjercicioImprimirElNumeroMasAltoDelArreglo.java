/*
* Escriba un programa que imprima el número más alto de un arreglo
* de 7 elementos (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43},
*  si se repite un valor considerar uno solo.
* */
import java.util.Scanner;

public class EjercicioImprimirElNumeroMasAltoDelArreglo {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int[] numeros = new int[7];
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese el " + i + " número: ");
                numeros[i] = s.nextInt();
            }
            etiqueta:
            for(int i = 0; i < numeros.length; i++){
                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[i]>=numeros[j]) {
                        if (j == 6){
                            System.out.println("El número mayor es ("+numeros[i]+") y se encuentra en la posición ("+i+")");
                            break etiqueta;
                        }
                    } else {
                        continue etiqueta;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Ingrese números enteros");
        }
    }
}
