package HomeWork.task6;

import java.util.Random;

public abstract class Container {
    protected static final int BIG_DIAGONAL = 20;
    protected static final int SMALL_DIAGONAL = 10;
    protected int density;
    protected int contSize;

    public abstract int getWeight();

    public Container(int contSize, int density) {
        this.contSize = contSize;
        this.density = density;
    }

    protected int getContainerHeight() {

        int minHeight = 10;
        int maxHeight = 100;
        int diff = maxHeight - minHeight;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        int containerHeight = i + 1;
        return containerHeight;
    }
}
