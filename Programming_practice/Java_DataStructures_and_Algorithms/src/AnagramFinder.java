import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by elahiz on 4/10/2015.
 */
public class AnagramFinder {

    public static boolean isAnagram(char[] anagram, char[] word){

        //Exit if the lengths are not equal
        if(anagram.length != word.length){
            return false;
        }

        //sort the arrays
        Arrays.sort(anagram);
        Arrays.sort(word);
        return Arrays.equals(anagram,word);
    }

    public static void main(String args[]){
        char[] anagram = {'s','i','l','e','n','t'};
        char[] word = {'l','i','s','t','e','n'};

        System.out.print(isAnagram(anagram,word));
    }
}
