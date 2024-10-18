import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Label component
        Label label = new Label("Hello, JavaFX!");

        // Create a layout and add the label to the layout
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Create a scene specifying the root and the dimensions
        Scene scene = new Scene(root, 300, 250);

        // Set the title of the stage (window)
        primaryStage.setTitle("JavaFX Welcome");

        // Add the scene to the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}
