import java.util.Random;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    private long getStartTime() {
        return this.startTime;
    }

    private long getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        int size = 100000;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100000);
        }

        System.out.println("Bắt đầu sắp xếp 100,000 số bằng Selection Sort...");

        StopWatch timer = new StopWatch();

        selectionSort(array);

        timer.stop();

        System.out.println("Đã sắp xếp xong!");
        System.out.println("Thời gian thực thi: " + timer.getElapsedTime() + " mili giây.");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
