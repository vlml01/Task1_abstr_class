package com.example.task1_abstr_class;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Ellipse extends Shape {
    double radiusX;
    double radiusY;

    public Ellipse(Color color, double radiusX, double radiusY) {
        super(color);
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    @Override
    double area() {
        return Math.PI * radiusX * radiusY;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillOval(x, y, 2 * radiusX, 2 * radiusY);
    }


}
