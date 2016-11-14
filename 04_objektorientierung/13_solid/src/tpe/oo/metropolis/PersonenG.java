package tpe.oo.metropolis;

public class PersonenG extends Unternehmen {

    private double einkommen;

    PersonenG(double einkommen) {
        this.einkommen = einkommen;
    }

    public double getEinkommen() {
        return this.einkommen;
    }
}
