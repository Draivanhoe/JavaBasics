// Gli Array multidimensionali - 1 (correzione tutor)
// Scrivere un programma che contenga un metodo che permette di inizializzare una matrice riempita con dei valori a vostro piacimento
// e restituisca la somma degli elementi sulla prima riga

public class Esercizio27 {
    public static void main(String[] args) {
        System.out.println(totalePrimaRiga());
    }

    public static int totalePrimaRiga () {
        int[][] matriceDiInteri = {{0, 1, 2, 3}, {4, 5, 6, 7}, {9, 10, 11, 12}};
        int totale = 0;
        for (int numero : matriceDiInteri[0]) {
            totale += numero;
        }

        return totale;
    }
}