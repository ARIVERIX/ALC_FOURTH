import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PriorityQueue<E extends Comparable<E>> extends AbstractQueue<E> {
    private List<E> elements;

    public PriorityQueue() {
        this.elements = new ArrayList<>();
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean add(E element) {
        elements.add(element);
        return false;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E peek() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.stream().max(Comparable::compareTo).orElse(null);
    }

    @Override
    public E poll() {
        if (elements.isEmpty()) {
            return null;
        }
        E maxElement = peek();
        elements.remove(maxElement);
        return maxElement;
    }
}
