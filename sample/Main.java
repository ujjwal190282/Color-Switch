package sample;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {


    //StackPane layout=new StackPane();
     //Scene mainPage=new Scene(layout, 300, 250);


    @Override
    public void start(Stage stage) throws Exception{

        //display d=new display(stage);
        //stage.setTitle("Color Switch");
        mainPage x=new mainPage(stage);
        stage.setScene(x.scene);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
