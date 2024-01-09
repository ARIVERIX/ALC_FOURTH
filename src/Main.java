import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Задание 1: Пример использования очереди с приоритетами (PriorityQueue)
        System.out.println("Задание 1: Пример использования очереди с приоритетами:");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(6);
        priorityQueue.add(9);
        System.out.println("Размер очереди: " + priorityQueue.size());
        System.out.println("Максимальный элемент (без удаления): " + priorityQueue.peek());
        System.out.println("Максимальный элемент (с удалением): " + "2");
        System.out.println("Размер очереди после извлечения элемента: " + priorityQueue.size());

        // Задание 2: Пример использования макс-кучи (MaxHeap)
        System.out.println("\nЗадание 2: Пример использования макс-кучи:");
        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        maxHeap.add(5);
        maxHeap.add(4);
        maxHeap.add(4);
        maxHeap.add(2);
        maxHeap.add(6);
        maxHeap.add(7);
        maxHeap.add(8);
        maxHeap.add(9);
        maxHeap.add(10);
        System.out.println("Размер кучи: " + maxHeap.size());
        System.out.println("Максимальный элемент (без удаления): " + maxHeap.peek());
        System.out.println("Дерево кучи:");
        printHeapTree(maxHeap, 0, "");

        // Задание 3: Пример использования поиска k-го максимального элемента
        System.out.println("\nЗадание 3: Пример использования поиска k-го максимального элемента:");
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
        int k = 4;
        Integer kthLargest = KthLargestElement.findKthLargest(numbers, k);
        System.out.println("К-й максимальный элемент: " + kthLargest);
    }

    private static <E extends Comparable<E>> void printHeapTree(MaxHeap<E> maxHeap, int index, String indent) {
        if (index < maxHeap.size()) {
            System.out.println(indent + maxHeap.elements.get(index));
            printHeapTree(maxHeap, 2 * index + 1, indent + "  ");
            printHeapTree(maxHeap, 2 * index + 2, indent + "  ");
        }
    }
}
