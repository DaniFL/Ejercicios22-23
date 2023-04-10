package aplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de elementos de la lista: ");
        int n = scanner.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento " + (i + 1) + " de la lista: ");
            lista[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("El menor elemento de la lista es: " + menor(lista));
    }

    //extraer el menor elemento de una lista mediante expresiones lambda
    public static int menor(int[] lista) {
        return Arrays.stream(lista)
                .reduce(Integer.MAX_VALUE, (menor, elemento) -> elemento < menor ? elemento : menor);
    }

}
