package tpe.oo.metropolis;

public class Schurke extends Mutanten {
    private String mutation;
    private String schwäche;

    public Schurke(String name, double einkommen ,String schwäche ,String mutation) {
        super(name, einkommen, schwäche);
        this.mutation = mutation;
    }

    public String getMutation() {
        return this.mutation;
    }

    public void setSchwäche(String schwäche) {
        this.schwäche = schwäche;
    }

    public String getSchwäche() {
        return this.schwäche;
    }

    public double getEinkommen() {
        // TODO Auto-generated method stub
        return 0;
    }


}
