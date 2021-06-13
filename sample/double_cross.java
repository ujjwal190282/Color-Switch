package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Point3D;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.io.Serializable;

public class double_cross extends obstacles implements Serializable {
    private Line node1 = new Line();
    private Line node2 = new Line();
    private Line node3 = new Line();
    private Line node4 = new Line();
    private Line node7 = new Line();
    private Line node8 = new Line();
    private Line node9 = new Line();
    private Line node10 = new Line();
    Rotate rotate = new Rotate(0);
    Rotate rotate1 = new Rotate(0);
    {
        rotate1.setAxis(new Point3D(0, 0, -1));
    }
    private Timeline timeline;
    private Timeline timeline4;
    private Timeline timeline2;
    private Timeline timeline3;
    private Timeline timeline7;
    private Timeline timeline8;
    private Timeline timeline9;
    private Timeline timeline10;
    {
        node1.setStartX(305.0f);
        node1.setStartY(Y+78);
        node1.setEndX(305.0f);
        node1.setEndY(Y);
        node1.setStroke(Color.BLUE);
        node1.setStrokeWidth(10);
    }
    {
        node2.setStartX(305.0f);
        node2.setStartY(Y-78);
        node2.setEndX(305.0f);
        node2.setEndY(Y);
        node2.setStroke(Color.WHITE);
        node2.setStrokeWidth(10);
    }
    {
        node3.setStartX(227.0f);
        node3.setStartY(Y);
        node3.setEndX(305.0f);
        node3.setEndY(Y);
        node3.setStroke(Color.RED);
        node3.setStrokeWidth(10);
    }

    {
        node4.setStartX(305.0f);
        node4.setStartY(Y);
        node4.setEndX(383.0f);
        node4.setEndY(Y);
        node4.setStroke(Color.YELLOW);
        node4.setStrokeWidth(10);
    }
    {
        node7.setStartX(145.0f);
        node7.setStartY(Y+78);
        node7.setEndX(145.0f);
        node7.setEndY(Y);
        node7.setStroke(Color.BLUE);
        node7.setStrokeWidth(10);
    }
    {
        node8.setStartX(145.0f);
        node8.setStartY(Y-78);
        node8.setEndX(145.0f);
        node8.setEndY(Y);
        node8.setStroke(Color.WHITE);
        node8.setStrokeWidth(10);
    }
    {
        node9.setStartX(67.0f);
        node9.setStartY(Y);
        node9.setEndX(145.0f);
        node9.setEndY(Y);
        node9.setStroke(Color.YELLOW);
        node9.setStrokeWidth(10);
    }
    {
        node10.setStartX(145.0f);
        node10.setStartY(Y);
        node10.setEndX(223.0f);
        node10.setEndY(Y);
        node10.setStroke(Color.RED);
        node10.setStrokeWidth(10);
    }
    Rectangle node5 = new Star(Y-100).getStar();
    Rectangle node6 = new Switch(Y-165).getSwitchButton();

    {
        node1.getTransforms().add(rotate);

        timeline = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(rotate.angleProperty(), 0d)),
                new KeyFrame(Duration.millis(time), new KeyValue(rotate.angleProperty(), 360d)));

        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.setAutoReverse(false);

        timeline.play();
        node4.getTransforms().add(rotate);

        timeline4 = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(rotate.angleProperty(), 0d)),
                new KeyFrame(Duration.millis(time), new KeyValue(rotate.angleProperty(), 360d)));

        timeline4.setCycleCount(Animation.INDEFINITE);
        timeline4.setAutoReverse(false);

        timeline4.play();
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
    public double_cross(double Y_axis,int t)
    {
        super(Y_axis,t);
        rotate.setPivotY(Y_axis);
        rotate.setPivotX(305);
        rotate1.setPivotY(Y_axis);
        rotate1.setPivotX(145);
    }
    public double_cross(double Y_axis,int t,double angle1,double angle2,boolean star,boolean Switch) {
        super(Y_axis, t);
        rotate.setPivotY(Y_axis);
        rotate.setPivotX(305);
        rotate1.setPivotY(Y_axis);
        rotate1.setPivotX(145);
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
    double getAngle(int i)
    {
        if(i==1)return rotate.getAngle();
        else if(i==2)return rotate1.getAngle();
        return Double.parseDouble(null);
    }

    @Override
    void setCentre(int Y)
    {
        node1.setStartY(Y+80);
        node1.setEndY(Y);
        node2.setStartY(Y-80);
        node2.setEndY(Y);
        node3.setStartY(Y);
        node3.setEndY(Y);
        node4.setStartY(Y);
        node4.setEndY(Y);
        node5.setY(Y-100);
        node6.setY(Y-165);
        node7.setStartY(Y+80);
        node7.setEndY(Y);
        node8.setStartY(Y-80);
        node8.setEndY(Y);
        node9.setStartY(Y);
        node9.setEndY(Y);
        node10.setStartY(Y);
        node10.setEndY(Y);
        rotate.setPivotY(Y);
        rotate1.setPivotY(Y);
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
