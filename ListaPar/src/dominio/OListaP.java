package dominio;

public class OListaP {
    //Dada una lista de números naturales mayores o iguales que 2, obtiene
    //otra lista con los números pares de la lista inicial, en el mismo orden y
    //respetando los números repetidos. Por ejemplo,
    //obtenerListaP ar([1, 2, 6, 11]) = [2, 6]. de manera recursiva
    public int[] obtenerPares(int[] lista, int n) {
        int[] listaPares = new int[n];
        if (n == 0) {
            return listaPares;
        } else {
            if (lista[n - 1] % 2 == 0) {
                listaPares[n - 1] = lista[n - 1];
            }
            return obtenerPares(lista, n - 1);
        }
    }
}
