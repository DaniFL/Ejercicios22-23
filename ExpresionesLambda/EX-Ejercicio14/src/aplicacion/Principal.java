package aplicacion;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> pares = lista.stream()
                .filter(n -> n % 2 == 0) // expresión lambda que filtra los números pares
                .collect(Collectors.toList()); // convierte el stream en una lista
        System.out.println(pares);

    }
}
