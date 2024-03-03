// Gli Array - 1
// Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10
// e che che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.

public class Esercizio24 {
    public static void main(String[] args) {
        int[] daUnoADieci = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int totale = 0;
        for (int elemento : daUnoADieci) {
            totale += elemento;
        }
        System.out.println(totale);
    }
}