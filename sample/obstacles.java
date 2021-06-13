package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public abstract class obstacles extends gameObjects implements Serializable {
    // circle c= new circle();
    //square s= new square();
    //Group x=new Group();
    //public obstacles()
    //{
    //c=new circle();
    //s= new square();
    //  {x.getChildren().addAll(c.ball, s.ball);}
    //}
    protected Shape node1;
    protected Shape node2;
    protected Shape node3;
    protected Shape node4;
    protected Shape node5;
    protected Shape node6;
    //Star star;
    int time;
    public obstacles(double y_axis,int t) {
        super(y_axis);
        time=t;
      //   star= new Star(Y, 0);
    }
    void setCentre(int Y)
    {
    }
    Node getNode(int i)
    {
        return null;
    }
    void stop()
    {

    }
    void play() {

    }
   double getAngle(int i)
    {
        return 0;
    }

    public void update() {
      page.translate(node1,(int)(Y-y)*3,1, false, 0, (int)(Y-y));
      page.translate(node2,(int)(Y-y)*3,1, false, 0, (int)(Y-y));
      page.translate(node3,(int)(Y-y)*3,1, false, 0, (int)(Y-y));
      page.translate(node4,(int)(Y-y)*3,1, false, 0, (int)(Y-y));
        page.translate(node5,(int)(Y-y)*3,1, false, 0, (int)(Y-y));
        page.translate(node6,(int)(Y-y)*3,1, false, 0, (int)(Y-y));
      //star.update();
  }
     void saveObject(ObjectOutputStream oos) throws IOException {
        oos.writeObject(this);
    }
//    public  void rotateNode(Node node, int X, int Y){
//
//    Rotate rotate = new Rotate(0,X,Y);
//
//        node.getTransforms().add(rotate);
//
//        Timeline timeline = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(rotate.angleProperty(), 0d)),
//                new KeyFrame(Duration.seconds(2), new KeyValue(rotate.angleProperty(), 360d)));
//
//        timeline.setCycleCount(Animation.INDEFINITE);
//        timeline.setAutoReverse(false);
//
//        timeline.play();
//    }
}
