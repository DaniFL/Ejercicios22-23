package dominio;
public class Desviacion {
    public double desviacionTipica(int[] lista, int n, double media) {
        //Caso base: si el numero de elementos de la lista es 0, la desviacion tipica es 0
        if (n == 0) {
            return 0;
        } else {
            return Math.sqrt((Math.pow((lista[n - 1] - media), 2) + desviacionTipica(lista, n - 1, media)) / n);
        }
    }
    public double mediaLista(int[] lista) {
        double media = 0;
        // Recorremos la lista y vamos sumando cada elemento a la variable media
        for (int i = 0; i < lista.length; i++) {
            media += lista[i];
        }
        // Devolvemos la media de la lista, que es la suma de todos los elementos de la lista entre el numero de elementos
        return media / lista.length;
    }
}
