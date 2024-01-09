import java.util.ArrayList;
import java.util.List;

public class MaxHeap<E extends Comparable<E>> implements Heap<E> {
    List<E> elements;

    public MaxHeap() {
        this.elements = new ArrayList<>();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public void add(E element) {
        elements.add(element);
        heapifyUp();
    }

    private void heapifyUp() {
        int index = size() - 1;
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (elements.get(index).compareTo(elements.get(parentIndex)) > 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    @Override
    public E peek() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(0);
    }

    private void swap(int i, int j) {
        E temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }

    public void poll() {

    }
}
