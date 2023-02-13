package dominio;

public class Factorial {

    public double calcularFactorial(double n) {
        // caso base (factorial de 0 es 1)
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}
