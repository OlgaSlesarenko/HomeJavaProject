package HomeWork.task9;

import java.util.ArrayList;
import java.util.List;

public class Exception extends java.lang.Exception {

    public static void catchException() {

        try {
            generateExceptions();
        } catch (MyFirstException | MySecondException e) {
            e.printStackTrace();
        } catch (MyThirdException e) {
            e.printStackTrace();
        } finally {
            methodForFinally();
        }
    }

    private static void generateExceptions() throws MyThirdException, MySecondException, MyFirstException {
        int max = 4;
        int randomNumber = getRandomNumber(max);
        switch (randomNumber) {
            case (0):
                startMyFirstException();
                throw new MyFirstException("MyFirstException - NullPointerException");
            case (1):
                startMySecondException();
                throw new MySecondException("MySecondException - IndexOutOfBoundsExceptions");
            case (2):
                startMyThirdException();
                throw new MyThirdException("MyThirdException - ArithmeticException");
            default:
                System.out.println("Что-то пошло не так");
        }
    }

    private static int getRandomNumber(int max) {
        return (int) (Math.random() * max);
    }

    private static void startMyFirstException() {
        String a = null;
        a.length();
    }

    private static void startMySecondException() {
        List<String> list = new ArrayList(3) {{
            add("A");
            add("B");
            add("C");
        }};
        list.get(6);
    }

    private static void startMyThirdException() {
        int a = 5;
        int b = 0;
        int c = a / b;
    }

    private static void methodForFinally() {
        System.out.println("А это сообщение из блока finally");
    }
}
