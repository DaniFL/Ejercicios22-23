package aplicacion;
import java.util.Scanner;
import dominio.Media;
public class Principal {
    public static void main(String[] args) {
        Media m = new Media();
        Scanner sc = new Scanner(System.in);
        // Pedimos al usuario que introduzca el numero de elementos de la lista
        System.out.println("Ingrese el numero de elementos de la lista: ");
        int n = sc.nextInt();
        // Creamos un array de enteros de tamaño n
        int[] lista = new int[n];
        // Recorremos el array y vamos pidiendo al usuario que introduzca los elementos de la lista
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento " + (i + 1) + " de la lista: ");
            lista[i] = sc.nextInt();
        }
        // Mostramos la media de la lista
        System.out.println("La media de la lista es: " + m.mediaLista(lista));
        sc.close();
    }
}
