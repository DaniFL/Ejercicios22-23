package aplicacion;

import dominio.Factorial;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        System.out.println("El factorial de " + n + " es: " + f.calcularFactorial(n));
        sc.close();

    }
}