package com.example.task1_abstr_class;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Ellipse extends Shape {
    double radiusX;
    double radiusY;

    public Ellipse(Color color) {
        super(color);
        this.radiusX = 75;
        this.radiusY = 30;
    }

    @Override
    double area() {
        return Math.PI * radiusX * radiusY;
    }

    @Override
    public void draw(GraphicsContext gс) {
        gс.setFill(color);
        gс.fillOval(x, y, 2 * radiusX, 2 * radiusY);
    }


}
