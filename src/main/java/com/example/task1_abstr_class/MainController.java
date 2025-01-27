package com.example.task1_abstr_class;


import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;

public class MainController {

    @FXML
    private Canvas canvas;
    @FXML
    private Button rectangleButton;
    @FXML
    private Button circleButton;
    @FXML
    private Button ellipseButton;
    @FXML
    private ColorPicker colorpicker;

    private double currentX = 10; // Начальная координата X
    private double currentY = 10; // Начальная координата Y


    @FXML
    private void initialize() {
        rectangleButton.setOnAction(this::onRectangleClick);
        circleButton.setOnAction(this::onCircleClick);
        ellipseButton.setOnAction(this::onEllipseClick);
    }

    private void onRectangleClick(ActionEvent event) {
        drawShape(new Rectangle(colorpicker.getValue(), 100, 50));
    }

    private void onCircleClick(ActionEvent event) {
        drawShape(new Circle(colorpicker.getValue(), 50));
    }

    private void onEllipseClick(ActionEvent event) {
        drawShape(new Ellipse(colorpicker.getValue(), 75, 30));
    }

    private void drawShape(Shape shape) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        shape.x = currentX;
        shape.y = currentY;
        shape.draw(gc);
        System.out.println(shape.toString());

        // Обновляем координаты для следующей фигуры
        if (shape instanceof Rectangle) {
            currentX += ((Rectangle) shape).length + 10; // Добавляем отступ
        } else if (shape instanceof Circle) {
            currentX += 2 * ((Circle) shape).radius + 10;
        } else if (shape instanceof Ellipse) {
            currentX += 2 * ((Ellipse) shape).radiusX + 10;
        }

        // Если достигли края canvas, переходим на следующую строку
        if (currentX + 100 > canvas.getWidth()) {
            currentX = 10;
            currentY += 100; //отступ между строками
        }
    }
}
