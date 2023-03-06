package aplicacion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el número de elementos de la lista: ");
        int n = sc.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento " + (i + 1) + " de la lista: ");
            lista[i] = sc.nextInt();
        }
        System.out.println();
    }

}
