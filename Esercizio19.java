// Il ciclo While
// Scrivere un programma che contenga un metodo che sfrutti il while loop
// e prenda in ingresso un valore intero come limite superiore e calcoli la somma di tutti i valori prima del limite e la stampi a video.
// (Esempio: passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)

public class Esercizio19 {
    public static void main(String[] args) {
        System.out.println(sommatoria(10));
    }

    public static int sommatoria (int limiteSuperiore) {
        int contatore = 1;
        int totale = 0;
        while (contatore < limiteSuperiore) {
            totale += contatore;
            contatore++;
        }

        return totale;
    }
}
