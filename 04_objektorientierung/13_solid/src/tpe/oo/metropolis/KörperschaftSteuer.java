package tpe.oo.metropolis;

public interface KörperschaftSteuer extends Steuerpflichtige {

    public final double STANDARD_STEUER = 15.0;

    void zahleSteuer(double STANDARD_STEUER);
}
