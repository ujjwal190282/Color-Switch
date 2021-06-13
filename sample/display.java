package sample;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static javafx.scene.shape.Shape.intersect;
public class display implements Serializable {
    Scene scene2;
    Stage stage;
    Player player;
    ball ball;
    {
        ball = new ball(450, Color.RED);
    }
    private Text Score;
    private Text pressR;
    private Text timer;
    {
        Score = new Text();
        Score.setText("0");
        Score.setX(20);
        Score.setY(40);
        Score.setFill(Color.WHITE);
        Font font = Font.loadFont(getClass().getResourceAsStream("fonts/font9.otf"), 50);
        Score.setFont(font);
    }
    private boolean restart = false;
    private boolean paused = false;
    private int flag;
    double ballY = 450;
    public int rotation_time = 4000;
    private Timeline infinite_screen;
    private Timeline resume_with_star_timer;
    private Timeline collision_detection;
    private Timeline list_update;
    private Group objects = new Group();
    {
        objects.getChildren().add(ball.ball);
        objects.getChildren().add(Score);
    }
    List<gameObjects> obstacles_only = new ArrayList<>();
    {
        obstacles_only.add(new circle(200, rotation_time));
        objects.getChildren().add(obstacles_only.get(0).obstacle);
        obstacles_only.add(new cross(-200, rotation_time));
        objects.getChildren().add(obstacles_only.get(1).obstacle);
        obstacles_only.add(new square(-600, rotation_time));
        objects.getChildren().add(obstacles_only.get(2).obstacle);
        obstacles_only.add(new double_cross(-1000, rotation_time));
        objects.getChildren().add(obstacles_only.get(3).obstacle);
    }


