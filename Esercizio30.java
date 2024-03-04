public class Esercizio30 {
    public static void main(String[] args) {
        Automobile auto = new Automobile(200000.0, "AutoBrombeis", "Sanction");
        System.out.println("Cilindrata: " + auto.getCilindrata());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modello: " + auto.getModello());
    }

    public static class Automobile {
        private double cilindrata;
        private String marca;
        private String modello;

        public Automobile(double cilindrata, String marca, String modello) {
            this.cilindrata = cilindrata;
            this.marca = marca;
            this.modello = modello;
        }

        public double getCilindrata() {
            return this.cilindrata;
        }

        public void setCilindrata(double cilindrata) {
            this.cilindrata = cilindrata;
        }

        public String getMarca() {
            return this.marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModello() {
            return this.modello;
        }

        public void setModello(String modello) {
            this.modello = modello;
        }
    }
}