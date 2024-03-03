// Gli operatori logici - 1
// Scrivi un programma che contiene un metodo che, dati 2 interi in ingresso ed un valore di confronto,
// verifichi se il numero di confronto è compreso tra due valori specifici
// e stampi il risultato dell'operazione (comprensivo dei limiti inferiore e superiore).

public class Esercizio13 {
    public static void main(String[] args) {
        System.out.println(compreso(0, 12, 9));
    }

    public static boolean compreso (int limiteInferiore, int limiteSuperiore, int valoreConfronto) {
        return valoreConfronto >= limiteInferiore && valoreConfronto <= limiteSuperiore;
    }
}
