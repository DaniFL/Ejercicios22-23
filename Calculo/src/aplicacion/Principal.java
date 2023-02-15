package aplicacion;

import dominio.Matematicas;
public class Principal {
    public static void main(String[] args) {
        Matematicas matematicas = new Matematicas();
        System.out.println(matematicas.cocienteFibonacci(13, 12));
    }
}