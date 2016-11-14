package tpe.oo.metropolis;

public abstract class Mutanten extends Einwohner {


        private String name = "";
        private double einkommen = 0.0;

        public Mutanten() {

        }

        public Mutanten(String name, double einkommen, String[] superkraft) {
            this.name = name;
            this.einkommen = einkommen;
        }

        public Mutanten(String name, double einkommen, String schwäche) {
            this.name = name;
            this.einkommen = einkommen;
        }

        public static String kämpfe(Superhelden superheld, Schurke schurke) {
            for (int i = 0; i < superheld.getSuperKraft().length -1; i++) {
                if (superheld.getSuperKraft()[i]
                        .equals(schurke.getSchwäche())) {
                    return "Schurke hat gewonnen!";
                }
            }
            return "Superheld hat gewonnen";
        }

        public String getName() {
            return this.name;
        }

        public double getEinkommen() {
            return this.einkommen;
        }
}
