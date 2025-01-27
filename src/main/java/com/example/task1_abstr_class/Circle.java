package com.example.task1_abstr_class;



import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Circle extends Shape {
    double radius = 50;



    @Override
    public void draw(GraphicsContext gс, double x, double y) {
        gс.setFill(color);
        gс.fillOval(x, y, 2 * radius, 2 * radius);
    }
    @Override
    public String toString() {
        return "Круг";
    }

}
