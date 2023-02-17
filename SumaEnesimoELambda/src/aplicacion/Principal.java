package aplicacion;

import java.util.Scanner;

import dominio.SumaELambda;

public class Principal {
    public static void main(String[] args) {
        SumaELambda suma = new SumaELambda();
        System.out.println("Suma enesima mediante expresiones lambda");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de n: ");
        int n = entrada.nextInt();
        System.out.println( suma.sumaEnesima(n));
        entrada.close();

    }
}
