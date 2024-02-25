// I tipi primitivi in Java - 1 (correzione tutor)
// Scrivere uno snippet di codice che, dato un triangolo identificato da base ed altezza, restituisca l'area.

public class Esercizio01 {
    public static double calcolaAreaTriangolo (double base, double altezza) {
        return (base * altezza) / 2;
    }

    public static void main(String[] args) {
        System.out.println(calcolaAreaTriangolo(11, 7));
    }
}