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

public class endGamePage extends page{
    Player player;
    {
        text.setX(-240);
        text.setY(40);
        text.setFill(Color.WHITE);
        text1.setX(400);
        text1.setY(120);
        text1.setFill(Color.WHITE);
        Font font=Font.loadFont(getClass().getResourceAsStream("fonts/font5.ttf"), 70);
        text.setFont(font);
        text1.setFont(font);
        translate(text,1200,1, false, 310, 40);
        translate(text1,1200,1, false, -310, 40);

    }
    {
        Button1=new Button();
        Button1.setFont(font);
        Button1.setStyle("-fx-text-fill: black;");
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("1.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button1.setBackground(background);
        Button1.setPrefSize(202,54);
        Button1.setLayoutX(-510);
        Button1.setLayoutY(200);
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("5.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        Button1.setOnMouseEntered(e -> Button1.setBackground(background2));
        Button1.setOnMouseExited(e -> Button1.setBackground(background));
        translate(Button1,2400,1, false, 620, 0);
        //ball b=new ball();
        Button1.setOnMouseClicked(e -> {
            display d=new display(stage,player);
            player.points=0;
            stage.setScene(d.scene2);
            stage.show();
        });
    }
    {
        Button2=new Button();
        Button2.setPrefSize(202,54);
        Font font=Font.loadFont(getClass().getResourceAsStream("fonts/font3.ttf"), 18);
        Button2.setFont(font);
        Button2.setStyle("-fx-text-fill: black; ");
        Button2.setLayoutX(730);
        Button2.setLayoutY(270);
        translate(Button2,2400,1, false, -620, 0);
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("2.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button2.setBackground(background);
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("5.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        Button2.setOnMouseEntered(e -> Button2.setBackground(background2));
        Button2.setOnMouseExited(e -> Button2.setBackground(background));
    }
    {
        Button3 = new Button();
        Button3.setPrefSize(202,54);
        Button3.setFont(font);
        Button3.setStyle("-fx-text-fill: black; ");
        Button3.setLayoutX(-510);
        Button3.setLayoutY(340);
        translate(Button3,2400,1, false, 620, 0);
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("3.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button3.setBackground(background);
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("5.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        Button3.setOnMouseEntered(e -> Button3.setBackground(background2));
        Button3.setOnMouseExited(e -> Button3.setBackground(background));
        Button3.setOnMouseClicked(e -> {
        mainPage p=new mainPage(stage);
        stage.setScene(p.scene);
        stage.show();
    });
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
    Group endGamePage = new Group();
    {
        text.setText("GAME");
        text1.setText("OVER");
        Button1.setText("RESTART");
        Button2.setText("RESUME WITH STARS");
        Button3.setText("MAIN MENU");
        endGamePage.getChildren().add(Button1);
        endGamePage.getChildren().add(Button2);
        endGamePage.getChildren().add(text1);
        endGamePage.getChildren().add(text);
        endGamePage.getChildren().add(Button3);
    }

    public endGamePage(Stage PrimaryStage,Player player) {
        super(PrimaryStage);
        this.player=player;
        scene=new Scene(endGamePage, 450, 500, Color.BLACK);
    }
}
