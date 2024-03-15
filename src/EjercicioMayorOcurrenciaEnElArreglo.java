import java.util.Scanner;

public class EjercicioMayorOcurrenciaEnElArreglo {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int[] numeros = new int[10];
            int contador1 = 0;
            int contador2 = 0;
            int numeroRepetido = 0;
            System.out.println("Ingrese 10 números");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese el (" + i + ") número: ");
                numeros[i] = s.nextInt();
            }
            etiqueta:
            for (int i = 0; i < numeros.length; i++) {
                for (int j = i; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j]) {
                        contador1++;
                        if (contador1 == (numeros.length)){
                            contador2 = contador1;
                            numeroRepetido = numeros[i];
                            break etiqueta;
                        }
                    }
                }
                if (contador1 > contador2) {
                    contador2 = contador1;
                    numeroRepetido = numeros[i];
                }
                contador1 = 0;
            }
            System.out.println("El numero " +numeroRepetido+" se repite " +contador2);
        } catch (Exception e) {
            System.out.println("Ingrese números enteros");
        }
    }
}
