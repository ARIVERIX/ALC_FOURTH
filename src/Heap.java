public interface Heap<E> {
    int size();

    void add(E element);

    E peek();
}
