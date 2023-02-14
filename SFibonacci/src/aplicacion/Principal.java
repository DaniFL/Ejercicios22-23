package aplicacion;

import dominio.Fibonacci;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        //Creamos un objeto de la clase Fibonacci
        Fibonacci f = new Fibonacci();
        //Imprimimos los primeros 10 numeros de la serie de Fibonacci
        //for (int i = 0; i < 10; i++) {
        //   System.out.println(f.fibonacci(i));
        //}
        //Creamos un objeto de tipo Scanner para leer datos por teclado.
        Scanner sc = new Scanner(System.in);
        //Pedimos al usuario que introduzca el numero de elementos de la serie de Fibonacci.
        System.out.println("Ingrese el numero de elementos que desea obtener de la serie de Fibonacci: ");
        int n = sc.nextInt();
        sc.close();
        //Imprimimos la serie de Fibonacci.
        System.out.println("Los elementos de la serie de fibonacci son: ");
        for (int i = 0; i < n; i++) {
            System.out.println(f.fibonacci(i));
        }
    }
}
