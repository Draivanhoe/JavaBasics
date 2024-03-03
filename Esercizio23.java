// I cicli avanzati - break, continue, nested loops - 2
// Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri fino al valore immesso, la stampa dovrà saltare il valore uguale a 5.

public class Esercizio23 {
    public static void main(String[] args) {
        stampaDaZeroANumero(10);
    }

    public static void stampaDaZeroANumero (int numero) {
        for (int i = 0; i <= numero && i < 5; i++) {
            System.out.println(i);
        }

        if (numero > 5) {
            for (int i = 6; i <= numero; i++) {
                System.out.println(i);
            }
        }
    }
}