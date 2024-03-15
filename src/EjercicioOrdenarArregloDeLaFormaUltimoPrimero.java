/*
Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
Luego debemos mostrarlos en el siguiente orden: el último, el primero,
el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.

 */
import javax.swing.*;
import java.util.Scanner;
public class EjercicioOrdenarArregloDeLaFormaUltimoPrimero {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int[] numeros = new int[10];
            int[] nuevosNumeros = new int[10];
            int tamanioNumeros = numeros.length;
            int mitadTamanioNumeros = (numeros.length / 2) - 1;
            int incremento1 = 0;
            int incremento2 = 0;
            System.out.println("Ingrese 10 números enteros");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese el " + i + " número: ");
                numeros[i] = s.nextInt();
            }
            for (int i = mitadTamanioNumeros; i >= 0; i--) {
                nuevosNumeros[incremento1++] = numeros[--tamanioNumeros];
                nuevosNumeros[incremento1++] = numeros[incremento2];
                incremento2++;
            }
            tamanioNumeros = numeros.length;
            for (int i = 0; i < tamanioNumeros; i++) {
                System.out.println("** Arreglo original = (" + numeros[i] + ") ** Resultante = (" + nuevosNumeros[i] + ")");
            }
        } catch (Exception e) {
            System.err.println("Ingrese números enteros");
        }
    }
}
