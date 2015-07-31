/**
 * Created by elahiz on 4/9/2015.
 */
public class QuickSort {

    //quicksort function
    public void qsort(int[] values, int start, int end){
        if(start < end) {
           int pivotIndex = partition(values, start, end);
            qsort(values, start, pivotIndex - 1);
            qsort(values, pivotIndex + 1, end);
        }
    }

    //partitions the array
    public int partition(int[] values, int start, int end){
        //initialize with the last value in the array as the pivot
        int pivot = values[end];
        int i = start;
        int temp;

        //start partitioning the array
        for(int j = start; j <= end - 1; j++ ){
            //check if numbers are less than the pivot
            if( values[j] < pivot){
                //TODO: implement swap method
                temp = values[i];
                values[i] = values[j];
                values [j] = temp;
                i++;
            }
        }

        //swap the value at the end to get a new partition
        values[end] = values[i];
        values[i] = pivot;
        return i;
    }


    //main function to test
    public static void main(String[] args){
        int[] values = {9,4,3,1,0};
        QuickSort quickSort = new QuickSort();

        System.out.println("Print values before the sort: ");
        for(int i = 0; i < values.length; i++){
            System.out.print(values[i]);
        }

        quickSort.qsort(values, 0, values.length-1);
        System.out.println(" ");



        System.out.println("Print values after the sort: ");
        for(int i = 0; i < values.length; i++){
            System.out.print(values[i]);
        }


    }


}
