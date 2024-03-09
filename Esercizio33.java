// Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().
// Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per il calcolo dell'area in maniera specifica.

public class Esercizio33 {
    public static void main(String[] args) {
        Forma unTriangolo = new Triangolo(12, 45);
        Forma unRettangolo = new Rettangolo(10, 5);

        unTriangolo.calcolaArea();
        unRettangolo.calcolaArea();
    }

    abstract static class Forma {
        public double altezza;
        public double larghezza;
        public double area;
        public int numeroLati;
        public boolean regolare;

        abstract void calcolaArea();

        public Forma (double altezza, double larghezza) {
            this.altezza = altezza;
            this.larghezza = larghezza;
            this.area = altezza * larghezza / 2;
        }
    }

    public static class Rettangolo extends Forma {
        public Rettangolo(double altezza, double larghezza) {
            super(altezza, larghezza);
            this.numeroLati = 4;
            this.regolare = true;
            this.area = altezza * larghezza;
        }

        public void calcolaArea() {
            System.out.println("L'area di questo rettangolo è\n" + altezza + " * " + larghezza + " = " + area);
        }
    }

    public static class Triangolo extends Forma {
        public Triangolo(double altezza, double larghezza) {
            super(altezza, larghezza);
            this.numeroLati = 3;
        }

        public void calcolaArea() {
            System.out.println("L'area di questo triangolo è\n" + altezza + " * " + larghezza + " / 2 = " + area);
        }
    }
}