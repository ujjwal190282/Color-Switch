package sample;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

public class ball implements Serializable {
    Color colour = Color.RED;
    Circle ball = new Circle( 8.f);
    {ball.setCenterX(225);
        ball.setFill(colour);}
public void saveObject(ObjectOutputStream oos) throws IOException {
    oos.writeObject(this);
}
Group obstacle = new Group(ball);
    public ball(double Y, Paint curr) {
ball.setCenterY(Y);ball.setFill(curr);
    }

    public Color getColour() {
        return colour;
    }

    public void changeColor() {
        Color colour[] = new Color[]{Color.RED, Color.BLUE, Color.YELLOW, Color.WHITE};
        Random r = new Random();

        int result = r.nextInt(4-0) + 0;
        while(colour[result]==this.colour)
        {
            result = r.nextInt(4-0) + 0;
        }
        this.colour=colour[result];
        ball.setFill(colour[result]);
    }

    public void collide() {

    }

    public void burst() {

    }

    public void move() {

        page.translate(ball, 160, 1, false, 0, -40);
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        page.translate(ball, 2400, 1, false, 0, 600);

                    }
                }, 160
        );
    }}

