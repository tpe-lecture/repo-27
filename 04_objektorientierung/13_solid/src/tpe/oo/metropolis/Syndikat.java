package tpe.oo.metropolis;

public class Syndikat implements Koerperschaftsteuerpflichtig {

    protected String name;
    protected Schurke[] schurken = new Schurke[2]; // this represents the combination between
    //the class Schurken and the one Syndicat

    public Syndikat(String name) {
        this.name = name;
    }

    public double koerperschaftsteuer() {
        double steuer = 0;
        double summe = 0;
        for (Schurke s : schurken) {
            if (s != null) {
                steuer = steuer + s.einkommensteuer();
                summe = summe + s.getEinkommen();
            }
        }
        return steuer + (summe * STEUERSATZ);

    }

    public void setSchurken(Schurke schurke) { // to add a new Schureke into the Syndicate
        int position = 0;

        while (true) {
            if (schurken[schurken.length - 1] != null) { // the array / the syndicate is full

                System.out.println("Sorry " + schurke.name + " das Syndikat ist voll");
                return;
            }

            if (schurken[position] == null) {
                System.out.println(schurke.getName() + " " + "Hat sich dem " + this.name + " angeschlossen");
                schurken[position] = schurke;
                return; // what is this state "return" used for?
            }

            position++;

        }

    }

    @Override
    public double steuer() {

        return koerperschaftsteuer();
    }
}
