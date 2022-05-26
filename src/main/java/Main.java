import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List <Integer> list = randList();

        Thread thread = new Thread(new BubbleSort(list));
        Thread thread1 = new Thread(new InsertionSort(list));
        Thread thread2 = new Thread(new SelectionSort(list));

        thread.start();
        thread1.start();
        thread2.start();

    }
    public static List<Integer> randList() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }
}
