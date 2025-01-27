package com.example.task1_abstr_class;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Ellipse extends Shape {
    double radiusX = 75;
    double radiusY = 50;

    @Override
    public void draw(GraphicsContext gс, double x, double y) {
        gс.setFill(color);
        gс.fillOval(x, y, 2 * radiusX, 2 * radiusY);
    }
    @Override
    public String toString() {
        return "Эллипс";
    }


}
