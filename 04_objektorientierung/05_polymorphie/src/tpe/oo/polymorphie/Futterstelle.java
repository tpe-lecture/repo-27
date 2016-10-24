package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Fütterung der Tiere.
 */
public class Futterstelle {

    /**
     * Füttert den Affen.
     *
     * @param zootier von der Zoo
     */
    public void gibFutter(ZooTier zootier) {
        zootier.fuettern();
    }

//    public void gibFutter(Affe affe) {
//        affe.fuettern();
//    }
//
//    /**
//     * Füttert den Gorilla.
//     *
//     * @param gorilla Gorilla, der gefüttert werden soll.
//     */
//    public void gibFutter(Gorilla gorilla) {
//        gorilla.fuettern();
//    }
//
//    /**
//     * Füttert die Giraffe.
//     *
//     * @param giraffe Giraffe, die gefüttert werden soll.
//     */
//    public void gibFutter(Giraffe giraffe) {
//        giraffe.fuettern();
//    }
}
