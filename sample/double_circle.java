package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.io.Serializable;
import java.util.HashMap;

public class double_circle extends obstacles implements Serializable {
    private Arc node1 = new Arc();
    private Arc node2 = new Arc();
    private Arc node3 = new Arc();
    private Arc node4 = new Arc();
    private Arc node7 = new Arc();
    private Arc node8 = new Arc();
    private Arc node9 = new Arc();
    private Arc node10 = new Arc();
    Rotate rotate = new Rotate(0);
    Rotate rotate1 = new Rotate(0);
    { rotate1.setAxis(new Point3D(0, 0, -1));}

    private Timeline timeline;
    private Timeline timeline4;
    private Timeline timeline2;
    private Timeline timeline3;
    private Timeline timeline7;
    private Timeline timeline8;
    private Timeline timeline9;
    private Timeline timeline10;

    {   node1.setCenterX(225.0f+83);
        node1.setCenterY(Y);
        node1.setRadiusX(80.0f);
        node1.setRadiusY(80.0f);
        node1.setStartAngle(45.0f);
        node1.setLength(90.0f);
        node1.setStroke(Color.BLUE);
        node1.setStrokeWidth(8);
        node1.setFill(Color.TRANSPARENT);
        node1.setType(ArcType.OPEN);
    }
    {   node2.setCenterX(225.0f+83);
        node2.setCenterY(Y);
        node2.setRadiusX(80.0f);
        node2.setRadiusY(80.0f);
        node2.setStartAngle(135.0f);
        node2.setLength(90.0f);
        node2.setStroke(Color.WHITE);
        node2.setStrokeWidth(8);
        node2.setFill(Color.TRANSPARENT);
        node2.setType(ArcType.OPEN);
    }
    {
        node3.setCenterX(225.0f+83);
        node3.setCenterY(Y);
        node3.setRadiusX(80.0f);
        node3.setRadiusY(80.0f);
        node3.setStartAngle(225.0f);
        node3.setLength(90.0f);
        node3.setStroke(Color.RED);
        node3.setStrokeWidth(8);
        node3.setFill(Color.TRANSPARENT);
        node3.setType(ArcType.OPEN);
    }
    {
        node4.setCenterX(225.0f+83);
        node4.setCenterY(Y);
        node4.setRadiusX(80.0f);
        node4.setRadiusY(80.0f);
        node4.setStartAngle(315.0f);
        node4.setLength(90.0f);
        node4.setStroke(Color.YELLOW);
        node4.setStrokeWidth(8);
        node4.setFill(Color.TRANSPARENT);
        node4.setType(ArcType.OPEN);
    }
    {   node7.setCenterX(225.0f-83);
        node7.setCenterY(Y);
        node7.setRadiusX(80.0f);
        node7.setRadiusY(80.0f);
        node7.setStartAngle(45.0f);
        node7.setLength(90.0f);
        node7.setStroke(Color.BLUE);
        node7.setStrokeWidth(8);
        node7.setFill(Color.TRANSPARENT);
        node7.setType(ArcType.OPEN);
    }
    {   node8.setCenterX(225.0f-83);
        node8.setCenterY(Y);
        node8.setRadiusX(80.0f);
        node8.setRadiusY(80.0f);
        node8.setStartAngle(135.0f);
        node8.setLength(90.0f);
        node8.setStroke(Color.YELLOW);
        node8.setStrokeWidth(8);
        node8.setFill(Color.TRANSPARENT);
        node8.setType(ArcType.OPEN);
    }
    {
        node9.setCenterX(225.0f-83);
        node9.setCenterY(Y);
        node9.setRadiusX(80.0f);
        node9.setRadiusY(80.0f);
        node9.setStartAngle(225.0f);
        node9.setLength(90.0f);
        node9.setStroke(Color.RED);
        node9.setStrokeWidth(8);
        node9.setFill(Color.TRANSPARENT);
        node9.setType(ArcType.OPEN);
    }
    {
        node10.setCenterX(225.0f-83);
        node10.setCenterY(Y);
        node10.setRadiusX(80.0f);
        node10.setRadiusY(80.0f);
        node10.setStartAngle(315.0f);
        node10.setLength(90.0f);
        node10.setStroke(Color.WHITE);
        node10.setStrokeWidth(8);
        node10.setFill(Color.TRANSPARENT);
        node10.setType(ArcType.OPEN);
    }
    private  Rectangle node5 = new Star(Y-100).getStar();
    private Rectangle node6 = new Switch(Y-165).getSwitchButton();
    {
        obstacle.getChildren().add(node1);
        obstacle.getChildren().add(node2);
        obstacle.getChildren().add(node3);
        obstacle.getChildren().add(node4);
        obstacle.getChildren().add(node5);
        obstacle.getChildren().add(node6);
        obstacle.getChildren().add(node7);
        obstacle.getChildren().add(node8);
        obstacle.getChildren().add(node9);
        obstacle.getChildren().add(node10);
    }


