package HomeWork.Task5;

import java.text.DecimalFormat;
import java.util.Random;

public class Matrix {

    //1.

    String[][] firstArray = new String[10][10];

    public String getString() {

        int length = 7;
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(52);
            randomString.append(str.charAt(number));
        }
        return randomString.toString();
    }

    public String getDouble() {

        double start = 0.00001;
        double end = 9.99999;
        double random = new Random().nextDouble();
        double randomDouble = start + (random * (end - start));
        String formattedDouble = new DecimalFormat("#0.00000").format(randomDouble);
        return formattedDouble;
        //    return String.valueOf(randomDouble);
    }

    public String[][] getFirstArray() {

        String currentValue = "";
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                if ((j + 1) % 3 == 0) {
                    currentValue = this.getDouble();
                } else {
                    currentValue = this.getString();
                }
                firstArray[i][j] = currentValue;
            }
        }
        return firstArray;
    }

    public void printFirstArray() {

        System.out.println("First array:");
        for (String[] line : this.getFirstArray()) {
            for (String item : line) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    //2.
    String[] secondArray = new String[20];

    public String[] getSecondArray() {

        int j = 0;
        int k = 9;

        for (int i = 0; i < firstArray.length; i++) {
            secondArray[j] = firstArray[i][i];
            j++;
        }
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[j] = firstArray[k][i];
            j++;
            k--;
        }
        return secondArray;
    }

    public void printSecondArray() {

        System.out.println("Second array:");
        for (String item : getSecondArray()) {
            System.out.print(item + " ");
        }
        System.out.println();

    }

    public Boolean compareArrayDiagonals() {
        int j = 0;
        int k = 9;
        boolean compareResult = true;
        String[] firstDiagonal = new String[10];
        String[] secondDiagonal = new String[10];
        for (int i = 0; i < firstArray.length; i++) {
            firstDiagonal[j] = firstArray[i][i];
            j++;
        }
        j = 0;
        for (int i = 0; i < firstArray.length; i++) {
            secondDiagonal[j] = firstArray[k][i];
            j++;
            k--;

        }
        for (int i = 0; i < 10; i++) {
            if (!firstDiagonal[i].equals(secondDiagonal[i])) {
                compareResult = false;
                break;
            }
        }
        return compareResult;
    }

    public void printCompareResult() {
        System.out.print("Compare diagonal result is: ");
        System.out.println(this.compareArrayDiagonals());

    }

}
