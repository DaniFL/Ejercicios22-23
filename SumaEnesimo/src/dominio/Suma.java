package dominio;

public class Suma {
    public int sumaEnesimo(int n) {
        // caso base (si n es 1, la suma es 1)
        if (n == 1) {
            return 1;
        } else {
            return n + sumaEnesimo(n - 1);
        }
    }
}
