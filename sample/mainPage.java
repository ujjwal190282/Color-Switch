package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class mainPage extends page{


    {
        text.setX(-300);
        text.setY(40);
        text.setFill(Color.WHITE);
        text1.setX(400);
        text1.setY(120);
        text1.setFill(Color.WHITE);
        Font font=Font.loadFont(getClass()
                .getResourceAsStream("fonts/font5.ttf"), 70);
        text.setFont(font);
        text1.setFont(font);

        translate(text,1200,1, false, 310, 40);
        translate(text1,1200,1, false, -310, 40);

    }
    {

        Button1=new Button();


        Button1.setFont(font);

        Button1.setStyle( "-fx-text-fill: black; ");

        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("1.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button1.setBackground(background);
        Button1.setPrefSize(202,54);
        Button1.setLayoutX(-560);
        Button1.setLayoutY(200);

        translate(Button1,2400,1, false, 620, 0);
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("5.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        Button1.setOnMouseEntered(e -> Button1.setBackground(background2));
        Button1 .setOnMouseExited(e -> Button1.setBackground(background));
        Button1.setOnMouseClicked(e -> {
            /*stage.setScene(d.scene2);
            stage.show();*/
            newPlayer x=new newPlayer(stage);
            stage.setScene(x.scene);
            stage.show();

        });
    }
    {  Button2=new Button();

        Button2.setPrefSize(202,54);
        Button2.setFont(font);
        Button2.setStyle("-fx-text-fill: black; ");
        Button2.setLayoutX(780);
        Button2.setLayoutY(270);

        translate(Button2,2400,1, false, -620, 0);
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("3.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);

        Button2.setBackground(background);
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("5.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        Button2.setOnMouseEntered(e -> Button2.setBackground(background2));
        Button2.setOnMouseExited(e -> Button2.setBackground(background));
        Button2.setOnMouseClicked(e -> {
            loadGame d=new loadGame(stage);
            stage.setScene(d.scene);
            stage.show();

        });


    }
    {
        Button3 = new Button();

        Button3.setPrefSize(202,54);
        Button3.setFont(font);
        Button3.setStyle("-fx-text-fill: black; ");
        Button3.setLayoutX(-560);
        Button3.setLayoutY(340);

        translate(Button3,2400,1, false, 620, 0);
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("4.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);

        Button3.setBackground(background);
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("5.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        Button3.setOnMouseEntered(e -> Button3.setBackground(background2));
        Button3.setOnMouseExited(e -> Button3.setBackground(background));

        Button3.setOnMouseClicked(e -> {
            highScorePage p=new highScorePage(stage);
            stage.setScene(p.scene);
            stage.show();

        });
    }
    {
        Button4=new Button();

        Button4.setPrefSize(202,54);
        Button4.setFont(font);
        Button4.setStyle("-fx-text-fill: black; ");
        Button4.setLayoutX(780);
        Button4.setLayoutY(410);

        translate(Button4,2400,1, false, -620, 0);
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("2.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);

        Button4.setBackground(background);
        Button4.setOnMouseClicked(e -> Platform.exit());
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("5.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        Button4.setOnMouseEntered(e -> Button4.setBackground(background2));
        Button4 .setOnMouseExited(e -> Button4.setBackground(background));
    }

    Group mainpage = new Group();
    {
        text.setText("COLOR");
        text1.setText("SWITCH");
        Button1.setText("NEW GAME");
        Button2.setText("LOAD GAME");
        Button3.setText("HIGH SCORES");
        Button4.setText("EXIT");
        mainpage.getChildren().add(text);
        mainpage.getChildren().add(text1);
        mainpage.getChildren().add(Button1);
        mainpage.getChildren().add(Button2);
        mainpage.getChildren().add(Button3);
        mainpage.getChildren().add(Button4);
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
    mainPage(Stage PrimaryStage)
    {
        super(PrimaryStage);
        scene=new Scene(mainpage, 450, 500, Color.BLACK);
        //tage.setScene(this.scene);
        //stage.show();
    }

}
