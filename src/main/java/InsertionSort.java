import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class InsertionSort implements Runnable {
    private List<Integer> list = new ArrayList<>();

    public InsertionSort(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 1; i < list.size() - 1; i++) {
            int current = list.get(i);
            int j = i;
            while (j > 0 && list.get(j - 1) > current) {
                list.set(j, list.get(j - 1));
                j--;
            }
            list.set(j, current);
        }
        System.out.println("Insertion" + list + " nanoseconds= " + LocalTime.now().getNano());
    }
}
