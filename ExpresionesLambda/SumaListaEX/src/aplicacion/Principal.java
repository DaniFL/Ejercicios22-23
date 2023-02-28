package aplicacion;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Principal {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el numero de elementos de la lista: ");
    int n = sc.nextInt();
    int[] lista = new int[n];

        for (int i = 0; i < n; i++) {
        System.out.println("Ingrese el elemento " + (i + 1) + " de la lista: ");
        lista[i] = sc.nextInt();
    }
        sc.close();
        System.out.println("La suma de la lista es: " + sumarLista(lista));
    }
    public static int sumarLista(int[] lista) {
        return IntStream.range(0, lista.length)
                .map(i -> lista[i])
                .reduce(0, (subtotal, elemento) -> subtotal + elemento);
    }
}