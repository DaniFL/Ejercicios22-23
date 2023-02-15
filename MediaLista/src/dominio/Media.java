package dominio;

public class Media {
    // Igual que con el ejercicio de la suma de elementos de una lista, definimos una varible a 0 en la que almacenaremos
    // el resultado de la suma de todos los elementos de la lista
    public double mediaLista(int[] lista) {
        double media = 0;
        // Recorremos la lista y vamos sumando cada elemento a la variable media
        for (int i = 0; i < lista.length; i++) {
            media += lista[i];
        }
        // Devolvemos la media de la lista, que es la suma de todos los elementos de la lista entre el número de elementos
        return media / lista.length;
    }
}
