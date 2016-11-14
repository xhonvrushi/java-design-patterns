package SingletonPattern;

/**
 * Created by xhon on 16-11-10.
 */
public class SingletonPatternDemo {

    public static void main(String []args){
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
