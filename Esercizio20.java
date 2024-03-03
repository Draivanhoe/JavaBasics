// Il ciclo For - 1
// Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
// e restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.

public class Esercizio20 {
    public static void main(String[] args) {
        System.out.println(tabellina(8));
    }

    public static String tabellina (int numero) {
        String tabellinaDelNumero = "";
        for (int i = 1; i <= 10; i++) {
            tabellinaDelNumero += Integer.toString(numero) + " x " + Integer.toString(i) + " = " + Integer.toString(i * numero) + "\n";
        }

        return tabellinaDelNumero;
    }
}