package TemplatePattern;

/**
 * Created by xhon on 16-11-17.
 */
public class Basketball extends Game{
    void endPlay() {
        System.out.println("Basketball Game Finished!");
    }


    void initialize() {
        System.out.println("Basketball Game Initialized!");
    }


    void startPlay() {
        System.out.println("Basketball Game Started.");
    }
}
