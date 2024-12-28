public class InsertionSort{

    public void sort(int[]numbers){

        int n = numbers.length;
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int key = numbers[i];
            int j = i -1;
            //Move elements that are greater than the key 
            //one position ahead
            while (j>=0 && numbers[j]>key){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = key;
        }
        long end = System.currentTimeMillis();
        System.out.println("Execution time for Insertion Sort: " + (end-start) + " ms.");
    }

}
