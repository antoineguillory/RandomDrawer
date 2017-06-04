package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;

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

        int FigureToDraw = random.nextInt(4);

        int angle = random.nextInt(360);

        int pointDeDepartX = random.nextInt(300);
        int pointDeDepartY = random.nextInt(300);
        int pointDArriveeX = random.nextInt(300);
        int pointDArriveeY = random.nextInt(300);

        int middlePointX = random.nextInt(300);
        int middlePointY = random.nextInt(300);

        int RColor = random.nextInt(255);
        int GColor = random.nextInt(255);
        int BColor = random.nextInt(255);

        javafx.scene.paint.Color RandomColor = javafx.scene.paint.Color.rgb(RColor,GColor,BColor);

        GraphicsContext ctx = canvas.getGraphicsContext2D();

        ctx.setStroke(RandomColor);

        switch (FigureToDraw) {
            case 1:
                ctx.strokeLine(pointDeDepartX, pointDeDepartY, pointDArriveeX, pointDArriveeY);
                break;
            case 2:
                ctx.strokeArc(pointDeDepartX, pointDeDepartY, middlePointX, middlePointY, pointDArriveeX, pointDArriveeY, ArcType.ROUND);
                break;
            case 3:
                ctx.strokeArc(pointDeDepartX, pointDeDepartY, middlePointX, middlePointY, pointDArriveeX, pointDArriveeY, ArcType.OPEN);
                break;
        }

        if(times!=0)
        {
            DrawRandom(--times);
        }
        return canvas;
    }
}

