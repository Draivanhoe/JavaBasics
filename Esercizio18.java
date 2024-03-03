// Switch statement - 2 (correzione tutor)
// Scrivi un programma che contenga un metodo che prende in ingresso un carattere e ne identifica il tipo per un operazione algebrica
// (addizione, sottrazione, moltiplicazione, divisione).
// Nel caso non riesca ad identificare il tipo di operazione, dovrà restituire una stringa di errore.

public class Esercizio18 {
    public static void main(String[] args) {
        System.out.println(tipoOperazione('x'));
        System.out.println(tipoOperazione('*'));
    }

    public static String tipoOperazione (char operatore) {
        switch (operatore) {
            case '+':
                return "Operatore di addizione";

            case '-':
                return "Operatore di sottrazione";

            case '*':
                return "Operatore di moltiplicazione";

            case '/':
                return "Operatore di divisione";

            default:
                return "Questo carattere non corrisponde a nessun operatore algebrico elementare.";
        }
    }
}
