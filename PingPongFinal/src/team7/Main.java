package team7;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    //variable
    private MainWindow mainWindow= new MainWindow();

    public void start(Stage stage) throws Exception {
        stage.setTitle("Not Pong 4 CW reasons");
        //background size
        Canvas canvas = new Canvas(mainWindow.width, mainWindow.height);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        //JavaFX Timeline = free form animation defined by KeyFrames and their duration
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(10), e -> mainWindow.run(gc)));
        //number of cycles in animation INDEFINITE = repeat indefinitely
        tl.setCycleCount(Timeline.INDEFINITE);

        //mouse control (move and click)
        canvas.setOnMouseMoved(e ->  mainWindow.setPlayerOneYPos(e.getY()));
        canvas.setOnMouseClicked(e ->  mainWindow.setGameStarted(true));
        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();
        tl.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
