package HomeWork.Lesson2;

public class FirstClass {

//global primitive

    static int intPrimGlobal = 100;
    static double doublePrimGlobal;

//string

    String stringLinkGlobal;

//global wrapper

    Integer intLinkGlobal;

    public static void main(String[] args) {

//local primitive

        int intPrimLocal = 255;
        double doublePrimLocal = 2.63;
        int aBool = 4;
        int bBool = 25;
        boolean c = aBool < bBool;

//local link

        String stringLinkLocal = "раз все переделывала, и снова ";
        Integer intLinkLocal = 9685;

//using getters and setters + print variables

        SecondClass anyClass = new SecondClass();
        anyClass.setByteVar((byte)100);
        Byte byteVar = anyClass.getByteVar();
        System.out.print(byteVar+" ");

        SecondClass someClass = new SecondClass();
        someClass.setStrVar("раз и еще ");
        String someName = someClass.getStrVar();
        System.out.print(someName);

//just print variables

        System.out.print(intPrimLocal+intPrimGlobal+" ");
        System.out.println(stringLinkLocal+intPrimGlobal+", и без Идеи все равно беда, " + c + " , а иначе задание по " + doublePrimGlobal);

//bringing to one type and print

        String Summ = String.valueOf(intPrimLocal+(int)doublePrimLocal);
        System.out.println("Сумма int intPrimLocal и приведенной к int doublePrimLocal, конвертированная в string, = " + Summ);

        byte one = 1;
        short two = 2568;
        int three = (int)one + (int)two;
        System.out.println("int = "+three);

        float four = 25.3f;
        double five = (double)four + 247.99;
        System.out.println("double = "+five);

        int six = 599;
        byte seven = (byte)six;
        System.out.println("byte = "+seven);

        int eight = 245792323;
        float nine = (float)eight;
        System.out.println("float = "+nine);

    }

}

