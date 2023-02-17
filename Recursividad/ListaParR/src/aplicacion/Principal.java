package aplicacion;

import dominio.OListaP;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una lista de números enteros mayores o iguales a 2 separados por espacios: ");
        String[] listaStr = sc.nextLine().split(" ");
        int[] lista = new int[listaStr.length];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = Integer.parseInt(listaStr[i]);
        }
        System.out.println("La lista de los números pares de la lista ingresada es: " + Arrays.toString(OListaP.listaPar(lista)));
    }
}
