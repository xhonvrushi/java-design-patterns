package TemplatePattern;

/**
 * Created by xhon on 16-11-17.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();


    public final void play(){


        initialize();


        startPlay();


        endPlay();
    }
}