package team7;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import org.junit.Assert;
import org.junit.Test;

public class MainWindowTest {

    int width = 800;
    int height = 600;

    @Test
    public void startTestPlayerOneYPos(){
        MainWindow mainWindow = new MainWindow();
        double expected= 300;
        double actual= mainWindow.getPlayerOneYPos();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void startTestGameStarted(){
        MainWindow mainWindow= new MainWindow();
        boolean expected= false;
        boolean actual= mainWindow.getGameStarted();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void runTestPlayerOneYPos(){
        MainWindow mainWindow = new MainWindow();
        Canvas canvas = new Canvas(width, height);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double expected= 300;
        mainWindow.run(gc);
        double actual= mainWindow.getPlayerOneYPos();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void runTestGameStarted(){
        MainWindow mainWindow= new MainWindow();
        Canvas canvas = new Canvas(width, height);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        boolean expected= false;
        mainWindow.run(gc);
        boolean actual= mainWindow.getGameStarted();
        Assert.assertEquals(expected, actual);
    }
}