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









//    public int getSmallConeVolume() {
//        int baseRadiusSmallCone = 10;
//        double volumeSmallCone = 3.14*Math.sqrt(baseRadiusSmallCone)*getContainerHeight()/3;
//        return (int)volumeSmallCone;
//    }
//
//    public int getBigConeVolume() {
//        int baseRadiusBigCone = 20;
//        double volumeBigCone = 3.14*Math.sqrt(baseRadiusBigCone)*getContainerHeight()/3;
//        return (int)volumeBigCone;
//    }
//
//    public int getSmallCylinderVolume() {
//        int baseRadiusSmallCylinder = 10;
//        double volumeSmallCylinder = 3.14*Math.sqrt(baseRadiusSmallCylinder)*getContainerHeight();
//        return (int)volumeSmallCylinder;
//    }
//
//    public int getBigCylinderVolume() {
//        int baseRadiusBigCylinder = 20;
//        double volumeBigCylinder = 3.14*Math.sqrt(baseRadiusBigCylinder)*getContainerHeight();
//        return (int)volumeBigCylinder;
//    }
//
//    public int getSmallSquareVolume() {
//        int diagonalSmallSquare = 10;
//        double volumeSmallSquare = Math.sqrt(diagonalSmallSquare)/2*getContainerHeight();
//        return (int)volumeSmallSquare;
//    }
//
//    public int getBigSquareVolume() {
//        int diagonalBigSquare = 20;
//        double volumeBigSquare = Math.sqrt(diagonalBigSquare)/2*getContainerHeight();
//        return (int)volumeBigSquare;
//    }

}
