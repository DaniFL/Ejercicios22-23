package aplicacion;

import dominio.Lista;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        //creamos un objeto de la clase Lista
        Lista l = new Lista();
        //imprimimos la lista de numeros pares
        System.out.println("La lista de numeros pares es: " + Arrays.toString(l.listaPar(9)));
    }
}
