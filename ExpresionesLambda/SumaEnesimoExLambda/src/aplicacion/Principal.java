package aplicacion;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        sc.close();

        int suma = IntStream.rangeClosed(1, n)
                .reduce(0, (subtotal, elemento) -> subtotal + elemento);

        System.out.println("La suma enésima de los primeros " + n + " números es: " + suma);
    }
}
