//calculo media elementos de una lista de manera recursiva
package dominio;

public class Media {
    // Igual que con el ejercicio de la suma de elementos de una lista, definimos una varible a 0 en la que almacenaremos
    // el resultado de la suma de todos los elementos de la lista
    public double mediaLista(int[] lista) {
        return mediaLista(lista, lista.length);
    }
    // Definimos un método recursivo que recibe como parámetros la lista y el número de elementos de la lista
    public double mediaLista(int[] lista, int n) {
        // Si el número de elementos de la lista es 0, devolvemos 0
        if (n == 0) {
            return 0;
        }
        // Si el número de elementos de la lista es 1, devolvemos el primer elemento de la lista
        if (n == 1) {
            return lista[0];
        }
        // Si el número de elementos de la lista es mayor que 1, devolvemos la suma de todos los elementos de la lista
        // entre el número de elementos de la lista
        return (lista[n - 1] + mediaLista(lista, n - 1)) / n;
    }
}