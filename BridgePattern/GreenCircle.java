package BridgePattern;

/**
 * Created by xhon on 16-11-16.
 */
public class GreenCircle implements DrawApi {
    public void drawCircle(int radius, int x, int y){
        System.out.println("GreenCircle: radius " +radius+ ", x" +x+ ", y" + y);
    }
}
