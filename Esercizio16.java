// If /else/elseif statements - 2 (correzione tutor)
// Scrivi un programma che calcoli la lunghezza di una stringa, sulla base di questa lunghezza stampi "Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10".

public class Esercizio16 {
    public static void main(String[] args) {
        System.out.println(lunghezzaStringa("prova"));
    }

    public static String lunghezzaStringa (String unaStringa) {
        if (unaStringa.length() > 10) {
            return "Lunghezza maggiore di 10";
        } else if (unaStringa.length() < 10) {
            return "Lunghezza minore di 10";
        } else {
            return "Lunghezza pari a 10";
        }
    }
}