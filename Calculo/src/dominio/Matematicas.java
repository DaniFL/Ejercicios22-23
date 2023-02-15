package dominio;

public class Matematicas {
    // calcule el cociente entre el decimo tercer y el decimo segundo elemento de la sucesión de Fibonacci,y compare el resultado con 1+√5/2. de manera recursiva
    public int fibonacci(float n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

