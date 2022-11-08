package HomeWork.task6;

public class CylinderContainer extends Container {

    public CylinderContainer(int contSize, int density) {
        super(contSize, density);
        contSize = contSize;
    }

    public int getWeight() {
        double volumeCylinder;
        if (super.contSize == 2) {
            volumeCylinder = 3.14 * Math.pow((Container.BIG_DIAGONAL), 2) / 4 * super.getContainerHeight();
        }
        else {
            volumeCylinder = 3.14 * Math.pow((Container.SMALL_DIAGONAL), 2) / 4 * super.getContainerHeight();
        }
        return (int)volumeCylinder * density;
    }

}
