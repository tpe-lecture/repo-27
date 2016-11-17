package tpe.oo.metropolis;

public interface Einkommensteuerpflichtig {
    // extends Steuerpflichtig {
    double STEUERSATZ1 = 0.08;
    double STEUERSATZ2 = 0.15;
    double STEUERSATZ3 = 0.25;

    double einkommensteuer();
}
