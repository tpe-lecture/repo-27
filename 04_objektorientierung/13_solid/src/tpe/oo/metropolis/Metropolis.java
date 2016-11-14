package tpe.oo.metropolis;

    public class Metropolis { // the metropolis itself.

    public static void main(String[] args) {
           String[] helper = {"Blatt"};
            Schurke azog = new Schurke("Azog der Schänder",27990.0, "Orkismus", "Wasser");
            Schurke hanni = new Schurke("Hannibal Lecter", 19910, "Kannibalismus", "Feuer");
            Schurke ono = new Schurke("Onox", 270201, "Legendismus", "Blatt");
            Superhelden özi = new Superhelden("Özkan", 270201, helper); // helper has to be first declared
//           as a String in an array up there.
            Syndikat sy = new Syndikat("Syndikat der Superschurken" , azog,hanni);

            Finanzamt fa = new Finanzamt();

            double d = fa.zahleSteuer(sy);

            d += fa.zahleSteuer(azog);
            d += fa.zahleSteuer(hanni);
            d += fa.zahleSteuer(ono);

            System.out.println("GesamtSteuer:  " + d);

//            Mutanten a = new Mutanten(); // we have to instance an object of type Metropolis and then
             Mutanten.kämpfe(özi, azog); // we have to cast that object(a) in type Mutanten because we can't
                                              // Directly instance an object of type Mutanten.

        }
    }
