// Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma.
// Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea() per calcolare l'area del rettangolo.

public class Esercizio32 {
    public static void main(String[] args) {
        Forma poligonoIrregolare = new Forma(12, 45);
        Forma unRettangolo = new Rettangolo(10, 5);

        poligonoIrregolare.calcolaArea();
        unRettangolo.calcolaArea();
    }

    public static class Forma {
        public double altezza;
        public double larghezza;
        public double area = altezza * larghezza / 2;
        public int numeroLati;
        public boolean regolare;

        public void calcolaArea() {
            System.out.println("L'area di questo poligono è\n" + altezza + " * " + larghezza + " / 2 = " + area);
        }

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

        @Override
        public void calcolaArea() {
            System.out.println("L'area di questo rettangolo è\n" + altezza + " * " + larghezza + " = " + area);
        }
    }
}