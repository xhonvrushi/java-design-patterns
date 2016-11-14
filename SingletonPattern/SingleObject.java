package SingletonPattern;

/**
 * Created by xhon on 16-11-10.
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){};

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello world!");
    }
}
