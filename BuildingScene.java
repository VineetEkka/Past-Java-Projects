import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//import javafx.event.EventHandler;


public class BuildingScene extends Application {
    Button button;
    Button button2;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gentil Mann");
        button = new Button();
        button2 = new Button("Meoe");
        button.setText("Click Here for sum");
        button.setOnAction(a-> System.out.println("Heroork"));

        BorderPane layout = new BorderPane();
        VBox newe=new VBox()
        layout.setCenter(button);
        layout.setTop(button2);


        Scene scene = new Scene(layout, 400, 350);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}



