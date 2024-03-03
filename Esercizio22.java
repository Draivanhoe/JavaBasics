// I cicli avanzati - break, continue, nested loops - 1 (correzione tutor)
// Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri fino al valore immesso
// la stampa dovrà interrompersi se il valore è uguale a 5

public class Esercizio22 {
    public static void main(String[] args) {
        stampaDaZeroANumero(6);
    }

    public static void stampaDaZeroANumero (int numero) {
        if (numero != 5) {
            for (int i = 0; i <= numero; i++) {
                System.out.println(i);
            }
        }
    }
}