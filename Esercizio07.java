// Gli operatori aritmetici - 1
// Definisci un metodo per la divisione di 2 numeri interi che restituisca il resto che dovrà essere stampato.

public class Esercizio07 {
    public static void main(String[] args) {
        System.out.println(divisioneFraInteri(8, 3));
    }

    public static int divisioneFraInteri (int dividendo, int divisore) {
        return dividendo % divisore;
    }
}