package HomeWork.task6;

public class SquareContainer extends Container {

    public SquareContainer(int contSize, int density) {
        super(contSize, density);
        contSize = contSize;
    }

    public int getWeight() {
        double volumeSquare;
        if (contSize == 2) {
            volumeSquare = Math.pow((Container.BIG_DIAGONAL), 2) * getContainerHeight() / 2;
        }
        else {
            volumeSquare = Math.pow((Container.SMALL_DIAGONAL), 2) * getContainerHeight() / 2;
        }
        return (int) volumeSquare * density;
    }
}
