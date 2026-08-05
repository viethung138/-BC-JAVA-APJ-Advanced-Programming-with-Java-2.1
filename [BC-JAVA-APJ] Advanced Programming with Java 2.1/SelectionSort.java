public class SelectionSort {
    public static void main(String[] args) {
        selectionSort(list);
        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentMaxIndex = i;
            double currentMax = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
