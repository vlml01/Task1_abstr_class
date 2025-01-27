package com.example.task1_abstr_class;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

abstract class Shape implements Cloneable{
    protected Color color;
    protected double x, y;

    public abstract String toString();;
    abstract void draw(GraphicsContext gс, double x, double y);

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e); // If Cloneable is implemented this should not happen
        }
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
