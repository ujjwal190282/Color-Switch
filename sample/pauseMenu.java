package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

public class pauseMenu extends page{
    {
        Button1=new Button();
        Button1.setFont(font);
        Button1.setStyle( "-fx-text-fill: black; ");
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("2.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button1.setBackground(background);
        Button1.setPrefSize(202,54);
        Button1.setLayoutX(10);
        Button1.setLayoutY(30);
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("5.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        Button1.setOnMouseEntered(e -> Button1.setBackground(background2));
        Button1.setOnMouseExited(e -> Button1.setBackground(background));

       // translate(Button1,2400,1, false, 620, 0);
    }
    {  Button2=new Button();
        Button2.setPrefSize(202,54);
        Button2.setFont(font);
        Button2.setStyle("-fx-text-fill: black; ");
        Button2.setLayoutX(10);
        Button2.setLayoutY(100);
       // translate(Button2,2400,1, false, -620, 0);
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
        Button3.setLayoutX(10);
        Button3.setLayoutY(170);
        //translate(Button3,2400,1, false, 620, 0);
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("2.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button3.setBackground(background);
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("5.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        Button3.setOnMouseEntered(e -> Button3.setBackground(background2));
        Button3.setOnMouseExited(e -> Button3.setBackground(background));


    }
    Group mainpage = new Group();
    {
        Button1.setText("RESUME");
        Button2.setText("RESTART");
        Button3.setText("SAVE & EXIT");

        mainpage.getChildren().add(Button1);
        mainpage.getChildren().add(Button2);
        mainpage.getChildren().add(Button3);

    }

display game_display;
    public pauseMenu(Stage PrimaryStage,display d) {
        super(PrimaryStage);
        scene=new Scene(mainpage, 250, 300, Color.BLACK);
        game_display=d;
    }
}
