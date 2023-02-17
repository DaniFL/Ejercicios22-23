package aplicacion;

import dominio.Lista;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero mayor o igual a 2: ");
        int n = sc.nextInt();
        System.out.println("La lista de los primeros números pares hasta " + n + " es: " + Arrays.toString(Lista.listaPar(n)));
    }
}
