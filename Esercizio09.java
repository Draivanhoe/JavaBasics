// Gli operatori aritmetici - 3
// Definisci un metodo che calcoli la media tra 3 numeri e restituisca il risultato che dovrà essere stampato.

public class Esercizio09 {
    public static void main(String[] args) {
        System.out.println(mediaDiTreNumeri(3, 7, 11));
    }

    public static double mediaDiTreNumeri (double numero1, double numero2, double numero3) {
        return (numero1 + numero2 + numero3) / 3;
    }
}