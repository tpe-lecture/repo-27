package tpe.oo.metropolis;

public class Finanzamt extends Metropolis implements Steuerpflichtige {

    // @Override
    public double zahleSteuer(Metropolis buerger) { // the method to calculate
        // the total of the taxes
        // of the metropolis
        double steuer = 0;
        if (buerger instanceof KapitalG || buerger instanceof Syndikat) {
            steuer = körperschaftSteuer(buerger);

        }
        else if (buerger instanceof Bürger || buerger instanceof PersonenG
                || buerger instanceof Schurke) {
            steuer = einkommenSteuer(buerger);
        }
        else if (buerger instanceof KapitalG
                || buerger instanceof PersonenG) {
            steuer = gewerbeSteuer(buerger);
        }
        return steuer;
    }

    private double körperschaftSteuer(Metropolis buerger) {

        if (buerger instanceof KapitalG) {
            return ((KapitalG) buerger).getEinkommen() * 15 / 100;
        }
        else if (buerger instanceof Syndikat) {
            return ((Syndikat) buerger).getEinkommenSumme() * 15 / 100;
        }
        return 0;
    }

    private double einkommenSteuer(Metropolis buerger) {
        double einkommen;
        double gesamtSteuer = 0.0;
        if (buerger instanceof Einwohner) {
            einkommen = ((Einwohner) buerger).getEinkommen();
            gesamtSteuer = berechneProgressive(einkommen);
        }
        else if (buerger instanceof PersonenG) {
            einkommen = ((PersonenG) buerger).getEinkommen();
            gesamtSteuer = berechneProgressive(einkommen);
        }
        else if (buerger instanceof Schurke) {
            einkommen = ((Schurke) buerger).getEinkommen();
            gesamtSteuer = berechneProgressive(einkommen);
        }
        return gesamtSteuer;
    }

    public double berechneProgressive(double einkommen) {
        if (einkommen < 20000.0) {
            return einkommen * 0.08;
        }
        else if (einkommen >= 20000 && einkommen < 40000) {
            return (20000.0 * 0.08) + ((einkommen - 20000) * 0.15);
        }
        else if (einkommen >= 40000 && einkommen < 60000) {
            return (20000.0 * 0.08) + (20000.0 * 0.15)
                    + ((einkommen - 40000) * 0.25);
        }
        else if (einkommen >= 60000) {
            return (20000.0 * 0.08) + (20000.0 * 0.15) + (20000.0 * 0.25)
                    + ((einkommen - 60000) * 0.4);
        }
        return einkommen;
    }

    private double gewerbeSteuer(Metropolis buerger) {
        double steuer = 0.0;
        if (buerger instanceof KapitalG) {
            return ((KapitalG) buerger).getEinkommen() * 15 / 100;
        }
        else if (buerger instanceof PersonenG) {
            steuer = ((PersonenG) buerger).getEinkommen() * 15 / 100;
            if (steuer >= 800) {
                steuer -= 800;
            }
        }
        return steuer;
    }
}
