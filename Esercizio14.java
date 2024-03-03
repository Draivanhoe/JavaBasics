// Gli operatori logici - 2 (correzione tutor)
// Scrivi un programma che contiene un metodo che prenda un numero in ingresso e capisca se un numero è pari o dispari utilizzando solo gli operatori logici.

public class Esercizio14 {
    public static void main(String[] args) {
        System.out.println(pariODispari(5));
    }

    public static boolean pariODispari (int numero) {
        return numero % 2 == 0;
    }
}