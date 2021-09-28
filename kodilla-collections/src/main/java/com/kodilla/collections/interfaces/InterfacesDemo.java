package com.kodilla.collections.interfaces;

class Square implements Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 4 * width;
    }
}

class Circle implements Shape {
    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getArea () {
        return Math.PI * radious * radious;
    }
    public double getPerimeter () {
        return 2 * Math.PI * radious;
    }
}

class Triangle implements Shape {
    private double width;
    private double height;
    private double hypotenuse;

    public Triangle(double width, double height, double hypotenuse){
        this.height = height;
        this.width = width;
        this.hypotenuse = hypotenuse;
    }
    @Override
    public double getArea() {
        return width * hypotenuse / 2;
    }
    @Override
    public double getPerimeter() {
        return width + height + hypotenuse;
    }
}


public class InterfacesDemo {

    public static void main(String[] args) {

        Square square = new Square(10.0);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Circle circle = new Circle(7);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Triangle triangle = new Triangle(5,5,5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}

