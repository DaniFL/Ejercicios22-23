package aplicacion;
import dominio.Suma;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        //Creamos un objeto de la clase Suma.
        Suma s = new Suma();
        //Creamos un objeto de la clase Scanner para leer datos por teclado.
        Scanner sc = new Scanner(System.in);
        //Pedimos al usuario que introduzca el numero de elementos de la lista.
        System.out.println("Ingrese el numero de elementos de la lista: ");
        int n = sc.nextInt();
        //Creamos un array de enteros de tamaño n.
        int[] lista = new int[n];
        //Recorremos el array y vamos pidiendo al usuario que introduzca los elementos de la lista.
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento " + (i + 1) + " de la lista: ");
            lista[i] = sc.nextInt();
        }
        sc.close();
        //llamamos al método sumarLista y le pasamos la lista como parámetro.
        System.out.println("La suma de la lista es: " + s.sumarLista(lista));
    }
}