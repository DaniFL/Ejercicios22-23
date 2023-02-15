package dominio;

import java.util.Arrays;
public class OListaP {

    public static int[] listaPar(int[] lista) {
        // Caso base
        if (lista.length == 1) {
            if (lista[0] % 2 == 0) {
                return new int[] { lista[0] };
            } else {
                return new int[] {};
            }
        } else {
            int[] listaPar = listaPar(Arrays.copyOfRange(lista, 1, lista.length));
            if (lista[0] % 2 == 0) {
                int[] nuevaLista = new int[listaPar.length + 1];
                nuevaLista[0] = lista[0];
                for (int i = 1; i < nuevaLista.length; i++) {
                    nuevaLista[i] = listaPar[i - 1];
                }
                return nuevaLista;
            } else {
                return listaPar;
            }
        }
    }
}
