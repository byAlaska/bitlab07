package bitlab.askar.module2.lesson2;

public class UserShortNameException extends Exception{
    public String getMessage(){
        return "User name length is too short";
    }
}