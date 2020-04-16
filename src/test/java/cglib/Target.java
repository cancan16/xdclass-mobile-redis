package cglib;

import java.util.HashMap;

public class Target {

    public String execute() {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(1,1);

        String message = "-----------业务逻辑test------------";
        System.out.println(message);
        return message;
    }
}