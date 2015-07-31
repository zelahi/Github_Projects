package WarmUp;

import java.util.Scanner;

/**
 * Created by zuhayrelahi1 on 6/16/15.
 */
public class PlusMinus {

    public static void countNum(int[] values){
        float negCount = 0;
        float posCount = 0;
        float zeroCount = 0;

        for(int i = 0; i < values.length; i++){
            if(values[i] < 0){
                negCount ++;
            } else if ( values[i] == 0){
                zeroCount ++;
            }else {
                posCount ++;
            }
        }

        System.out.println(posCount/values.length);
        System.out.println(negCount/values.length);
        System.out.println(zeroCount/values.length);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();

        int[] values = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            values[i] = sc.nextInt();
        }

        countNum(values);
    }
}
