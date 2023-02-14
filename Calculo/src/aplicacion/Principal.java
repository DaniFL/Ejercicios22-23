package aplicacion;

import dominio.Matematicas;
public class Principal {
    public static void main(String[] args) {
        //Creamos un objeto de la clase Matematicas
        Matematicas m = new Matematicas();
        //Imprimimos valores
        System.out.println("Fibonacci de 13: " + m.fibonacci(13) + "\n" + "Fibonacci de 12: " + m.fibonacci(12));

        //Imprimimos el cálculo del cociente entre el decimosegundo y decimotercer termino de la serie de Fibonacci.
        System.out.println("El cociente entre el decimo tercer y decimo segundo término de la serie de Fibonacci es: " + m.cocienteFibonacci(13, 12));

    }
}