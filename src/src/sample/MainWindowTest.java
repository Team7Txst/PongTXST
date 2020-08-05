package sample;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainWindowTest {
    @Test
    public void startTest(){
        MainWindow mainWindow= new MainWindow();
        double expected= 300;
        double actual= mainWindow.getPlayerOneYPos();
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void runTest(){
        MainWindow mainWindow= new MainWindow();
        boolean expected= false;
        boolean actual= mainWindow.getGameStarted();
        Assert.assertEquals(expected, actual);
    }
}