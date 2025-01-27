package com.example.task1_abstr_class;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Rectangle extends Shape {
    double length = 100;
    double width = 50;


    @Override
    public void draw(GraphicsContext gс, double x, double y) {
        gс.setFill(color);
        gс.fillRect(x, y, length, width);
    }
    @Override
    public String toString() {
        return "Прямоугольник";
    }



}
