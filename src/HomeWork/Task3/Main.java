package HomeWork.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите код цвета:");
        String colourCode = scan.next();

        Rainbow rainbow = new Rainbow();
//        rainbow.showColour(colourCode);

        String result = rainbow.showColour(colourCode);

        System.out.println("Ваш цвет: " + result);
    }

}
