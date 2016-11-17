package tpe.oo.metropolis;

public class Finanzamt {

    private Steuerpflichtig[] steuerpflichtig = new Steuerpflichtig[20]; // this stste represents the 
    // aggregetion between the class finanzamt and the class Steuerpflichtige

    public double steuer() {
        double steuerEinnahmen = 0;
        for (Steuerpflichtig s : steuerpflichtig) {
            if (s != null) {
                steuerEinnahmen = steuerEinnahmen + s.steuer();
            }
        }
        return steuerEinnahmen;
    }

    public void setSteuerpflichtig(Steuerpflichtig s) {
        int position = 0;
        while (true) {
            if (steuerpflichtig[steuerpflichtig.length - 1] != null) {

                System.out.println("voll");
                return;
            }

            if (steuerpflichtig[position] == null) {
                steuerpflichtig[position] = s;
                return;
            }

            position++;

        }
    }

}
