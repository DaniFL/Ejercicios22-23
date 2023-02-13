package dominio;

public class SPares {
    //suma numeros pares de una lisra de manera recursiva
    public int sumaPares(int[] lista, int n) {
        //Caso base: si el numero de elementos de la lista es 0, la suma de los pares es 0
        if (n == 0) {
            return 0;
        } else {
            //Si el elemento de la lista es par, lo sumamos a la suma de los pares
            if (lista[n - 1] % 2 == 0) {
                return lista[n - 1] + sumaPares(lista, n - 1);
            } else {
                //Si el elemento de la lista es impar, no lo sumamos a la suma de los pares
                return sumaPares(lista, n - 1);
            }
        }
    }
}
