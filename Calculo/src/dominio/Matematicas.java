package dominio;

public class Matematicas {
    public int fibonacci(float n) {
        //caso base
        if (n == 0) {
            return 0;
        } else {
            if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }

    public float cocienteFibonacci(int i, int i1) {
        return Float.valueOf(fibonacci(i) / fibonacci(i1));
    }
}
