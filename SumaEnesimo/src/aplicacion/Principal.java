package aplicacion;

import java.util.Scanner;

import dominio.Suma;

public class Principal {
    public static void main(String[] args) {
        Suma s = new Suma();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        System.out.println("La suma enesima de " + n + " es: " + s.sumaEnesimo(n));
        sc.close();
    }
}