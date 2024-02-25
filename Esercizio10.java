// Gli operatori di assegnazione (correzione tutor)
// Scrivi un programma che contiene un metodo che, date due variabili, le incrementi di un valore scelto da te e le moltiplichi fra di loro.
// Il metodo dovrà restituire il risultato dell'operazione, che dovrà essere stampato a video.

public class Esercizio10 {
    public static void main(String[] args) {
        System.out.println(cresceteEMoltiplicatevi(2, 7, 3));
    }

    public static int cresceteEMoltiplicatevi (int intero1, int intero2, int valoreCrescita) {
        intero1 += valoreCrescita;
        intero2 += valoreCrescita;
        return intero1 * intero2;
    }
}