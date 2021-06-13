package sample;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.io.IOException;
import java.io.ObjectOutputStream;

class Switch extends gameObjects  {
    private Rectangle switchButton = new Rectangle();
    {
        switchButton.setX(210);
        switchButton.setHeight(30);
        switchButton.setWidth(30);

        // obstacle.getChildren().add(switchButton);
        //BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("18.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        //Background background2 = new Background(backgroundImage1);
        Image image = new Image( getClass().getResource("19.png").toExternalForm());
        ImagePattern imagePattern = new ImagePattern(image);
        switchButton.setFill(imagePattern);
    }

    public Switch(double y_axis) {
        super(y_axis);
        switchButton.setY(Y);
    }
    Rectangle getSwitchButton()
    {
        return switchButton;
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
//    {obstacle.getChildren().add(Switch);}
//    public Switch(double y_axis, int t) {
//        super(y_axis);
//        Switch.setCenterY(y_axis);
//    }
//
//    void getSize() {
//
//    }
//
//    void action() {
//
//    }
//
//
//    @Override
//    void update() {
//        page.translate(Switch,(int)(Y-y)*3,1, false, 0, (int)(Y-y));
//    }
//
//    @Override
//    void setCentre(int Y) {
//        Switch.setCenterY(Y);
//    }
//
//    @Override
//    Node getNode(int y) {
//        return Switch;
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
}