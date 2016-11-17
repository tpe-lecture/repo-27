package tpe.oo.metropolis;

public class Metropolis { // the metropolis itself

    public static void main(String[] args) {
        // an instance of the class Metropolis
        Finanzamt f = new Finanzamt();

        // here are new inhabitants (schurken)
        Schurke azog = new Schurke("_Azog der Schänder_", 27990, "_Orkismus_", null);
        Schurke hannibal = new Schurke("_Hannibal Lecter_", 19910, "_Kannibalismus_", null);
        Schurke onox = new Schurke("_Onox_", 270201, "_Legendismus_", null);
//        Schurke onx = new Schurke("_Onx_", 270201, "_Legendismus_", null);

        // to create a new syndicate
        Syndikat syndikat = new Syndikat("Syndikat der Superschurken");
        syndikat.setSchurken(azog); // azog joins the syndicate
        syndikat.setSchurken(hannibal); // hannibal joins the syndicate as well
//        syndikat.setSchurken(onx);

        f.setSteuerpflichtig(syndikat); // to calculate the taxes of the syndicate*s's members
        f.setSteuerpflichtig(onox); // taxes of onox

        System.out.printf("Gesamte Steuereinnahmen %.2f%n", f.steuer()); // to print out the total
        // amount of taxes

    }

}
