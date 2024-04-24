public interface MyList<T> {

    int size();

    boolean contains(Object o);

    void add(T item);

    void add(T item, int index);

    void remove1(T item);

    void remove(int index);

    void clear();

    T get(int index);

    int indexOf(Object o);

    int lastIndexOf(Object o);

    void sort();

    void checkIndex(int index);

}
