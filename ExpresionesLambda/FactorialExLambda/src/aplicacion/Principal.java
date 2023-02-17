package aplicacion;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        sc.close();

        int factorial = IntStream.rangeClosed(1, n)
                .reduce(1, (subtotal, elemento) -> subtotal * elemento);
        System.out.println("El factorial de " + n + " es: " + factorial);
    }
}

