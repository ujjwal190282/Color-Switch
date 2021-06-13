package sample;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

abstract class page {
    public static Stage stage;
    Font font=Font.loadFont(getClass()
            .getResourceAsStream("fonts/font3.ttf"), 25);
    Button Button1,Button2,Button3,Button4,Button5;
    Text text = new Text();
    Text text1 = new Text();
    public Scene scene;
    public page(Stage PrimaryStage) {
        stage = PrimaryStage;
    }
    public  void changeScene(Scene scene)
    {
        stage.setScene(scene);
        stage.show();
    }
    static void translate(Node node,int timeMilli,int cyclecount,boolean reverse,int x,int y)
    {
        TranslateTransition translate = new TranslateTransition();
        {
            translate.setDuration(Duration.millis(timeMilli));
            translate.setCycleCount(cyclecount);
            translate.setAutoReverse(reverse);
            translate.setNode(node);
        }
        translate.setByX(x);
        translate.setByY(y);
        translate.play();
    }


}

