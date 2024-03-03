// Il ciclo For - 2
// Scrivi un programma che contenga un metodo che prende in ingresso un numero e il massimo numero di risultati che vuoi avere
// e stampi tutti i numeri naturali in ordine inverso
// (quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).

public class Esercizio21 {
    public static void main(String[] args) {
        contoAllaRovescia(10, 5);
    }

    public static void contoAllaRovescia (int numeroDiPartenza, int risultatiRichiesti) {
        for (int i = 0; i < risultatiRichiesti; i++) {
            System.out.println(numeroDiPartenza - i);
        }
    }
}