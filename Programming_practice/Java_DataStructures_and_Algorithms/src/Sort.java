/**
 * Created by elahiz on 4/6/2015.
 */
public class Sort {

    public int[] BubbleSort(int[] nums){
        //TODO: Implement Bubble sort
        int tmp;
        boolean swap = true;

        while(swap){
            swap = false;
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] > nums[i+1]){
                    tmp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tmp;
                    swap = true;
                }
            }
        }
        return nums;
    }

    public int[] SelectionSort(int[] nums){
        int minIndex;

        for(int i = 0; i < nums.length - 1; i++ ){
            minIndex = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int minNum = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = minNum;
        }
        return nums;
    }

    public int[] InsertionSort(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            int current = nums[i];
            int j = i - 1;

            //start trying to find the element's place in the array
            while (j >= 0 && nums[j] > current ){
                nums[j+1] = nums[j];
                j = j - 1;
                nums[j+1] = current;
            }
        }

        return nums;
    }

    public static void main(String[] args){
       Sort sort = new Sort();
       int[] nums = {7,4,0,1,2};
       int[] sorted;

        //Print out the values before the sorting
        System.out.print("Array before it is sorted: ");
        for(int i=0; i < nums.length - 1; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println(" ");
        //Sort the array
        // sorted = sort.BubbleSort(nums);
        //sorted = sort.SelectionSort(nums);
        sorted = sort.InsertionSort(nums);
        //Print out the array after it is sorted
        for(int i=0; i < sorted.length - 1; i ++){
            System.out.print(nums[i] + " ");
        }

    }
}
