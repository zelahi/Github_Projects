/**
 * Created by elahiz on 4/8/2015.
 */
public class MergeSort {

    public void mergeSort(int[] values, int start, int end){
        while(start < end) {
            int middle = (start + end) / 2;
            mergeSort(values, start, middle);
            mergeSort(values, middle + 1, end);
            //TODO: add merge function
            merge(values, start, middle, end);
        }
    }

    public void merge(int[] values, int start, int mid, int end) {
        int arraySize = mid - (start - 1);
        int arraySize2 = end - mid;

        int[] left = new int[arraySize];
        int[] right = new int[arraySize2];

         //create the first array
        for(int i = 0; i < arraySize - 1;){
            left[i] = values[start + i];
        }

        //create the second array
        for(int j = 0; j < arraySize2 - 1; j++){
            right[j] = values[mid + 1 + j];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        //merge the arrays after sorting
        for(int k = start; k < end; k++){
            //take the lowest value from the two arrays and insert it into our sorted array
            if (left[leftIndex] <= right[rightIndex]){
                values[k] = left[leftIndex];
                leftIndex++;
            }else {
                values[k] = right[rightIndex];
                rightIndex++;
            }
        }
    }


}
