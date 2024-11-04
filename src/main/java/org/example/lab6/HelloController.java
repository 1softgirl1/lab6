package org.example.lab6;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.util.Random;

public class HelloController {
    @FXML
    private Button bc;
    @FXML
    private Button br;
    @FXML
    private Button bt;


    @FXML
    private Circle c;
    @FXML
    private Rectangle r;
    @FXML
    private Polygon t;


    @FXML
    protected void onCircle() {
        Random rand = new Random();
        geometry2d.Circle c1 = new geometry2d.Circle();
        c.setCenterX(c1.getCenterX());
        c.setCenterY(c1.getCenterY());
        c.setRadius(c1.getRadius());
        c.setFill(javafx.scene.paint.Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
    }

    @FXML
    protected void onRectangle() {
        Random rand = new Random();
        geometry2d.Rectangle r1 = new geometry2d.Rectangle();
        r.setWidth(r1.getA());
        r.setHeight(r1.getB());
        r.setLayoutX(rand.nextInt(50, 500));
        r.setLayoutY(rand.nextInt(50, 500));
        r.setFill(javafx.scene.paint.Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
    }

    @FXML
    protected void onTriangle() {
        Random rand = new Random();
        geometry2d.Triangle t1 = new geometry2d.Triangle();
        t.setLayoutX(rand.nextInt(50, 500));
        t.setLayoutY(rand.nextInt(50, 500));
        t.getPoints().clear();
        t.getPoints().addAll(t1.getAx(), t1.getAy(), t1.getBx(), t1.getBy(), t1.getCx(), t1.getCy());
        t.setFill(javafx.scene.paint.Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
    }

    private Shape draggedShape = null;
    private double offsetX;
    private double offsetY;


    @FXML
    private void handleMousePressed(MouseEvent event) {
        draggedShape = (Shape) event.getSource();
        offsetX = event.getSceneX()-draggedShape.getLayoutX();
        offsetY = event.getSceneY()- draggedShape.getLayoutY();
        draggedShape.toFront();
    }

    @FXML
    private void handleMouseDragged(MouseEvent event) {
        draggedShape = (Shape) event.getSource();
        draggedShape.setTranslateX(event.getSceneX()-offsetX);
        draggedShape.setTranslateY(event.getSceneY()-offsetY);
    }
    @FXML
    private void handleMouseReleased(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            draggedShape = null; // Сбрасываем переменную при отпускании кнопки
        }
    }

    @FXML
    private void handleMouseClicked(MouseEvent event) {
        Shape clickedShape = (Shape) event.getSource();
        Random rand = new Random();
        clickedShape.setFill(javafx.scene.paint.Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
    }

}