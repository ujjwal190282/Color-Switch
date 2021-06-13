package sample;


import java.io.*;

public class Player implements Serializable
{
    String Name;
    int points=0;
    Player(String Name)
    {
        this.Name=Name;
    }
    void update()
    {

    }
    void pauseGame()
    {

    }
    void saveGame( display x)
    {
        FileOutputStream fos = null;
        try {


                File file = new File("src/sample/saveGame/saveGameObject01.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                saveInfo save= new saveInfo(x.ball.ball.getCenterY(), x.rotation_time,x.obstacles_only);
                oos.writeObject(save);
                fos.close();
                oos.close();
                File file1 = new File("src/sample/saveGame/saveGamePlayer1.txt");
                if (!file1.exists()) {
                    file1.createNewFile();
                }
                fos = new FileOutputStream(file1);
                ObjectOutputStream kos = new ObjectOutputStream(fos);
                kos.writeObject(this);
                fos.close();
                kos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    void restartGame()
    {

    }
    void exitGame()
    {

    }
    void gameEnds()
    {

    }
    String getName()
    {
return Name;
    }
    int getPoints()
    {
        return points;
    }
    void setPoints(int updated_points) {
        points = updated_points;
    }
}
