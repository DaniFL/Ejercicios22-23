package aplicacion;
import dominio.Potencia;
import java.util.Scanner;
public class Principal {
    public static void main (String[] args){
        //Creamos un objeto de la clase Potencia.
        Potencia p = new Potencia();
        //Creamos un objeto de la clase Scanner para leer datos por teclado.
        Scanner sc = new Scanner(System.in);
        //Pedimos al usuario que introduzca la base y el exponente.
        System.out.println("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exponente = sc.nextInt();
        sc.close();
        //llamamos al método potenciaEnesima y le pasamos la base y el exponente como parámetros.
        System.out.println("La potencia enesima es: " + p.potenciaEnesima(base, exponente));
    }
}
