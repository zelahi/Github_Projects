/**
 * Created by elahiz on 4/6/2015.
 */
public class Duplicates {

    public static boolean hasDubplicateChars(char[] myString){
        for(int i = 0; i < myString.length - 1; i ++){
            for(int j = i + 1; j < myString.length; j++){
                if(myString[i] == myString[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        char[] hello = {'h','e','l','l','o'};
        char[] bye = {'b','y','e'};

        System.out.println("Hello has Duplicate characters: " + hasDubplicateChars(hello));
        System.out.println("Bye has Duplicate characters: " + hasDubplicateChars(bye));
    }
}
