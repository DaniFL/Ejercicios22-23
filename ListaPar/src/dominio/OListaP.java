package dominio;

public class OListaP {
    //a partir de una lista obtener otra lista con los elementos pares de manera recursiva
    public int[] obtenerPares(int[] lista, int n) {
        //Caso base: si el numero de elementos de la lista es 0, la lista de pares es vacia
        if (n == 0) {
            return new int[0];
        } else {
            //Si el elemento de la lista es par, lo añadimos a la lista de pares
            if (lista[n - 1] % 2 == 0) {
                int[] listaPares = new int[n];
                listaPares[n - 1] = lista[n - 1];
                return listaPares;
            } else {
                //Si el elemento de la lista es impar, no lo añadimos a la lista de pares
                return obtenerPares(lista, n - 1);
            }
        }
    }

    /*public String toString(int[] obtenerPares) {
        String s = "";
        for (int i = 0; i < obtenerPares.length; i++) {
            s += obtenerPares[i] + " ";
        }
        return s;
    }*/
}
