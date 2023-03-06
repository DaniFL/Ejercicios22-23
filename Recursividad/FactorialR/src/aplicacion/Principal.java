package aplicacion;

import dominio.Factorial;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        while (true) {
        try {
                Factorial f = new Factorial();
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese un numero: ");
                int n = sc.nextInt();
                sc.close();
                System.out.println("El factorial de " + n + " es: " + f.calcularFactorial(n));
                break;
            }
            catch (Exception e) {
                System.out.println("ERROR:" + e.getMessage() + "\nPor favor, introduzca un numero entero positivo");
            }
        }
    }
}




