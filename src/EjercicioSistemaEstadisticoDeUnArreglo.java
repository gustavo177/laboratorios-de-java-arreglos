/*
* Escriba un programa que imprima el número más alto de un arreglo
* de 7 elementos (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43},
*  si se repite un valor considerar uno solo.
* */
import java.util.Scanner;

public class EjercicioSistemaEstadisticoDeUnArreglo {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            double[] numeros = new double[7];
            double contadorDeCeros = 0;
            double contadorDePositivos = 0;
            double contadorDeNegativos = 0;
            double sumaPositivo = 0;
            double sumaNegativo = 0;
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese el " + i + " número: ");
                numeros[i] = s.nextInt();
                if (numeros[i] == 0){
                    contadorDeCeros++;
                } else if (numeros[i] > 0) {
                    sumaPositivo = sumaPositivo + numeros[i];
                    contadorDePositivos++;
                } else {
                    sumaNegativo = sumaNegativo - numeros[i];
                    contadorDeNegativos++;
                }
            }
            if(contadorDePositivos == 0) {
                System.out.println("El promedio de los números positivos no se puedo calcular porque su divisor es cero");
            }else{
                System.out.println("promedio de los números positivos = " + sumaPositivo/contadorDePositivos);
            }
            if(contadorDeNegativos == 0){
                System.out.println("El promedio de los números negativos no se puedo calcular porque su divisor es cero");
            }else {
                System.out.println("promedio de los números negativos = " + -(sumaNegativo/contadorDeNegativos));
            }
            System.out.println("contador de ceros = " + contadorDeCeros);
        } catch (Exception e) {
            System.out.println("Ingrese números enteros");
        }
    }
}
