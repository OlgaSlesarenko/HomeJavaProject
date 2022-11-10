package HomeWork.task7;

import java.util.Random;

public class Robot {
    private final String name;
    private final String head;
    private final String body;

    public Robot (String name, String head, String body){
        this.body = body;
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public String getHead() {
        return head;
    }

    public String getBody() {
        return body;
    }

    public static String generateName() {
        int length = 5;
        String str = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuffer randomName = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(5);
            randomName.append(str.charAt(number));
        }
        return randomName.toString();
    }
}
