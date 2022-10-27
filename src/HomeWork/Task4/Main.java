package HomeWork.Task4;

import java.util.Random;

import static HomeWork.Task4.Cat.*;

public class Main {
    public static void main(String[] args) {

        //1. While

        System.out.println("WhileCats:");
        int i = 0;
        while (i < 10) {
            Cat cat = new Cat();
            System.out.println(cat.name + " " + cat.age);
            i++;
        }

        //2. For

        System.out.println("ForCats:");
        for (int j = 0; j < 10; j++) {
            Cat cat = new Cat();
            cat.setName(cat.generateName());
            cat.setAge(cat.generateAge());
            System.out.println(cat.name + " " + cat.age);
        }

        //3. Do while

        int k = 10;
        System.out.println("DoWhileCats:");
        do {
            Cat cat = new Cat(generateName(), generateAge());
            k--;
            System.out.println(cat.name + " " + cat.age);
        } while (k > 0);


        //4. Foreach

        System.out.println("ForeachCats:");
        Cat cat = new Cat();
        Cat[] catArr = new Cat[]{cat, cat, cat, cat, cat};

//        наполнение массива через for
//        for (int f = 0; f < 5; f++) {
//            catArr[f] = cat;
//        }

        for (Cat currentCat : catArr) {
            System.out.println(currentCat.name + " " + currentCat.age);
        }
    }

}
