package sample;

import javafx.scene.canvas.*;
import javafx.*;

import java.awt.*;
import java.awt.Canvas;
import java.util.Random;

/**
 * Created by antoineguillory on 03/06/2017.
 */
public class DrawerUtil {
    private javafx.scene.canvas.Canvas canvas;

    public DrawerUtil()
    {
        canvas = new javafx.scene.canvas.Canvas(300,300);
    }

    public javafx.scene.canvas.Canvas DrawRandom(int times)
    {

        Random random = new Random();
        int pointDeDepartX = random.nextInt(300);
        int pointDeDepartY = random.nextInt(300);
        int pointDArriveeX = random.nextInt(300);
        int pointDArriveeY = random.nextInt(300);

        int RColor = random.nextInt(255);
        int GColor = random.nextInt(255);
        int BColor = random.nextInt(255);

        javafx.scene.paint.Color RandomColor = javafx.scene.paint.Color.rgb(RColor,GColor,BColor);



        GraphicsContext ctx = canvas.getGraphicsContext2D();

        ctx.setStroke(RandomColor);
        ctx.strokeLine(pointDeDepartX, pointDeDepartY, pointDArriveeX, pointDArriveeY);
        if(times!=0)
        {
            DrawRandom(--times);
        }
        return canvas;
    }
}

