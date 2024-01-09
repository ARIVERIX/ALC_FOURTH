import java.util.List;

public class KthLargestElement {
    public static <E extends Comparable<E>> E findKthLargest(List<E> list, int k) {
        MaxHeap<E> maxHeap = new MaxHeap<>();
        for (E element : list) {
            maxHeap.add(element);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}
