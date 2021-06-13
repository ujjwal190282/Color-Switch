package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

public class circle extends obstacles implements Serializable {
    private Arc node1 = new Arc();
    private Arc node2 = new Arc();
    private Arc node3 = new Arc();
    private Arc node4 = new Arc();
    Rotate rotate = new Rotate(0);
    private Timeline timeline;
    private Timeline timeline4;
    private Timeline timeline2;
    private Timeline timeline3;
    {   node1.setCenterX(225.0f);
        node1.setCenterY(Y);
        node1.setRadiusX(80.0f);
        node1.setRadiusY(80.0f);
        node1.setStartAngle(45.0f);
        node1.setLength(90.0f);
        node1.setStroke(Color.BLUE);
        node1.setStrokeWidth(8);
        node1.setFill(Color.TRANSPARENT);
        node1.setType(ArcType.OPEN);
        //animate(node2);
        //map.put(node2, Color.WHITE);

        //movePivot(node2, 50.0f, 0.0f);
    }



    {   node2.setCenterX(225.0f);
        node2.setCenterY(Y);
        node2.setRadiusX(80.0f);
        node2.setRadiusY(80.0f);
        node2.setStartAngle(135.0f);
        node2.setLength(90.0f);
        node2.setStroke(Color.WHITE);
        node2.setStrokeWidth(8);
        node2.setFill(Color.TRANSPARENT);
        node2.setType(ArcType.OPEN);
        //animate(node2);
        //map.put(node2, Color.WHITE);

        //movePivot(node2, 50.0f, 0.0f);
    }

    {
        node3.setCenterX(225.0f);
        node3.setCenterY(Y);
        node3.setRadiusX(80.0f);
        node3.setRadiusY(80.0f);
        node3.setStartAngle(225.0f);
        node3.setLength(90.0f);
        node3.setStroke(Color.RED);
        node3.setStrokeWidth(8);
        node3.setFill(Color.TRANSPARENT);
        node3.setType(ArcType.OPEN);
        //animate(node3);
        //map.put(node3, Color.RED);

        // movePivot(node3, 0.0f, -50.0f);
    }

    {
        node4.setCenterX(225.0f);
        node4.setCenterY(Y);
        node4.setRadiusX(80.0f);
        node4.setRadiusY(80.0f);
        node4.setStartAngle(315.0f);
        node4.setLength(90.0f);
        node4.setStroke(Color.YELLOW);
        node4.setStrokeWidth(8);
        node4.setFill(Color.TRANSPARENT);
        node4.setType(ArcType.OPEN);
        // movePivot(node4, -50.0f, 0.0f);
       //animate(node4);
        //map.put(node4, Color.YELLOW);
     //   System.out.println(node4.getBoundsInLocal());
    }
   private  Rectangle node5 = new Star(Y-20).getStar();
    private Rectangle node6 = new Switch(Y-165).getSwitchButton();
    {
        obstacle.getChildren().add(node1);
        obstacle.getChildren().add(node2);
        obstacle.getChildren().add(node3);
        obstacle.getChildren().add(node4);
        obstacle.getChildren().add(node5);
        obstacle.getChildren().add(node6);
    }
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
//    void animate (Arc arc)
//    {
//        Timeline animation = new Timeline(
//                new KeyFrame(Duration.ZERO, new KeyValue(arc.startAngleProperty(), arc.getStartAngle(), Interpolator.LINEAR)),
//                new KeyFrame(Duration.seconds(2), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() - 360, Interpolator.LINEAR))
//        );
//        {
//            animation.setCycleCount(Animation.INDEFINITE);
//            animation.play();}
//        }
        @Override
        void setCentre(int Y)
        {
            node1.setCenterY(Y);
            node2.setCenterY(Y);
            node3.setCenterY(Y);
            node4.setCenterY(Y);
            node5.setY(Y-20);
            node6.setY(Y-165);
            rotate.setPivotY(Y);
           // rotatenode(Y);

        }
    public circle(double Y_axis,int t) {
        super(Y_axis,t);
        rotate.setPivotY(Y_axis);
        rotate.setPivotX(225);
    }
    public circle(double Y_axis,int t,double angle,boolean star,boolean Switch) {
        super(Y_axis, t);
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
    double getAngle(int i)
    {
        return rotate.getAngle();
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
