package dominio;public class Desviacion {
    // calculo desviacion tipica de una lista de numeros de manera recursiva
    public double desviacionTipica(double[] lista, int n) {
        double media = media(lista, n);
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += Math.pow(lista[i] - media, 2);
        }
        return Math.sqrt(suma / n);
    }
    // calculo de la media de una lista de numeros de manera recursiva
    public double media(double[] lista, int n) {
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += lista[i];
        }
        return suma / n;
    }
}
