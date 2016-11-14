package tpe.oo.metropolis;

public class Superhelden extends Mutanten {

    public String[] superKraft = new String[0];

    public Superhelden(String name, double einkommen, String[] superKraft) {
        super(name, einkommen, superKraft);

    }

    public String[] getSuperKraft() {
        return superKraft;
    }
}
