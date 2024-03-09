// I cicli avanzati - break, continue, nested loops - 1 (correzione tutor)
// Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri fino al valore immesso
// la stampa dovrà interrompersi se il valore è uguale a 5

public class Esercizio22 {
    public static void main(String[] args) {
        stampaDaZeroANumero(-1);
    }

    public static void stampaDaZeroANumero (int numero) {
        if (numero >= 0) {
            for (int i = 0; i <= 5 && i <= numero; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = numero; i <= 5; i++) {
                System.out.println(i);
            }
        }
    }
}

// Non viene specificato se il numero deve essere un intero, ma ho supposto di si.
// Non viene specificato se il numero debba essere necessariamente positivo,
// ma, dato che non è scritto neanche il punto di partenza da cui cominciare a stampare "tutti i numeri fino al valore immesso",
// ho scelto di fare in questo modo.