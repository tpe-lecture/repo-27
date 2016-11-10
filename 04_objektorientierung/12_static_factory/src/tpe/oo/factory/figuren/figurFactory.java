package tpe.oo.factory.figuren;

import java.util.Random;

import de.smits_net.games.framework.board.Board;

/**
 * class figurFactory. variable rnd
 *
 * @author nguem
 *
 */
public class figurFactory {
    public static Random rnd = new Random();
    /**
     *method figur.
     */
    public static Figur createFigur(Board board) {

        int n = rnd.nextInt(4);
        switch (n) {

        case 0:
            return new Lady(board);
        case 1:
            return new Ninja(board);
        case 2:
            return new Wizard(board);
        default:
            return null;
        }
    }
}
