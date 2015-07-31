package WarmUp;

import java.util.Scanner;

/**
 * Created by zuhayrelahi1 on 6/18/15.
 */
public class LargeSum {

    /** sum all the values in the array
     *
     * @param nums - array of integers
     * @return sum of array values
     */
    public static long sumArrayValues(int[] nums){
        long sum = 0;

        for(int i = 0; i < nums.length; i++){
            System.out.println("Current Sum: " + sum);
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();

        int[] nums = new int[arraySize];

        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(sumArrayValues(nums));
    }
}
