package dominio;

public class Producto {
    public int productoEscalar(int[] lista1, int[] lista2, int n) {
        if (n == 0) {
            return 0;
        } else {
            return lista1[n - 1] * lista2[n - 1] + productoEscalar(lista1, lista2, n - 1);
        }
    }
}
