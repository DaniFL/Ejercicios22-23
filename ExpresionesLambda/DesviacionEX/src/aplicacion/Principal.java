package aplicacion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el número de elementos de la lista: ");
        int n = sc.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento " + (i + 1) + " de la lista: ");
            lista[i] = sc.nextInt();
        }
        sc.close();
        double media = 0;
        for (int i = 0; i < n; i++) {
            media += lista[i];
        }
        media /= n;
        double desviacion = 0;
        for (int i = 0; i < n; i++) {
            desviacion += Math.pow(lista[i] - media, 2);
        }
        desviacion = Math.sqrt(desviacion / n);
        System.out.println("La desviación típica de la lista es: " + desviacion);
    }
}
