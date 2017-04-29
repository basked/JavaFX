package bas.javafx.start;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by basket on 28.04.2017.
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("OK Control");
        Text text = new Text(11,10,"Text control");
        text.setFont(new Font(24));
        BorderPane pane = new BorderPane();
        pane.setCenter(button);
        pane.setTop(text);

        Scene scene =new Scene(pane,400,400);
        primaryStage.setTitle("Java FX title");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
