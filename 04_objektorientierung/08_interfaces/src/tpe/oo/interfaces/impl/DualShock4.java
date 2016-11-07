package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements AnalogController, DigitalController {
    private DigitalController d = new DigitalControllerImpl();
    private AnalogController a = new AnalogControllerImpl();

    @Override
    public void up(double percentage) {
        a.up(percentage);

    }

    @Override
    public void down(double percentage) {
        a.down(percentage);

    }

    @Override
    public void left(double percentage) {
        a.left(percentage);

    }

    @Override
    public void right(double percentage) {
        a.right(percentage);

    }

    @Override
    public void up() {
        d.up();

    }

    @Override
    public void down() {
        d.down();

    }

    @Override
    public void left() {
        d.left();

    }

    @Override
    public void right() {
       d.right();

    }

    @Override
    public Point getPosition() {
        Point resultAnalog = a.getPosition();
        Point resultDigital = d.getPosition() ;
        Point result = new Point();
        result.x = resultAnalog.x + resultDigital.x;
        result.y = resultDigital.y + resultDigital.y;
        return result;
    }

}
