// Selection Sort Algorithm
// Version adapted from Sedgewick, R. Wayne, K.
// Algorithms
// https://www.geeksforgeeks.org/selection-sort-algorithm-2/

public class SelectionSort {
    public void sort(int[]numbers){
        int n = numbers.length;
        long start = System.currentTimeMillis();
        for (int i = 0; i < n-1; i++) {
            // We assume the current position is
            // the minimum
            int min = i;
            // Iterate to find the actual minimum
            for (int j = i+1; j < n; j++) {
                if (numbers[j] < numbers[min]){
                    // Update the minimum
                    min = j;
                }
            }
            // Move the minimum to the correct position
            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
            
        }
        long end = System.currentTimeMillis();
        System.out.println("Execution time for Selection Sort: " + (end-start) + " ms.");
    }
}
