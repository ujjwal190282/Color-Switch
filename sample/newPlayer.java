package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class newPlayer extends page {
    TextField new_player = new TextField();

    Text text2 =new Text();
    {

        new_player.setFont(font);
        new_player.setStyle( "-fx-text-fill: black; ");
       // BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("2.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        //Background background = new Background(backgroundImage);
        //new_player.setBackground(background);
        Font font=Font.loadFont(getClass()
                .getResourceAsStream("fonts/font2.ttf"), 35);
        text2.setText("Enter Name :");
        text2.setX(-600);
        text2.setY(240);
        text2.setFill(Color.WHITE);
        text2.setFont(font);
        new_player.setPromptText("Name");
        new_player.setPrefSize(202,54);
        new_player.setLayoutX(840);
        new_player.setLayoutY(200);


        translate(new_player,2400,1, false, -620, 0);
        translate(text2,2400,1, false, 620, 0);
    }
   {
       //ball b=new ball();
       if(new_player.getText()!=null) {


           Button2 = new Button();
           Button2.setPrefSize(500, 50);
           Font font = Font.loadFont(getClass()
                   .getResourceAsStream("fonts/font10.otf"), 120);
           Button2.setFont(font);
           Button2.setStyle("-fx-background-color: transparent;" + "-fx-text-fill: white; ");
           //Button2.setStyle();
           Button2.setLayoutX(570);
           Button2.setLayoutY(200);
           //System.out.println("ask"+new_player.getText() + "kjackjak");

           translate(Button2, 2400, 1, false, -620, 0);
           Button2.setOnMouseClicked(e -> {
               Player x = new Player(new_player.getText());
               display d = new display(stage, x);
              // System.out.println(new_player.getText() + "kjackjak");
               stage.setScene(d.scene2);
               stage.show();
           });
       }
       Button2.setOnMouseEntered(e -> Button2.setStyle( "-fx-background-color: transparent;"+"-fx-text-fill: orange; "));
       Button2.setOnMouseExited(e -> Button2.setStyle( "-fx-background-color: transparent;"+"-fx-text-fill: white; "));
       //BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("15.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        //Background background = new Background(backgroundImage);
        //Button2.setBackground(background);

    }
    /*{
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
    }*/
    {
        Button5 = new Button();
        Button5.setPrefSize(70,70);
        Button5.setFont(font);
        Button5.setStyle("-fx-text-fill: black; ");
        Button5.setLayoutX(-610);
        Button5.setLayoutY(425);
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
    Group newPlayerPage = new Group();
    {
        text.setText("NEW");
        text1.setText("PLAYER");
       // Button1.setText("");
      Button2.setText("PLAY");
      //  Button3.setText("");
       // Button4.setText("");
        newPlayerPage.getChildren().add(text);
        newPlayerPage.getChildren().add(text2);
        newPlayerPage.getChildren().add(text1);
        newPlayerPage.getChildren().add(new_player);
      newPlayerPage.getChildren().add(Button2);
      //  newPlayerPage.getChildren().add(Button3);
        //newPlayerPage.getChildren().add(Button4);
        newPlayerPage.getChildren().add(Button5);

    }
    Timeline timeline = new Timeline(
            new KeyFrame(Duration.ZERO, evt -> {
                text1.setFill(Color.WHITE);
                text.setFill(Color.WHITE);
                //text2.setFill(Color.WHITE);
                //Button2.setStyle( "-fx-background-color: transparent;"+"-fx-text-fill: white; ");
            }),
            new KeyFrame(Duration.millis(500), evt -> {
                text1.setFill(Color.LIGHTSALMON);
                text.setFill(Color.LIGHTSALMON);
               // Button2.setStyle( "-fx-background-color: transparent;"+"-fx-text-fill: yellow; ");
            }),
            new KeyFrame(Duration.millis(1000), evt -> {
                text1.setFill(Color.YELLOW);
                text.setFill(Color.YELLOW);
                //text2.setFill(Color.YELLOW);
               // Button2.setStyle( "-fx-background-color: transparent;"+"-fx-text-fill: orange; ");
            }),
            new KeyFrame(Duration.millis(1500), evt -> {
                text1.setFill(Color.LIGHTGREEN);
                text.setFill(Color.LIGHTGREEN);
                //text2.setFill(Color.LIGHTGREEN);
               // Button2.setStyle( "-fx-background-color: transparent;"+"-fx-text-fill:yellow ; ");
            }),
            new KeyFrame(Duration.millis(2000), evt -> {
                text1.setFill(Color.PINK);
                text.setFill(Color.PINK);
               // text2.setFill(Color.PINK);
                //Button2.setStyle( "-fx-background-color: transparent;"+"-fx-text-fill: white; ");
            }),
            new KeyFrame(Duration.millis(2500), evt -> {
                text1.setFill(Color.RED);
                text.setFill(Color.RED);
                //Button2.setStyle( "-fx-background-color: transparent;"+"-fx-text-fill: orange; ");
                //text2.setFill(Color.RED);
            })
    );

    {
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public newPlayer(Stage PrimaryStage) {
        super(PrimaryStage);
        scene=new Scene(newPlayerPage, 450, 500, Color.BLACK);
    }
}
