package com.example.task1_abstr_class;


import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;


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

    private Shape currentShape = null;


    @FXML
    private void initialize() {
        rectangleButton.setOnAction(this::onRectangleClick);
        circleButton.setOnAction(this::onCircleClick);
        ellipseButton.setOnAction(this::onEllipseClick);
        canvas.setOnMouseClicked(this::onCanvasClick); // Добавляем обработчик кликов мыши
    }

    private void onRectangleClick(ActionEvent event) {
        currentShape = new Rectangle(colorpicker.getValue(), 100, 50);
    }

    private void onCircleClick(ActionEvent event) {
        currentShape = new Circle(colorpicker.getValue(), 50);
    }

    private void onEllipseClick(ActionEvent event) {
        currentShape = new Ellipse(colorpicker.getValue(), 75, 30);
    }

    private void onCanvasClick(MouseEvent event) {
        if (currentShape != null) {
            GraphicsContext gc = canvas.getGraphicsContext2D();
            currentShape.x = event.getX(); // Устанавливаем координаты из клика мыши
            currentShape.y = event.getY();
            currentShape.draw(gc);
            System.out.println(currentShape.toString());
            currentShape = null; // Сбрасываем текущую фигуру
        }
    }
}
