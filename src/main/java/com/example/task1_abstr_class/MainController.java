package com.example.task1_abstr_class;


import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class MainController {

    @FXML
    private Canvas canvas;
    @FXML
    private TextField sidesInput;
    @FXML
    private ColorPicker colorpicker;

    private Shape currentShape = null;

    private String logicalElement = null;
    private ShapeFactory shapeFactory = new ShapeFactory();


    @FXML
    private void initialize() {

        canvas.setOnMouseClicked(this::onCanvasClick); // Добавляем обработчик кликов мыши
    }

    private void onCanvasClick(MouseEvent event) {
        String input = sidesInput.getText();
        if (input == null || input.isEmpty()) {
            showAlert("Ошибка ввода", "Пожалуйста, введите 1,2 или 3.");
            sidesInput.clear();
            return;
        }

        Integer shapeType = parseInteger(input);
        if(shapeType == null){
            showAlert("Ошибка ввода", "Пожалуйста, введите целое число.");
            sidesInput.clear();
            return;
        }

        Color color = colorpicker.getValue();
        currentShape = shapeFactory.createShape(shapeType, color, event.getX(), event.getY());

        if (currentShape == null) {
            showAlert("Ошибка ввода", "Пожалуйста, введите 1, 2, 3 или 4");
            sidesInput.clear();
        } else {
            GraphicsContext gc = canvas.getGraphicsContext2D();
            currentShape.draw(gc);
            System.out.println(currentShape.toString());
        }
        currentShape = null;
        sidesInput.clear();
    }

    private Integer parseInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

}
