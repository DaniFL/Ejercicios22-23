package aplicacion;

import dominio.Producto;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Creamos un objeto de la clase Producto
        Producto p = new Producto();
        //Creamos dos arrays de enteros de tamaño 3.
        //int[] lista1 = {1, 2, 3};
        //int[] lista2 = {4, 5, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos de las listas (vectores): ");
        int n = sc.nextInt();
        int[] lista1 = new int[n];
        int[] lista2 = new int[n];
        //Recorremos el array1 y vamos pidiendo al usuario que introduzca los elementos de la lista1.
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento " + (i + 1) + " del primer array: ");
            lista1[i] = sc.nextInt();
        }
        //Recorremos el array2 y vamos pidiendo al usuario que introduzca los elementos de la lista2.
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento " + (i + 1) + " del segundo array: ");
            lista2[i] = sc.nextInt();
        }
        sc.close();
        //Imprimimos los dos arrays.
        System.out.println("El primer array es: " + java.util.Arrays.toString(lista1));
        System.out.println("El segundo array es: " + java.util.Arrays.toString(lista2));
        //Imprimimos el producto escalar de los dos arrays.
        System.out.println("El producto escalar de los dos vectores es: " + p.productoEscalar(lista1, lista2, n));

    }
}
