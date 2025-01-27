package com.example.task1_abstr_class;

import javafx.scene.paint.Color;

public class ShapeFactory {

    public Shape createShape(int shapeType, Color color, double x, double y) {
        switch (shapeType) {
            case 1:
                Rectangle rectangle = new Rectangle(color);
                rectangle.x = x;
                rectangle.y = y;
                return rectangle;
            case 2:
                Circle circle = new Circle(color);
                circle.x = x;
                circle.y = y;
                return circle;
            case 3:
                Ellipse ellipse = new Ellipse(color);
                ellipse.x = x;
                ellipse.y = y;
                return ellipse;
            case 4:
                Rectangle rectangle2 = new Rectangle(color);
                rectangle2.x = x;
                rectangle2.y = y;
                return rectangle2;
            default:
                return null;
        }
    }
}
