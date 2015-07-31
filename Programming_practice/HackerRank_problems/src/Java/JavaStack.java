package Java;


import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;


/**
 * Created by zuhayrelahi1 on 6/6/15.
 */
public class JavaStack {

    public static Map<Character, Character> delims = new HashMap<Character, Character>();

    public void createMap() {
        delims.put(']','[');
        delims.put('}', '{');
        delims.put(')','(');

    }

    public boolean isBalanced(char[] values){
        Stack openers = new Stack();

        //exit if character array is empty
        if(values.length == 0) {
            return true;
        }

        for(int i = 0; i < values.length; i ++){

            //add items to the stack
            if(values[i] == '[' || values[i] == '{' || values[i] == '('){
                openers.push(values[i]);
            }

            //find closers
            if(values[i] == ']' || values[i] == '}' || values[i] == ')') {
                if(openers.peek() == delims.get(values[i])){
                    openers.pop();
                } else {
                    return false;
                }
            }
        }

        return openers.isEmpty();
    }

    public static void main(String args[]){
        JavaStack test = new JavaStack();

        test.createMap();

        Scanner sc = new Scanner(new BufferedInputStream(System.in));

        while (sc.hasNext()) {
            String inputString = sc.nextLine();
            System.out.println(test.isBalanced(inputString.toCharArray()));
        }
        sc.close();
    }
}
