package aplicacion;

import dominio.Desviacion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Desviacion desviacion = new Desviacion();
        System.out.println("Ingrese la cantidad de numeros a ingresar: ");
        int n = entrada.nextInt();
        double[] lista = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            lista[i] = entrada.nextDouble();
        }
        System.out.println("La desviacion tipica es: " + desviacion.desviacionTipica(lista, n));
        System.out.println("La media es: " + desviacion.media(lista, n));
    }
}
