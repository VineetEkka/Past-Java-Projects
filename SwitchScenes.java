import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SwitchScenes extends Application {
    Stage window;
    Scene scene1;
    Scene scene2;
    public static void main(String[] args) {
        launch(args);

    }
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;

        Label label1=new Label("Welcome to the Matrix");
        Button button1=new Button("This is button 1");
        button1.setOnAction(e-> window.setScene(scene2));


        VBox layout1=new VBox(20);

        layout1.getChildren().addAll(label1,button1);
        scene1=new Scene(layout1,200,400);

        //button2

        Button button2=new Button("Button 2");
        button2.setOnAction(e-> window.setScene(scene1));

        //layout2

        StackPane layout2=new StackPane();
        layout2.getChildren().add(button2);

        scene2=new Scene(layout2,300,100);

        window.setScene(scene1);
        window.setTitle("Title Of Screen");
        window.show();




    }

}
