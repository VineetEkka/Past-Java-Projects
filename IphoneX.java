import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class IphoneX extends Application {

    @Override
    public void start(Stage primaryStage) {

        Rectangle rectangle = new Rectangle();

        Rectangle reco= new Rectangle();


         Rectangle rec= new Rectangle();


        rectangle.setX(200.0f);
        rectangle.setY(75.0f);
        rectangle.setWidth(150.0f);
        rectangle.setHeight(300.0f);
        rectangle.setFill(Color.WHITESMOKE);

        rectangle.setArcWidth(30.0);
        rectangle.setArcHeight(20.0);


        reco.setX(237.0f);
        reco.setY(75.0f);
        reco.setWidth(80.0f);
        reco.setHeight(10.0f);
        reco.setFill(Color.BLACK);
        reco.setArcWidth(25.0);
        reco.setArcHeight(20.0);


         rec.setX(270.0f);
         rec.setY(150.0f);
         rec.setWidth(10.0f);
         rec.setHeight(45.0f);
         rec.setFill(Color.PALEGREEN);
         rec.setArcWidth(25.0);
         rec.setArcHeight(20.0);

        Circle circle = new Circle();
        circle.setCenterX(275.0f);
        circle.setCenterY(225.0f);
        circle.setRadius(50.0f);
        circle.setFill(Color.PALEGREEN);

        Circle circlet = new Circle();
        circlet.setCenterX(315.0f);
        circlet.setCenterY(225.0f);
        circlet.setRadius(27.0f);
        circlet.setFill(Color.WHITESMOKE);


        Group root = new Group();

        root.getChildren().add(rectangle);
        root.getChildren().add(reco);
        root.getChildren().add(circle);
        root.getChildren().add(circlet);
        root.getChildren().add(rec);






        Scene scene = new Scene(root, 600, 500, Color.GRAY);

        primaryStage.setTitle("Iphone X");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}