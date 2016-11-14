package BuilderPattern;

/**
 * Created by xhon on 16-11-10.
 */
public abstract class ColdDrink implements Item {
    public Packing packing(){
        return new Bottle();
    }

    public abstract float price();
}
