package TemplatePattern;

/**
 * Created by xhon on 16-11-17.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Basketball();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}