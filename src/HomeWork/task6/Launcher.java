package HomeWork.task6;

import java.util.Scanner;

public class Launcher {
    public static void execute() {
        Port port = new Port();
        Scanner scan = new Scanner(System.in);
        int shipCounter = 0;
        int commonWeight = 0;

        while (true) {

            System.out.println("Создаем корабль. Введите имя:");
            String shipName = scan.next();

//            scan = new Scanner(System.in);
            System.out.println("Введите размер (1 - малый, 2 - большой):");
            String shipSize = scan.next();
            int intShipSize = Integer.parseInt(shipSize);

            String result = port.addShip(new Ship(shipName, intShipSize));

            char sign = result.charAt(0);
            if (sign == 'К') {
                shipCounter++;
            }

            System.out.println(result);

//            scan = new Scanner(System.in);
            System.out.println("y - создать еще корабль, n - перейти к загрузке кораблей:");
            String firstDesidion = scan.next();
            if (firstDesidion.equals("n")) {
                break;
            }
        }
        Ship[] ships = port.getShips();

        int i = 0;

        while (i < shipCounter) {
//            scan = new Scanner(System.in);
            System.out.println("Загружаем корабль у " + (i + 1) + " причала. Введите размер контейнера (1 - малый, 2 - большой)");
            String contSize = scan.next();

            System.out.println("Введите форму контейнера (Cylinder/Cone/Square)");
            String form = scan.next();

            String result = ships[i].loadShip(Integer.parseInt(contSize), form);
            System.out.println(result);

            System.out.println("1 - добавить еще контейнер, 2 - перейти к следующему кораблю");
            String secondDesidion = scan.next();
            if (secondDesidion.equals("1")) {
                continue;
            } else if (secondDesidion.equals("2")) {
                i++;
            }
        }

        for (int j = 0; j < shipCounter; j++) {
            commonWeight = commonWeight + ships[j].getShipWeight();
        }
        System.out.println("Загрузка окончена. Общий вес составляет " + commonWeight + " единиц");

        System.out.println("Чтобы отправить корабль, введите его название, q - чобы выйти");
        String departureShipName = scan.next();

        if (!departureShipName.equals("q")) {
            String result = port.removeShip(departureShipName);
            System.out.println(result);
        } else {
            System.exit(0);
        }

    }

}
