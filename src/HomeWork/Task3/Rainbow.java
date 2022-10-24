package HomeWork.Task3;

public class Rainbow {
    public static final String RED = "красный";
    public static final String ORANGE = "оранжевый";
    public static final String YELLOW = "желтый";
    public static final String GREEN = "зеленый";
    public static final String SKYBLUE = "голубой";
    public static final String SEABLUE = "синий";
    public static final String VIOLET = "фиолетовый";
    public static final String SEMIRED = "красно-";
    public static final String SEMIORANGE = "оранжево-";
    public static final String SEMIYELLOW = "желто-";
    public static final String SEMIGREEN = "зелено-";
    public static final String SEMISKYBLUE = "голубо-";
    public static final String SEMISEABLUE = "сине-";
    public static final String SEMIVIOLET = "фиолетово-";

    public static String showColour(String colourCode) {
        String colourFirst = "";
        String colourSecond = "";
        String colourFinal;
        char colourPart;
        int length;

        length = colourCode.length();
        colourPart = colourCode.charAt(0);

        switch (colourPart) {
            case '1':
                if (length == 1) {colourFirst = RED;}
                if (length == 2) {colourFirst = SEMIRED;}
                break;
            case '2':
                if (length == 1) {colourFirst = ORANGE;}
                if (length == 2) {colourFirst = SEMIORANGE;}
                break;
            case '3':
                if (length == 1) {colourFirst = YELLOW;}
                if (length == 2) {colourFirst = SEMIYELLOW;}
                break;
            case '4':
                if (length == 1) {colourFirst = GREEN;}
                if (length == 2) {colourFirst = SEMIGREEN;}
                break;
            case '5':
                if (length == 1) {colourFirst = SKYBLUE;}
                if (length == 2) {colourFirst = SEMISKYBLUE;}
                break;
            case '6':
                if (length == 1) {colourFirst = SEABLUE;}
                if (length == 2) {colourFirst = SEMISEABLUE;}
                break;
            case '7':
                if (length == 1) {colourFirst = VIOLET;}
                if (length == 2) {colourFirst = SEMIVIOLET;}
                break;
            default:
                colourFinal = "такой цвет не предусмотрен";
//                System.out.println("такой цвет не предусмотрен");
        }
        if (length == 1) {
        colourFinal = colourFirst;
        } else {
            colourPart = colourCode.charAt(1);
            switch (colourPart) {
                case '1':
                    colourSecond = RED;
                    break;
                case '2':
                    colourSecond = ORANGE;
                    break;
                case '3':
                    colourSecond = YELLOW;
                    break;
                case '4':
                    colourSecond = GREEN;
                    break;
                case '5':
                    colourSecond = SKYBLUE;
                    break;
                case '6':
                    colourSecond = SEABLUE;
                    break;
                case '7':
                    colourSecond = VIOLET;
                    break;
                default:
                    System.out.println("такой цвет не предусмотрен");
            }
            colourFinal = colourFirst + colourSecond;
        }
//        System.out.println(colourFinal);
        return colourFinal;
    }
}
