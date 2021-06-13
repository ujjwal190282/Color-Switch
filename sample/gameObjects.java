package sample;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.shape.Shape;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public abstract class gameObjects implements Serializable {
    Group obstacle = new Group();
    protected double Y;
    protected double y;
    abstract void update();
    abstract void saveObject(ObjectOutputStream oos) throws IOException;
    abstract void setCentre(int Y);
    abstract Node getNode(int y);
    abstract void stop();
    protected boolean switchCollected=false;
    protected boolean starCollected=false;
    abstract void play();
    abstract double getAngle(int i);
    public gameObjects(double y_axis)
    {
        this.y=y_axis;

        this.Y=y_axis;
    }

}
