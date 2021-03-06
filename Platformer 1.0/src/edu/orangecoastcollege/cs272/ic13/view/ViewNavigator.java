package edu.orangecoastcollege.cs272.ic13.view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ViewNavigator {
    public static final String SIGN_UP_SCENE = "SignUpScene.fxml";
    public static final String SIGN_IN_SCENE = "SignInScene.fxml";
    public static final String LEVEL_SELECT_SCENE = "LevelSelectScene.fxml";
    public static final String LEVEL_SCENE = "LevelScene.fxml";


    public static Stage mainStage;

    public static void setStage(Stage stage) {
        mainStage = stage;
    }

    public static Scene loadScene(String title, String sceneFXML) {

        try {
            mainStage.setTitle(title);
            Scene scene = new Scene(FXMLLoader.load(ViewNavigator.class.getResource(sceneFXML)));
            mainStage.setScene(scene);
            mainStage.show();
            return mainStage.getScene();
        } catch (IOException e) {
            System.err.println("Error loading: " + sceneFXML + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
