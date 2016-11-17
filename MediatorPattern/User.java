package MediatorPattern;

/**
 * Created by xhon on 16-11-17.
 */
public class User {
    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sendMessage(String message){
        Chatroom.showMessage(this, message);
    }
}
