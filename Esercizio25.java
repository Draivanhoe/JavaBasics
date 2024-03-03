// Gli Array - 2
// Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
// Questo metodo dovrà poi stampare tutte le occorrenze del carattere a (oppure 0 in caso non ce ne siano).

public class Esercizio25 {
    public static void main(String[] args) {

    }

    public static void creaArrayDiCaratteri () {
        char[] vocali = {'a', 'e', 'i', 'o', 'u'};
        for (char vocale : vocali) {
            if (vocale == 'a') {
                System.out.println(vocale);
            }
        }
    }
}