package com.example.task1_abstr_class;



import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Circle extends Shape {
    double radius;

    public Circle(Color color) {
        super(color);
        this.radius = 50;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(GraphicsContext gс) {
        gс.setFill(color);
        gс.fillOval(x, y, 2 * radius, 2 * radius);
    }


}
