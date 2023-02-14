package dominio;

public class Lista {
    //La lista de los primeros números pares hasta n asumiendo n ≥ 2. Por
    //ejemplo, listaP ar(9) = [8, 6, 4, 2].
    public int[] listaPar(int n) {
        int[] listaPares = new int[n];
        if (n == 0) {
            return listaPares;
        } else {
            if (n % 2 == 0) {
                listaPares[n - 1] = n;
            }
            return listaPar(n - 1);
        }
    }
}
