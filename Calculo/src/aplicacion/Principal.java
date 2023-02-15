package aplicacion;

import dominio.Matematicas;
public class Principal {
    public static void main(String[] args) {
        Matematicas matematicas = new Matematicas();
        float i = matematicas.fibonacci(13) / matematicas.fibonacci(12);
        System.out.println(i);
        System.out.println((1 + Math.sqrt(5)) / 2);
    }
}