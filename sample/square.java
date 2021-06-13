package sample;

import javafx.animation.*;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.io.Serializable;

public class square extends obstacles implements Serializable {

    private Line node1 = new Line();
    private Line node2 = new Line();
    private Line node3 = new Line();
    private Line node4 = new Line();
    private Timeline timeline;
    private Timeline timeline4;
    private Timeline timeline2;
    private Timeline timeline3;
    Rotate rotate = new Rotate(0);
    {
        node1.setStartX(155.0f);
        node1.setStartY(Y+80);
        node1.setEndX(305.0f);
        node1.setEndY(Y+80);
        node1.setStroke(Color.BLUE);
        node1.setStrokeWidth(10);
    }
    {
        node2.setStartX(305.0f);
        node2.setStartY(Y-80);
        node2.setEndX(305.0f);
        node2.setEndY(Y+70);
        node2.setStroke(Color.WHITE);
        node2.setStrokeWidth(10);
        //movePivot(node2, 55, 5);
        //rotateNode(node2,225,90);
    }
    {
        node3.setStartX(145.0f);
        node3.setStartY(Y-70);
        node3.setEndX(145.0f);
        node3.setEndY(Y+80);
        node3.setStroke(Color.RED);
        node3.setStrokeWidth(10);
        // movePivot(node3, -55, -5);
        // rotateNode(node3,225,90);
    }
    {
        node4.setStartX(145.0f);
        node4.setStartY(Y-80);
        node4.setEndX(295.0f);
        node4.setEndY(Y-80);
        node4.setStroke(Color.YELLOW);
        node4.setStrokeWidth(10);
        //movePivot(node4, -5, 55);
        //rotateNode(node4,225,90);
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
    }
    {
        obstacle.getChildren().add(node1);
        obstacle.getChildren().add(node2);
        obstacle.getChildren().add(node3);
        obstacle.getChildren().add(node4);
        obstacle.getChildren().add(node5);
        obstacle.getChildren().add(node6);
    }
    public square(double Y_axis,int t)
    {
        super(Y_axis,t);
        rotate.setPivotY(Y_axis);
        rotate.setPivotX(225);
    }
    @Override
    double getAngle(int i)
    {
        return rotate.getAngle();
    }
    public square(double Y_axis,int t,double angle,boolean star,boolean Switch) {
        super(Y_axis,t);
        rotate.setPivotY(Y_axis);
        rotate.setPivotX(225);
        rotate.setAngle(angle);
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
    void setCentre(int Y)
    {
        node1.setStartY(Y+80);
        node1.setEndY(Y+80);
        node2.setStartY(Y-80);
        node2.setEndY(Y+70);
        node3.setStartY(Y-70);
        node3.setEndY(Y+80);
        node4.setStartY(Y-80);
        node4.setEndY(Y-80);
        node5.setY(Y-20);
        node6.setY(Y-165);
        rotate.setPivotY(Y);
        // rotatenode(Y);

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
    }
    @Override
    void play()
    {
        timeline.play();
        timeline2.play();
        timeline3.play();
        timeline4.play();
    }
}
