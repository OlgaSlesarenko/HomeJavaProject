package HomeWork.task8;

public interface MyList<T>{
    int size();
    boolean isEmpty();
    boolean contains(Object value);
    boolean remove(Object value);
    boolean add(T value);
    boolean add(int index, T value);
    T getArrayElement(int index);
    T removeArrayElement(int index);
    void setArrayElement(int index, T value);
    int indexOf (Object value);

}
