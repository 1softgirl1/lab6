package geometry2d;

import exceptions.RectangleException;

import java.util.Random;

public class Rectangle implements Figure {
    private int a, b;

    public Rectangle(int a, int b) {
        try {
            if (a <= 0 || b <= 0) throw new RectangleException("Недопустимое значение, сторона меньше 0");
            this.a = a;
            this.b = b;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Rectangle(){
        Random rand = new Random();
        this.a=rand.nextInt(200);
        this.b=rand.nextInt(200);
    }



    @Override
    public double area() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами: " + a + " ," + b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}