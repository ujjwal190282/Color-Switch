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

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class loadGame extends page implements Serializable{
    {
        Button1=new Button();
        Button1.setDisable(true);
        Button1.setFont(font);
        Button1.setStyle("-fx-text-fill: black;");
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("3.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button1.setBackground(background);
        Button1.setPrefSize(202,54);
        Button1.setLayoutX(-510);
        Button1.setLayoutY(200);
        translate(Button1,2400,1, false, 620, 0);
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("5.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        FileOutputStream fos = null;
//        try {
//
//
//            File file = new File(
//            fos = new FileOutputStream(file);
//            ObjectIntputStream ios = new ObjectIntputStream(fos);
//            saveInfo save;
//            save = ios.readObject;
//            fos.close();
//            oos.close();
//
//
//            File file1 = new File("src/sample/saveGame/saveGamePlayer1.txt");
//            if (!file1.exists()) {
//                file1.createNewFile();
//            }
//            fos = new FileOutputStream(file1);
//            ObjectOutputStream kos = new ObjectOutputStream(fos);
//            kos.writeObject(this);
//            fos.close();
//            kos.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        saveInfo save;
        Player player ;
        try {

            // Reading the object from a file
            File file1=new File("src/sample/saveGame/saveGameObject01.txt");
            if(file1.exists()) {
                Button1.setDisable(false);

            }
            FileInputStream file = new FileInputStream("src/sample/saveGame/saveGameObject01.txt");
            ObjectInputStream in = new ObjectInputStream(file);


            // Method for deserialization of object

            save = (saveInfo)in.readObject();
            //object = (Emp)in.readObject();

            in.close();
            file=new FileInputStream("src/sample/saveGame/saveGamePlayer1.txt");
            in = new ObjectInputStream(file);

            player= (Player)in.readObject();

            in.close();
            file.close();
            Button1.setText(player.Name);

            List<gameObjects> gameElements=new ArrayList<>();;
            for(int i=0;i<save.Y.size();i++)
            {
                int flag=0;
                if(save.objectno.get(i)==1)
                {
                    gameElements.add(new circle(save.Y.get(i), save.time, save.rotateAngle.get(i),save.star.get(i),save.colorSwitch.get(i)));
                }
                if(save.objectno.get(i)==2)
                {
                    gameElements.add(new square(save.Y.get(i), save.time, save.rotateAngle.get(i),save.star.get(i),save.colorSwitch.get(i)));
                }
                if(save.objectno.get(i)==3)
                {
                    gameElements.add(new cross(save.Y.get(i), save.time, save.rotateAngle.get(i),save.star.get(i),save.colorSwitch.get(i)));
                }
                if(save.objectno.get(i)==4)
                {
                    gameElements.add(new double_circle(save.Y.get(i), save.time, save.rotateAngle.get(i),save.rotateAngle2.get(flag),save.star.get(i),save.colorSwitch.get(i)));
                    flag++;
                }
                if(save.objectno.get(i)==5)
                {
                    gameElements.add(new double_cross(save.Y.get(i), save.time, save.rotateAngle.get(i),save.rotateAngle2.get(flag),save.star.get(i),save.colorSwitch.get(i)));
                    flag++;
                }
            }

            Button1.setText(player.getName());
            Button1.setOnMouseClicked(e -> {
                display d=new display(stage,gameElements,player,save.bally);
                stage.setScene(d.scene2);
                stage.show();


            });
            // System.out.println("z = " + object1.z);

        }

        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" +
                    " is caught");
        }


        Button1.setOnMouseEntered(e -> Button1.setBackground(background2));
        Button1.setOnMouseExited(e -> Button1.setBackground(background));
    }
    {
        Button2=new Button();
        Button2.setPrefSize(202,54);
        Button2.setFont(font);
        Button2.setStyle("-fx-text-fill: black; ");
        Button2.setLayoutX(730);
        Button2.setLayoutY(270);
        Button2.setDisable(true);
        translate(Button2,2400,1, false, -620, 0);
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("3.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
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
        Button3.setDisable(true);
        translate(Button3,2400,1, false, 620, 0);
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("3.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button3.setBackground(background);
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("5.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        Button3.setOnMouseEntered(e -> Button3.setBackground(background2));
        Button3.setOnMouseExited(e -> Button3.setBackground(background));
    }
    {
        Button4=new Button();
        Button4.setPrefSize(202,54);
        Button4.setFont(font);
        Button4.setStyle("-fx-text-fill: black; ");
        Button4.setLayoutX(730);
        Button4.setLayoutY(410);
        Button4.setDisable(true);
        translate(Button4,2400,1, false, -620, 0);
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("3.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        Button4.setBackground(background);
        BackgroundImage backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("5.jpg").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage1);
        Button4.setOnMouseEntered(e -> Button4.setBackground(background2));
        Button4.setOnMouseExited(e -> Button4.setBackground(background));
    }
    {
        Button5 = new Button();
        Button5.setPrefSize(70,70);
        Button5.setFont(font);
        Button5.setStyle("-fx-text-fill: black; ");
        Button5.setLayoutX(-610);
        Button5.setLayoutY(430);
        Button5.setDisable(true);
        translate(Button5,2400,1, false, 620, 0);
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
        text.setX(-280);
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
    Group loadGamePage = new Group();
    {
        text.setText("SAVED");
        text1.setText("GAMES");
       // Button1.setText("");
        Button2.setText("");
        Button3.setText("");
        Button4.setText("");
        Button5.setText("");
       loadGamePage.getChildren().add(text);
       loadGamePage.getChildren().add(text1);
       loadGamePage.getChildren().add(Button1);
       loadGamePage.getChildren().add(Button2);
       loadGamePage.getChildren().add(Button3);
       loadGamePage.getChildren().add(Button4);
       loadGamePage.getChildren().add(Button5);
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

    public loadGame(Stage PrimaryStage) {
        super(PrimaryStage);
        scene=new Scene(loadGamePage, 450, 500, Color.BLACK);

    }
}
