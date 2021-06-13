package sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class saveInfo implements Serializable {
    double bally;
    int time;
    ArrayList<Integer> objectno= new ArrayList<Integer>();
    ArrayList<Boolean> star= new ArrayList<Boolean>();
    ArrayList<Boolean> colorSwitch= new ArrayList<Boolean>();
    ArrayList<Double> Y= new ArrayList<Double>();
    ArrayList<Double> rotateAngle= new ArrayList<Double>();
    ArrayList<Double> rotateAngle2= new ArrayList<Double>();


    transient List<gameObjects> l2;

    public saveInfo(double bally,int time, List<gameObjects> l2)
    {
     this.bally=bally;
     this.time=time;
        this.l2=l2;
        for(int i=0;i<l2.size();i++)
        {
            if(l2.get(i) instanceof circle)
            {
               objectno.add(1);
               star.add(l2.get(i).starCollected);
               colorSwitch.add(l2.get(i).switchCollected);
               Y.add(l2.get(i).Y);
               rotateAngle.add(l2.get(i).getAngle(1));
            }
           else if(l2.get(i) instanceof square)
            {
                objectno.add(2);
                //square=true;
                star.add(l2.get(i).starCollected);
                colorSwitch.add(l2.get(i).switchCollected);
                Y.add(l2.get(i).Y);
                rotateAngle.add(l2.get(i).getAngle(1));
            }
            else if(l2.get(i) instanceof cross)
            {
                objectno.add(3);
                //cross=true;
                star.add(l2.get(i).starCollected);
                colorSwitch.add(l2.get(i).switchCollected);
                Y.add(l2.get(i).Y);
                rotateAngle.add(l2.get(i).getAngle(1));
            }
            else if(l2.get(i) instanceof double_circle)
            {
                objectno.add(4);
               // double_circle=true;
                star.add(l2.get(i).starCollected);
                colorSwitch.add(l2.get(i).switchCollected);
                Y.add(l2.get(i).Y);
                rotateAngle.add(l2.get(i).getAngle(1));
                rotateAngle2.add(l2.get(i).getAngle(2));

            }
            else if(l2.get(i) instanceof double_cross)
            {
                objectno.add(5);
                //double_cross=true;
                star.add(l2.get(i).starCollected);
                colorSwitch.add(l2.get(i).switchCollected);
                Y.add(l2.get(i).Y);
                rotateAngle.add(l2.get(i).getAngle(1));
                rotateAngle2.add(l2.get(i).getAngle(2));
            }

        }
    }



}
