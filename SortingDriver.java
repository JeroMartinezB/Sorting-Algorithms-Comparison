import java.util.*;

public class SortingDriver {
    public static void main(String[]args){
        // Arrays of random integers
        int[]arr1 = new int[5000];
        int[]arr2 = new int[5000];
        int[]arr3 = new int[5000];
        // Fill them with numbers
        for (int i = 0; i < arr1.length; i++) {
            int random = (int)(Math.random()*(50000));
            arr1[i] = random;
            arr2[i] = random;
            arr3[i] = random;
        }

        // Create an InsertionSort object and sort
        InsertionSort insertion = new InsertionSort();
        insertion.sort(arr1);

        // Create a SelectionSort object and sort
        SelectionSort selection = new SelectionSort();
        selection.sort(arr2);

        // Create a ShellSort object and sort
        ShellSort shell = new ShellSort();
        shell.sort(arr3);
    }
}
