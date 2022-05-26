import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SelectionSort implements Runnable {

    List<Integer> list = new ArrayList<>();

    public SelectionSort(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            int index = i;
            for (int j = i; j < list.size(); j++) {
                if (min > list.get(j)) {
                    min = list.get(i);
                    index = j;
                }
            }
            int tmp = list.get(i);
            list.set(i, min);
            list.set(index, tmp);
        }
        System.out.println("Selection:" + list + " nanoseconds= " + LocalTime.now().getNano());
    }
}
