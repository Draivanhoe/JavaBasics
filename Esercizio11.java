// Gli operatori di comparazione - 1 (correzione tutor)
// Scrivi un programma che contiene un metodo che che confronti due numeri interi e determini se sono diversi.
// Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza.

public class Esercizio11 {
    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 3;
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(sonoInteriDiversi(numero1, numero2));
    }

    public static boolean sonoInteriDiversi (int unNumeroIntero1, int unNumeroIntero2) {
        return unNumeroIntero1 != unNumeroIntero2;
    }
}