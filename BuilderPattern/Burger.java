package BuilderPattern;

/**
 * Created by xhon on 16-11-10.
 */
public abstract class Burger implements Item {
    public Packing packing(){
        return new Wrapper();
    }

    public abstract float price();
}
