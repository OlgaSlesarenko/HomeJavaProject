package HomeWork.task6;

public class ConeContainer extends Container {

    public ConeContainer(int contSize, int density) {
        super(contSize, density);
    }

    public int getWeight() {
        double volumeCone;
        if (super.contSize == 2) {
            volumeCone = 3.14 * Math.pow((Container.BIG_DIAGONAL), 2) * getContainerHeight() / 3;
        }
        else {
            volumeCone = 3.14 * Math.pow((Container.SMALL_DIAGONAL), 2) * getContainerHeight() / 3;
        }
        return (int)volumeCone * density;
    }
}
