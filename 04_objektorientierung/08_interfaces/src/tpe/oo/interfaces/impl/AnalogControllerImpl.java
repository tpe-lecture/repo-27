package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {

    double x, y;

    @Override
    public void up(double percentage) {
        y -= percentage;

    }

    @Override
    public void down(double percentage) {
        y += percentage;

    }

    @Override
    public void left(double percentage) {
        x -= percentage;

    }

    @Override
    public void right(double percentage) {
        x += percentage;

    }

    @Override
    public Point getPosition() {
        // TODO Auto-generated method stub
        return new Point((int) x, (int) y);
    }

}
