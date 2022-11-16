package HomeWork.task8;

public class MyArrayList<T> implements MyList<T>{
    private T [] array;

    /**
     * Методы:
     */

    public int size() {
        return array.length;
    }

    public boolean isEmpty(){
        if (array.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(Object value){
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                result = true;
            }
        }
        return result;
    }

    public boolean add(T value){
        array[array.length] = value;
        boolean result = false;
        if (array[array.length - 1] == value) {
            result = true;
        }
        return result;
    }


    public boolean add(int index, T value){
        array[index] = value;
        boolean result = false;
        if (array[index] == value){
            result = true;
        }
        return result;
    }

    public boolean remove(Object value){
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                value = null;
                result = true;
            }
        }
        return result;
    }

    public T getArrayElement(int index) {
        return array[index];
    }

    public T removeArrayElement(int index) {
        T result = array[index];
        array[index] = null;
        return result;
    }

    public void setArrayElement(int index, T value) {
        this.array[index] = value;
    }

    public int indexOf (Object value){
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                result = i;
                break;
            }
        }
        return result;
    }

    /**
     * КОНСТРУКТОРЫ:
     */

//    public MyArrayList(){
//        this.array = new T[];
//    }

//    public MyArrayList(int capacity){
//        this.array = new T[capacity];
//    }








    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
