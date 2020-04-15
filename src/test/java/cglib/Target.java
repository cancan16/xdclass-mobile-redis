package cglib;

public class Target {

    public String execute() {
        String message = "-----------业务逻辑test------------";
        System.out.println(message);
        return message;
    }
}