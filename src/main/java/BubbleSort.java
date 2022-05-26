import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort implements Runnable {
    private List<Integer> list = new ArrayList<>();

    public BubbleSort(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    int tmp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, tmp);
                }
            }

        }
        System.out.println("Bubble:" + list + " nanoseconds= " + LocalTime.now().getNano());
    }
}
