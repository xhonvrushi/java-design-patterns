package TemplatePattern;

/**
 * Created by xhon on 16-11-17.
 */
public class Football extends Game {


    void endPlay() {
        System.out.println("Football Game Finished!");
    }


    void initialize() {
        System.out.println("Football Game Initialized!");
    }


    void startPlay() {
        System.out.println("Football Game Started.");
    }
}