package dominio;

public class Suma{
    public int sumarLista(int[] lista){
        //inicializamos una variable "suma" en 0.
        int suma = 0;
        //recorremos la lista con un bucle for a taves de su posición [i] y vamos sumando los valores de la lista a la variable suma.
        for(int i = 0; i < lista.length; i++){
            suma += lista[i];
        }
        return suma;
    }
}