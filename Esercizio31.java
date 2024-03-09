// Scrivere un programma che contenga una classe chiamata Animale ed un metodo chiamato faiIlVerso() che stampi il verso dell'animale.
// Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso() per miagolare.
// Prova quindi a far stampare il verso di Animale e di Gatto.

public class Esercizio31 {
    public static void main(String[] args) {
        Animale cane1 = new Animale("cane");
        Animale gatto1 = new Gatto("micio");

        cane1.faiIlVerso();
        gatto1.faiIlVerso();
    }

    public static class Animale {
        public String nomeAnimale;
        public void faiIlVerso() {
            System.out.println("Verso del " + nomeAnimale);
        }

        public Animale(String nome) {
            this.nomeAnimale = nome;
        }

        public String getNomeAnimale() {
            return nomeAnimale;
        }

        public void setNomeAnimale(String nomeAnimale) {
            this.nomeAnimale = nomeAnimale;
        }
    }

    public static class Gatto extends Animale {

        @Override
        public void faiIlVerso() {
            System.out.println("miao");
        }

        public Gatto (String nomeAnimale) {
            super(nomeAnimale);
        }
    }
}