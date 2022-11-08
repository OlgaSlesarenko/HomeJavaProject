package HomeWork.task6;

public class Ship {

    protected static final int HIGH_DENSITY = 2000;
    protected static final int LOW_DENSITY = 1000;

    private Container[] containers = new Container[8];
    int freeSpace;
    String name;
    int shipSize;
    private int shipWeight = 0;

    public Ship(String name, int shipSize) {
        this.name = name;
        this.shipSize = shipSize;
        if (shipSize == 1) {
            freeSpace = 4;
        } else {
            freeSpace = 8;
        }
    }

    public String loadShip(int contSize, String form) {
        Container container;
        String result = "";
        if (freeSpace - contSize >= 0) {
            switch (form) {
                case "Cylinder":
                    container = new CylinderContainer(contSize, HIGH_DENSITY);
                    for (int i = 0; i < containers.length; i++) {
                        if (containers[i] == null) {
                            containers[i] = container;
                            freeSpace = freeSpace - contSize;
                            shipWeight = shipWeight + container.getWeight();
                            result = "Загружено";
                            break;
                        }
                    }
                    break;
                case "Cone":
                    container = new ConeContainer(contSize, LOW_DENSITY);
                    for (int i = 0; i < containers.length; i++) {
                        if (containers[i] == null) {
                            containers[i] = container;
                            freeSpace = freeSpace - contSize;
                            shipWeight = shipWeight + container.getWeight();
                            result = "Загружено";
                            break;
                        }
                        break;
                    }
                case "":
                    container = new SquareContainer(contSize, HIGH_DENSITY);
                    for (int i = 0; i < containers.length; i++) {
                        if (containers[i] == null) {
                            containers[i] = container;
                            freeSpace = freeSpace - contSize;
                            shipWeight = shipWeight + container.getWeight();
                            result = "Загружено";
                            break;
                        }
                        break;
                    }
            }
        } else {
            result = "нет места для этого контейнера";
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public int getShipWeight() {
        return shipWeight;
    }

    public Container[] getContainers() {
        return containers;
    }
}
