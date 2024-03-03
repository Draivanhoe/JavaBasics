// Gli operatori di comparazione - 2
// Scrivi un programma che contiene un metodo che che confronti due caratteri e determini se sono diversi.
// Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza.

public class Esercizio12 {
    public static void main(String[] args) {
        char carattere1 = 's';
        char carattere2 = 'S';
        System.out.println(carattere1);
        System.out.println(carattere2);
        System.out.println(sonoCaratteriDiversi(carattere1, carattere2));
    }

    public static boolean sonoCaratteriDiversi (char carattere1, char carattere2) {
        return Character.valueOf(carattere1) == Character.valueOf(carattere2);
    }
}
