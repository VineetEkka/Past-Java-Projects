/**
 * Created by 2019591 on 6/5/18.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DrawingWithButtons extends Application  {
    public static void main(String[] args) {
        launch(args);




    }

    public void start(Stage stage){
        Label label=new Label("Your Phone");
        //LabelInfo.setTextFill(Color.BLUE);

        ToggleGroup group = new ToggleGroup();


        RadioButton button1 = new RadioButton("Iphone X");
        button1.setToggleGroup(group);
        button1.setSelected(true);

        // Radio 3: Female.
        RadioButton button2 = new RadioButton("S9 Galaxy");
        button2.setToggleGroup(group);

        HBox root = new HBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);
        root.getChildren().addAll(label, button1, button2);

        Scene scene = new Scene(root, 400, 150);
        stage.setScene(scene);
        stage.setTitle("Choose Your Phone");
        scene.setRoot(root);
        stage.show();


    }










}
