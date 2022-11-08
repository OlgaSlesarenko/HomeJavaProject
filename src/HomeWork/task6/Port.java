package HomeWork.task6;

public class Port {
    Ship[] port = new Ship[10];
    private int freeSlots;
    String result = "";

    public String addShip(Ship ship) {
        if (freeSlots == 0) {
            result = "Порт занят";
        } else {

            for (int i = 0; i < port.length; i++) {
                if (port[i] == null) {
                    port[i] = ship;
                    freeSlots = freeSlots - 1;
                    result = "Корабль" + port[i].getName() + "в порту";
                    break;
                }
            }
        }
        return result;
    }

    public String removeShip(String name) {
        for (int i = 0; i < port.length; i++) {
            if (port[i].getName() == name) {
                port[i] = null;
                freeSlots = freeSlots + 1;
                result = "Корабль" + port[i].getName() + "уплыл";
                break;
            }
        }
        if (result == null) {
            result = "Корабль не найден";
        }
        return result;
    }

    public int getCommonWeight() {
        int commonWeight = 0;
        for (int i = 0; i < port.length; i++) {
            for (int j = 0; j < port[i].getContainers().length; j++) {
                commonWeight = commonWeight + port[i].getContainers()[j].getWeight();
            }
        }
        return commonWeight;
    }

    public Ship[] getShips() {
        return port;
    }
}
