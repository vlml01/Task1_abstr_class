package com.example.task1_abstr_class;

import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{

    @FXML
    private Canvas canvas;

    @FXML
    private ListView<Shape> listView;
    @FXML
    private ColorPicker colorPicker;
    private GraphicsContext gc;
    private ObservableList<Shape> content;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Ellipse ellipse = new Ellipse();

        content = FXCollections.observableArrayList(circle, rectangle, ellipse);
        listView.setItems(content);
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);


    }

    public void drawShape(MouseEvent mouseEvent) {
        int index = listView.getSelectionModel().getSelectedIndex();
        if (index < 0){
            return;
        }
        Shape shape = (Shape) content.get(index).clone();
        shape.setColor(colorPicker.getValue());
        shape.draw(gc, mouseEvent.getX(), mouseEvent.getY());
        System.out.println(shape.toString());
    }
    @FXML
    public void handleCanvasClick(MouseEvent mouseEvent) {
        drawShape(mouseEvent);
    }
}
