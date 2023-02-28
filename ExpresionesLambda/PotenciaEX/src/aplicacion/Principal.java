package aplicacion;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        System.out.println("Ingrese la potencia: ");
        int p = sc.nextInt();
        sc.close();
        System.out.println("El resultado de " + n + " elevado a " + p + " es: " + potencia(n, p));
    }

    public static int potencia(int n, int p) {
        return IntStream.rangeClosed(1, p)
                .reduce(1, (subtotal, elemento) -> subtotal * n);
    }

}
