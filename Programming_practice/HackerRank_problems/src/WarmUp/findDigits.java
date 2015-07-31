package WarmUp;

import java.util.Scanner;

/**
 * Created by zuhayrelahi1 on 4/11/15.
 */
public class findDigits {

    /* Find the number of digits in a string to divide the number
     *
     * @param num - the number we want to divide
     *
     * @return the number of digits in the string that can be used to divide the number
     */
    public static int findDigits(Integer num){
        int results = 0;
        String number = num.toString();

        for(int i = 0; i < number.length(); i++){
            int divideDigit = Integer.parseInt(Character.toString(number.charAt(i)));

            if( divideDigit != 0) {
                if (num % divideDigit == 0) {
                    results++;
                }
            }
        }
        return results;
    }

    //test function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numOfTestCases = sc.nextInt();

        for(int i = 0; i < numOfTestCases; i++){
            Integer num = sc.nextInt();
            System.out.println(findDigits(num));
        }

        sc.close();
    }
}
