
package geometry2d;

import exceptions.RectangleException;

import java.util.Random;

public class Triangle implements Figure {
    private double ax, bx, cx, ay, by, cy ;

    public Triangle() {
        Random rand = new Random();
        this.ax=rand.nextInt(200);
        this.bx=rand.nextInt(200);
        this.cx=rand.nextInt(200);
        this.ay=rand.nextInt(200);
        this.by=rand.nextInt(200);
        this.cy=rand.nextInt(200);
    }

    @Override
    public double area() {
        return 1;
    }


    public double getAx() {
        return ax;
    }

    public double getBx() {
        return bx;
    }

    public double getCx() {
        return cx;
    }

    public double getAy() {
        return ay;
    }

    public double getBy() {
        return by;
    }

    public double getCy() {
        return cy;
    }
}