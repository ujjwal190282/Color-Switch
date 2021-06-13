package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class highScorePage extends page{
    {
        Button1=new Button();
        Button1.setFont(font);
        Button1.setStyle( "-fx-text-fill: black; ");
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("2.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button1.setBackground(background);
        Button1.setPrefSize(202,54);
        Button1.setLayoutX(-510);
        Button1.setLayoutY(200);
        translate(Button1,2400,1, false, 620, 0);
    }
    {  Button2=new Button();
        Button2.setPrefSize(202,54);
        Button2.setFont(font);
        Button2.setStyle("-fx-text-fill: black; ");
        Button2.setLayoutX(730);
        Button2.setLayoutY(270);
        translate(Button2,2400,1, false, -620, 0);
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("2.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button2.setBackground(background);
    }
    {
        Button3 = new Button();
        Button3.setPrefSize(202,54);
        Button3.setFont(font);
        Button3.setStyle("-fx-text-fill: black; ");
        Button3.setLayoutX(-510);
        Button3.setLayoutY(340);
        translate(Button3,2400,1, false, 620, 0);
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("2.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button3.setBackground(background);
    }
    {
        Button4=new Button();
        Button4.setPrefSize(202,54);
        Button4.setFont(font);
        Button4.setStyle("-fx-text-fill: black; ");
        Button4.setLayoutX(730);
        Button4.setLayoutY(410);
        translate(Button4,2400,1, false, -620, 0);
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("2.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button4.setBackground(background);
    }
    {
        Button5 = new Button();
        Button5.setPrefSize(70,70);
        Button5.setFont(font);
        Button5.setStyle("-fx-text-fill: black; ");
        Button5.setLayoutX(-610);
        Button5.setLayoutY(430);
        translate(Button5,2400,1, false, 620, 0);
      /*  TranslateTransition translate3 = new TranslateTransition();
        {
            translate3.setDuration(Duration.millis(2400));
            translate3.setCycleCount(1);
            translate3.setAutoReverse(false);
            translate3.setNode(Button5);
        }
        translate3.setByX(620);
        translate3.play();*/
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("13.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button5.setBackground(background);
        Button5.setOnMouseClicked(e -> {
           mainPage p=new mainPage(stage);
            stage.setScene(p.scene);
            stage.show();
        });
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("14.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        Button5.setOnMouseEntered(e -> Button5.setBackground(background2));
        Button5.setOnMouseExited(e -> Button5.setBackground(background));
    }
    {
        text.setX(-200);
        text.setY(40);
        text.setFill(Color.WHITE);
        text1.setX(360);
        text1.setY(120);
        text1.setFill(Color.WHITE);
        Font font=Font.loadFont(getClass()
                .getResourceAsStream("fonts/font5.ttf"), 70);
        text.setFont(font);
        text1.setFont(font);

        translate(text,1200,1, false, 310, 40);
        translate(text1,1200,1, false, -310, 40);

    }
    Group highScorePage = new Group();
    {
        text.setText("HIGH");
        text1.setText("SCORES");
      Button1.setText("");
        Button2.setText("");
        Button3.setText("");
        Button4.setText("");
        Button5.setText("");
        highScorePage.getChildren().add(text);
        highScorePage.getChildren().add(text1);
        highScorePage.getChildren().add(Button1);
        highScorePage.getChildren().add(Button2);
        highScorePage.getChildren().add(Button3);
        highScorePage.getChildren().add(Button4);
        highScorePage.getChildren().add(Button5);

    }
    Timeline timeline = new Timeline(
            new KeyFrame(Duration.ZERO, evt -> {
                text1.setFill(Color.WHITE);
                text.setFill(Color.WHITE);
            }),
            new KeyFrame(Duration.millis(500), evt -> {
                text1.setFill(Color.LIGHTSALMON);
                text.setFill(Color.LIGHTSALMON);
            }),
            new KeyFrame(Duration.millis(1000), evt -> {
                text1.setFill(Color.YELLOW);
                text.setFill(Color.YELLOW);
            }),
            new KeyFrame(Duration.millis(1500), evt -> {
                text1.setFill(Color.LIGHTGREEN);
                text.setFill(Color.LIGHTGREEN);
            }),
            new KeyFrame(Duration.millis(2000), evt -> {
                text1.setFill(Color.PINK);
                text.setFill(Color.PINK);
            }),
            new KeyFrame(Duration.millis(2500), evt -> {
                text1.setFill(Color.RED);
                text.setFill(Color.RED);
            })
    );

    {
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
    public highScorePage(Stage PrimaryStage) {
        super(PrimaryStage);
        scene=new Scene(highScorePage, 450, 500, Color.BLACK);
      // stage.setScene(this.scene);
       // stage.show();

    }
}
