package dominio;

public class Lista {
        public static int[] listaPar(int n) {
                // Caso base
                if (n == 2) {
                        return new int[] {2};
                } else {
                        int[] lista = listaPar(n - 2);
                        int[] nuevaLista = new int[lista.length + 1];
                        nuevaLista[0] = n;
                        for (int i = 1; i < nuevaLista.length; i++) {
                                nuevaLista[i] = lista[i - 1];
                        }
                        return nuevaLista;
                }
        }
}