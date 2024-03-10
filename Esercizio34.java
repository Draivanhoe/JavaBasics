// Scrivere un programma che contenga un'interfaccia Forma ed un metodo chiamato calcolaArea().
// Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area.

public class Esercizio34 {
    public static void main(String[] args) {
        Triangolo unTriangolo = new Triangolo(12, 45);
        Rettangolo unRettangolo = new Rettangolo(10, 5);

        unTriangolo.calcolaArea();
        unRettangolo.calcolaArea();
    }

    public interface InterfacciaForma {
        void calcolaArea();
    }

    public static class Forma {
        public double altezza;
        public double larghezza;
        public double area;
        public int numeroLati;
        public boolean regolare;

        public Forma (double altezza, double larghezza) {
            this.altezza = altezza;
            this.larghezza = larghezza;
            this.area = altezza * larghezza / 2;
        }
    }

    public static class Rettangolo
            extends Forma
            implements InterfacciaForma {
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

    public static class Triangolo
            extends Forma
            implements InterfacciaForma {
        public Triangolo(double altezza, double larghezza) {
            super(altezza, larghezza);
            this.numeroLati = 3;
        }

        public void calcolaArea() {
            System.out.println("L'area di questo triangolo è\n" + altezza + " * " + larghezza + " / 2 = " + area);
        }
    }
}