    public display(Stage stage, List<gameObjects> obstacles_list, Player player, double y) {//constructor called during loadgame
        flag = 1;
        play();
        infinite_screen.stop();
        this.player = player;
//        Score.setText(Integer.toString(player.points));
        Score.setText(Integer.toString(player.getPoints()));
        this.stage = stage;
        ball.ball.setCenterY(y);
        if (obstacles_list.size() != 0) {
            for (int i = 0; i < obstacles_only.size(); i++) {
                objects.getChildren().remove(2, objects.getChildren().size());
            }
            obstacles_only.removeAll(obstacles_only);
            obstacles_only.addAll(obstacles_list);
        }
        for (int i = 0; i < obstacles_list.size(); i++) {
            objects.getChildren().add(obstacles_list.get(i).obstacle);
        }
    }
    public display(Stage stage, Player player)
    {//constructor called during new Game
        this.player = player;
        Score.setText("0");
        this.stage = stage;
        flag = 0;
    }
    {
        scene2 = new Scene(objects, 450, 500, Color.BLACK);
        {
            scene2.setOnKeyPressed(f -> {
                switch (f.getCode()) {
                    case SPACE:
                        if (paused == false) {
                            if (flag == 1) {
                                infinite_screen.play();
                                collision_detection.play();
                                flag = 0;
                            }
                            ball.move();
                        }
                        break;
                    case P: {
                        if (paused == false) {
                            pause();
                            ballY = objects.getChildren().get(0).getBoundsInParent().getMaxY();
                            Paint curr=ball.ball.getFill();
                            ball = new ball(ballY, curr);
                            objects.getChildren().set(0, ball.ball);
                            objects.setEffect(new GaussianBlur());
                            pauseMenu p = new pauseMenu(stage, this);
                            Stage popupStage = new Stage(StageStyle.TRANSPARENT);
                            {
                                popupStage.initOwner(stage);
                                popupStage.initModality(Modality.APPLICATION_MODAL);
                                popupStage.setScene(p.scene);
                                popupStage.show();
                            }
                            p.Button1.setOnMouseClicked(event -> {
                                objects.setEffect(null);
                                popupStage.close();
                                play();
                            });
                            p.Button3.setOnMouseClicked(g -> {
                                objects.setEffect(null);
                                popupStage.hide();
                                player.saveGame(this);
                                mainPage q = new mainPage(stage);
                                stage.setScene(q.scene);
                                stage.show();

                            });
                        }
                        break;
                    }
                    case R:
                        if (paused == true) {
                            resume_with_star_timer.pause();
                            objects.getChildren().remove(objects.getChildren().size() - 2, objects.getChildren().size());
                            for (int i = 0; i < objects.getChildren().size(); i++) {
                                objects.getChildren().get(i).setEffect(null);
                            }
                            play();
                            break;
                        }
                }
            });
        }
    }
    { collision_detection = new Timeline(

                new KeyFrame(Duration.millis(100),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                for (int i = 0; i < obstacles_only.size(); i++) {
                                    Shape intersect = intersect(ball.ball, (Shape) obstacles_only.get(i).getNode(1));
                                    Shape intersect2 = intersect(ball.ball, (Shape) obstacles_only.get(i).getNode(2));
                                    Shape intersect3 = intersect(ball.ball, (Shape) obstacles_only.get(i).getNode(3));
                                    Shape intersect4 = intersect(ball.ball, (Shape) obstacles_only.get(i).getNode(4));
                                    if (obstacles_only.get(i).switchCollected == false) {
                                        Shape intersect6 = intersect(ball.ball, (Shape) obstacles_only.get(i).getNode(6));
                                        if (intersect6.getBoundsInLocal().getWidth() != -1) {
                                            ball.changeColor();
                                            obstacles_only.get(i).obstacle.getChildren().remove(4);
                                            obstacles_only.get(i).switchCollected = true;
                                        }
                                    }
                                    if (obstacles_only.get(i).starCollected == false) {
                                        Shape intersect5 = intersect(ball.ball, (Shape) obstacles_only.get(i).getNode(5));
                                        if (intersect5.getBoundsInLocal().getWidth() != -1) {
//                                            player.points = player.points + 1;
                                            player.setPoints(player.getPoints()+1);
                                            String x = Integer.toString(player.getPoints());
                                            Score.setText(x);
                                            obstacles_only.get(i).obstacle.getChildren().remove(4);
                                            obstacles_only.get(i).starCollected = true;
                                        }
                                    }
                                    if (intersect.getBoundsInLocal().getWidth() != -1 && ball.ball.getFill() != Color.BLUE) {
                                        stop();

                                    } else if (intersect2.getBoundsInLocal().getWidth() != -1 && ball.ball.getFill() != Color.WHITE) {
                                        stop();

                                    } else if (intersect4.getBoundsInLocal().getWidth() != -1 && ball.ball.getFill() != Color.YELLOW) {
                                        stop();

                                    } else if (intersect3.getBoundsInLocal().getWidth() != -1 && ball.ball.getFill() != Color.RED) {
                                        stop();
                                    }
                                }
                            }
                        },

                        new javafx.animation.KeyValue[]{}));
        collision_detection.setCycleCount(Timeline.INDEFINITE);
        collision_detection.play();
    }
    {
        infinite_screen = new Timeline(

                new KeyFrame(Duration.millis(25),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                if (500 - ball.ball.getBoundsInParent().getMaxY() > 200) {
                                    for (int i = 0; i < obstacles_only.size(); i++) {
                                        obstacles_only.get(i).Y = obstacles_only.get(i).Y + 2;
                                        obstacles_only.get(i).update();
                                        obstacles_only.get(i).setCentre((int) obstacles_only.get(i).Y);
                                        obstacles_only.get(i).y = obstacles_only.get(i).Y;
                                    }
                                }
                                if (ball.ball.getBoundsInParent().getMaxY() > 500) {
                                    infinite_screen.stop();
                                    stop();
                                }
                            }
                        }
                ));
        infinite_screen.setCycleCount(Timeline.INDEFINITE);
        infinite_screen.play();
    }

    {
        list_update = new Timeline(

                new KeyFrame(Duration.millis(200),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                if (obstacles_only.get(0).obstacle.getBoundsInParent().getMinY() > 500) {
                                    Random r = new Random();
                                    int result = r.nextInt(5 - 0) + 0;
                                    if (rotation_time > 1000) {
                                        rotation_time = rotation_time - 50;
                                    }
                                    if (result == 0) obstacles_only.add(new circle(obstacles_only.get(obstacles_only.size() - 1).Y - 400, rotation_time));
                                    else if (result == 1) obstacles_only.add(new square(obstacles_only.get(obstacles_only.size() - 1).Y - 400, rotation_time));
                                    else if (result == 2) obstacles_only.add(new cross(obstacles_only.get(obstacles_only.size() - 1).Y - 400, rotation_time));
                                    else if (result == 3) obstacles_only.add(new double_cross(obstacles_only.get(obstacles_only.size() - 1).Y - 400, rotation_time));
                                    else if (result == 4) obstacles_only.add(new double_circle(obstacles_only.get(obstacles_only.size() - 1).Y - 400, rotation_time));
                                    obstacles_only.remove(0);
                                    objects.getChildren().remove(2);
                                    objects.getChildren().add(obstacles_only.get(obstacles_only.size() - 1).obstacle);
                                }
                            }
                        }
                ));
        list_update.setCycleCount(Timeline.INDEFINITE);
        list_update.play();
    }
    {
        pressR = new Text();
        {
            pressR.setX(200);
            pressR.setY(220);
            pressR.setFill(Color.WHITE);
            Font font = Font.loadFont(getClass()
                    .getResourceAsStream("fonts/font5.ttf"), 70);

            pressR.setFont(font);
        }
        timer = new Text();
        {
            timer.setX(20);
            timer.setY(120);
            timer.setFill(Color.WHITE);
            Font font = Font.loadFont(getClass().getResourceAsStream("fonts/font9.otf"), 30);
            timer.setText("Press R to Resume with Stars");
            timer.setFont(font);
            timer.setFill(Color.WHITE);

        }

        resume_with_star_timer = new Timeline(
                new KeyFrame(Duration.ZERO, evt -> {
                    pressR.setText("5");
                    pressR.setFill(Color.WHITE);
                }),
                new KeyFrame(Duration.millis(1000), evt -> {
                    pressR.setText("4");
                    pressR.setFill(Color.LIGHTSALMON);
                }),
                new KeyFrame(Duration.millis(2000), evt -> {
                    pressR.setText("3");
                    pressR.setFill(Color.YELLOW);
                }),
                new KeyFrame(Duration.millis(3000), evt -> {
                    pressR.setText("2");
                    pressR.setFill(Color.LIGHTGREEN);
                }),
                new KeyFrame(Duration.millis(4000), evt -> {
                    pressR.setText("1");
                    pressR.setFill(Color.PINK);
                }),
                new KeyFrame(Duration.millis(5000), evt -> {
                    pressR.setFill(Color.RED);
                    pressR.setFill(Color.RED);
                })
        );
        resume_with_star_timer.setCycleCount(1);
    }

    private void stop() {
        pause();
        if (player.getPoints() > 0 && restart == false) {
            ballY = objects.getChildren().get(0).getBoundsInParent().getMaxY();
            Paint curr=ball.ball.getFill();
            ball = new ball(ballY - 20,curr);


            objects.getChildren().set(0, ball.ball);
            for (int i = 0; i < objects.getChildren().size(); i++) {
                objects.getChildren().get(i).setEffect(new GaussianBlur());
            }

            restart = true;
            System.out.println("hgckhjg");
            objects.getChildren().add(pressR);
            objects.getChildren().add(timer);
            resume_with_star_timer.play();
            resume_with_star_timer.setOnFinished(f -> {
                endGamePage p = new endGamePage(stage, player);
                stage.setScene(p.scene);
                stage.show();
            });
        } else {
            System.out.println("hgcg");
            endGamePage p = new endGamePage(stage, player);
            stage.setScene(p.scene);
            stage.show();
        }
    }

    private void pause() {
        paused = true;
        collision_detection.stop();
        list_update.stop();
        infinite_screen.stop();
        flag = 1;
        for (int i = 0; i < obstacles_only.size(); i++) {
            obstacles_only.get(i).stop();
        }
    }

    private void play() {
        paused = false;
        list_update.play();
        for (int i = 0; i < obstacles_only.size(); i++) {
            obstacles_only.get(i).play();
        }
    }
}
