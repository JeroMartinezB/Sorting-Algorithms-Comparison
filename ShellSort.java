// Shell Sort algorithm
// Version adapted from Sedgewick, R. Wayne, K.
// Algorithms
// https://www.geeksforgeeks.org/shell-sort/

public class ShellSort {
    public void sort(int[]numbers){
        int n = numbers.length;
        long start = System.currentTimeMillis();
        for (int i = n/2; i > 0; i /= 2) {
            // Do a gapped insertion sort
            for (int j = i; j < n; j++) {
                // add j to the elements that have
                // been gap sorted
                int temp = numbers[j];
                int k;
                for(k = j; k >= i && numbers[k-i]>temp; k-=i){
                    numbers[k] = numbers[k-i];
                }
                numbers[k] = temp;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Execution time for Shell Sort: " + (end-start) + " ms.");
    }
}
