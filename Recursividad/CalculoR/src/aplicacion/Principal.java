package aplicacion;

import dominio.Matematicas;
public class Principal {
    public static void main(String[] args) {
        Matematicas matematicas = new Matematicas();
        System.out.println("Fibonacci de 13: " + matematicas.fibonacci(13));
        System.out.println("Fibonacci de 12: " + matematicas.fibonacci(12));
        float i = (matematicas.fibonacci(13)) / (matematicas.fibonacci(12));
        float j = (1 + (float) Math.sqrt(5)) / 2;
        System.out.println(i);
        System.out.println(j);
        System.out.println(i/j);
        System.out.println(i == j);
    }
}