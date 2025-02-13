import java.util.Arrays;
import java.util.Scanner;

public class Busquedas {
    // Búsqueda secuencial
    public static int busquedaSecuencial(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Retorna la posición
            }
        }
        return -1; // No encontrado
    }

    // Búsqueda binaria (el arreglo debe estar ordenado)
    public static int busquedaBinaria(int[] arr, int x) {
        int inicio = 0, fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (arr[medio] == x) {
                return medio; // Encontrado
            }
            if (arr[medio] < x) {
                inicio = medio + 1; // Buscar en la derecha
            } else {
                fin = medio - 1; // Buscar en la izquierda
            }
        }
        return -1; // No encontrado
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90}; // Arreglo ordenado

        System.out.print("Ingrese el número a buscar: ");
        int numero = sc.nextInt();

        // Búsqueda secuencial
        int resultadoSecuencial = busquedaSecuencial(numeros, numero);
        System.out.println(resultadoSecuencial != -1 ? 
            "Búsqueda secuencial: encontrado en la posición " + resultadoSecuencial :
            "Búsqueda secuencial: No encontrado");

        // Búsqueda binaria
        int resultadoBinario = busquedaBinaria(numeros, numero);
        System.out.println(resultadoBinario != -1 ? 
            "Búsqueda binaria: encontrado en la posición " + resultadoBinario :
            "Búsqueda binaria: No encontrado");

        sc.close();
    }
}
