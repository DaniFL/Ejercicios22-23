package dominio;

public class Potencia {
public int potenciaEnesima(int base, int exponente){
    //Caso base: si el exponente es 0, la potencia es 1
        if(exponente == 0){
            return 1;
        }else{
            return base * potenciaEnesima(base, exponente - 1);
        }
    }
}
