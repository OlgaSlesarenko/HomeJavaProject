package HomeWork.Task4;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Cat {

// Variables for While-cycle with 10 cats

    public String name = "Senya";
    public int age = 7;

//конструкторs

    public Cat() {
    }

    public Cat(String initialName, int initialAge) {
        this.name = initialName;
        this.age = initialAge;
    }

// getters and setters fo For-cycle with 10 cats

    public int getAge() {
        return this.age;
    }

    public void setAge(int inputAge) {
        this.age = inputAge;
    }

    public String getNameFor() {
        return this.name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

//random name generating

    public static String generateName() {

//        byte[] array = new byte[7]; // length is bounded by 7
//        new Random().nextBytes(array);

// 1st variant - проблемы с кодировкой

//        String randomName = new String(array, Charset.forName("UTF-8"));

// 2nd variant - проблемы с кодировкой

//        String randomName = new String(array, StandardCharsets.UTF_8);

// 3rd variant - works

//        int leftLimit = 97; // letter 'a'
//        int rightLimit = 122; // letter 'z'
//        int targetStringLength = 5;
//        Random random = new Random();
//        String randomName = random.ints(leftLimit, rightLimit + 1)
//                .limit(targetStringLength)
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString();
//        return randomName;

// 4th variant - works

        int length = 7;
        String str = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuffer randomName = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(7);
            randomName.append(str.charAt(number));
        }
        return randomName.toString();
    }

//random age generating

    public static int generateAge() {
        int min = 1;
        int max = 28;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        int randomAge = i + 1;
        return randomAge;
    }
}





