package tpe.oo.metropolis;

public class Bürger extends Mensch {
    static int revenue = 45000;
    protected int numberOfBürger = 50;

    public static int einkommensteuer() {
        if (revenue < 20000) {

            return revenue * 8 / 100;
        }
        else if (revenue < 40000) {

            return 20000 * 8 / 100 + (revenue - 20000) * 15 / 100;
        }
        else if (revenue < 60000) {

            return 20000 * 8 / 100 + 20000 * 15 / 100
                    + (revenue - 40000) * 25 / 100;
        }
        else {
            return 20000 * 8 / 100 + (20000 * 15) / 100
                    + (revenue - 40000) * 25 / 100;
        }
    }

}
