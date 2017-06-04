package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group grp = new Group();
        primaryStage.setTitle("Random Drawer");
        primaryStage.setScene(new Scene(root, 300, 300));
        DrawerUtil drawUtil = new DrawerUtil();
        Random rdm = new Random();
        grp.getChildren().add(drawUtil.DrawRandom(rdm.nextInt(150)));
        primaryStage.setScene(new Scene(grp));
        primaryStage.show();
    }
}
