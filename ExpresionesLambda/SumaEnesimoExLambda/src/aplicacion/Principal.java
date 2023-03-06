package aplicacion;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("La suma enésima de " + n + " es: " + suma(n));
    }
    public static int suma(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(0, (subtotal, elemento) -> subtotal + elemento);
    }
}
