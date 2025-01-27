package com.example.task1_abstr_class;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(Color color) {
        super(color);
        this.length = 100;
        this.width = 50;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public void draw(GraphicsContext gс) {
        gс.setFill(color);
        gс.fillRect(x, y, length, width);
    }



}
