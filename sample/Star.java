package sample;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import java.io.IOException;
import java.io.ObjectOutputStream;


public class Star extends gameObjects
{
    private Rectangle star = new Rectangle();
    {
        star.setX(205);
        star.setHeight(40);
        star.setWidth(40);
        //obstacle.getChildren().add(star);
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("18.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        Image image = new Image( getClass().getResource("20.jpg").toExternalForm());
        ImagePattern imagePattern = new ImagePattern(image);
        star.setFill(imagePattern);
    }
//    float size;
//    Rectangle rectangle = new Rectangle();
//    {
//        rectangle.setX(205);
//
//        rectangle.setHeight(40);
//        rectangle.setWidth(40);
//        obstacle.getChildren().add(rectangle);
//        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("18.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
//        Background background2 = new Background(backgroundImage1);
//        Image image = new Image( getClass().getResource("18.jpg").toExternalForm());
//        ImagePattern imagePattern = new ImagePattern(image);
//        rectangle.setFill(imagePattern);
//    }

    public Star(double y_axis) {
        super(y_axis);
        star.setY(Y);
    }
    Rectangle getStar()
    {
        return star;
    }
    @Override
    void update() {

    }

    @Override
    void saveObject(ObjectOutputStream oos) throws IOException {

    }

    @Override
    void setCentre(int Y) {

    }

    @Override
    Node getNode(int y) {
        return null;
    }

    @Override
    void stop() {

    }

    @Override
    void play() {

    }

    @Override
    double getAngle(int i) {
        return 0;
    }
//
//
//    void action()
//    {
//
//    }
//    @Override
//    void setCentre(int Y)
//    {
//        rectangle.setY(Y-20);
//        // rotatenode(Y);
//    }
//
//    @Override
//    Node getNode(int y) {
//        return rectangle;
//    }
//
//    @Override
//    void stop() {
//
//    }
//
//    @Override
//    void play() {
//
//    }
//@Override
//    public void update() {
//        page.translate(rectangle,(int)(Y-y)*3,1, false, 0, (int)(Y-y));
//
//    }

}
