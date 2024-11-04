package geometry2d;

import exceptions.*;

import java.util.Random;


public class Circle implements Figure{
    private int radius;
    private double CenterX;
    private double CenterY;

    public Circle(int r) {
        try{
            if(r<0) throw new CircleException("Недопустимое значение, радиус меньше 0");
            this.radius=r;
        }catch (CircleException ex){
            System.out.println(ex.getMessage());
        }
    }

    public Circle() {
        Random rand = new Random();
        this.radius=rand.nextInt(100);
        this.CenterX=rand.nextInt(100, 500);
        this.CenterY=rand.nextInt(100, 500);
    }

    @Override
    public double area(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Круг с радиусом: " + radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getCenterX() {
        return CenterX;
    }

    public double getCenterY() {
        return CenterY;
    }

}
