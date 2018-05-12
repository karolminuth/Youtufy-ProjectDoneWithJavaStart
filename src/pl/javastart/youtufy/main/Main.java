package pl.javastart.youtufy.main;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Main extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource(
                "/pl/javastart/youtufy/view/MainPane.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Youtufy");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}