    {
        node1.getTransforms().add(rotate);
        timeline = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(rotate.angleProperty(), 0d)),
                new KeyFrame(Duration.millis(time), new KeyValue(rotate.angleProperty(), 360d)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.setAutoReverse(false);
        timeline.play();

        node2.getTransforms().add(rotate);
        timeline2 = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(rotate.angleProperty(), 0d)),
                new KeyFrame(Duration.millis(time), new KeyValue(rotate.angleProperty(), 360d)));
        timeline2.setCycleCount(Animation.INDEFINITE);
        timeline2.setAutoReverse(false);
        timeline2.play();

        node3.getTransforms().add(rotate);
        timeline3 = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(rotate.angleProperty(), 0d)),
                new KeyFrame(Duration.millis(time), new KeyValue(rotate.angleProperty(), 360d)));
        timeline3.setCycleCount(Animation.INDEFINITE);
        timeline3.setAutoReverse(false);
        timeline3.play();

        node4.getTransforms().add(rotate);
        timeline4 = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(rotate.angleProperty(), 0d)),
                new KeyFrame(Duration.millis(time), new KeyValue(rotate.angleProperty(), 360d)));
        timeline4.setCycleCount(Animation.INDEFINITE);
        timeline4.setAutoReverse(false);
        timeline4.play();

        node7.getTransforms().add(rotate1);
        timeline7 = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(rotate1.angleProperty(), 0d)),
                new KeyFrame(Duration.millis(time), new KeyValue(rotate1.angleProperty(), 360d)));

        timeline7.setCycleCount(Animation.INDEFINITE);
        timeline7.setAutoReverse(false);
        timeline7.play();

        node8.getTransforms().add(rotate1);
        timeline8 = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(rotate1.angleProperty(), 0d)),
                new KeyFrame(Duration.millis(time), new KeyValue(rotate1.angleProperty(), 360d)));

        timeline8.setCycleCount(Animation.INDEFINITE);
        timeline8.setAutoReverse(false);
        timeline8.play();

        node9.getTransforms().add(rotate1);
        timeline9 = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(rotate1.angleProperty(), 0d)),
                new KeyFrame(Duration.millis(time), new KeyValue(rotate1.angleProperty(), 360d)));
        timeline9.setCycleCount(Animation.INDEFINITE);
        timeline9.setAutoReverse(false);
        timeline9.play();

        node10.getTransforms().add(rotate1);
        timeline10 = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(rotate1.angleProperty(), 0d)),
                new KeyFrame(Duration.millis(time), new KeyValue(rotate1.angleProperty(), 360d)));
        timeline10.setCycleCount(Animation.INDEFINITE);
        timeline10.setAutoReverse(false);
        timeline10.play();
    }
//    void animate (Arc arc)
//    {
//        Timeline animation = new Timeline(
//                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
//                new KeyFrame(Duration.seconds(2), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() - 360, Interpolator.LINEAR))
//        );
//        {
//            animation.setCycleCount(Animation.INDEFINITE);
//            animation.play();}
//    }

    @Override
    double getAngle(int i)
    {
        if(i==1)return rotate.getAngle();
        else if(i==2)return rotate1.getAngle();
        return Double.parseDouble(null);
    }
    @Override
    void setCentre(int Y)
    {
        node1.setCenterY(Y);
        node2.setCenterY(Y);
        node3.setCenterY(Y);
        node4.setCenterY(Y);
        node7.setCenterY(Y);
        node8.setCenterY(Y);
        node9.setCenterY(Y);
        node10.setCenterY(Y);
        node5.setY(Y-100);
        node6.setY(Y-165);
        rotate.setPivotY(Y);
        rotate1.setPivotY(Y);
        // rotatenode(Y);
    }
    public double_circle(double Y_axis,int t) {
        super(Y_axis,t);
        rotate.setPivotY(Y_axis);
        rotate.setPivotX(225+83);
        rotate1.setPivotY(Y_axis);
        rotate1.setPivotX(225-83);
    }
    public double_circle(double Y_axis,int t,double angle1,double angle2,boolean star,boolean Switch) {
        super(Y_axis, t);
        rotate.setPivotY(Y_axis);
        rotate.setPivotX(225 + 83);
        rotate1.setPivotY(Y_axis);
        rotate1.setPivotX(225 - 83);
        rotate.setAngle(angle1);
        rotate1.setAngle(angle2);
        if(Switch==true)
        {
            obstacle.getChildren().remove(5, 6);
        }

        if(star==true)
        {
            obstacle.getChildren().remove(4, 5);
        }
    }
    @Override
    Node getNode(int i)
    {
        if (i==1)return node1;
        else   if (i==2)return node2;
        else   if (i==3)return node3;
        else   if (i==4)return node4;
        else   if (i==5)return node5;
        else   if (i==6)return node6;
        return null;
    }
    @Override
    void stop()
    {
        timeline.stop();
        timeline2.stop();
        timeline3.stop();
        timeline4.stop();
        timeline7.stop();
        timeline8.stop();
        timeline9.stop();
        timeline10.stop();
    }
    @Override
    void play()
    {
        timeline.play();
        timeline2.play();
        timeline3.play();
        timeline4.play();
        timeline7.play();
        timeline8.play();
        timeline9.play();
        timeline10.play();
    }
}
