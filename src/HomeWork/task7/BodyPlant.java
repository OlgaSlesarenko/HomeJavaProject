package HomeWork.task7;

public enum BodyPlant {
    SMALL_BODY ("Маленькое тело"),
    SEMI_BODY ("Тело среднего размера"),
    BIG_BODY ("Большое тело");

    public final String bodyName;

    BodyPlant(String bodyName) {
        this.bodyName = bodyName;
    }
}