/**
 * Created by elahiz on 4/6/2015.
 */
public class Euclid {

    public static int findGCD(int x, int y){
        if(y == 0){
            return x;
        }
        return findGCD(y,x%y);
    }

    public static void main(String[] args){
        int x = 9;
        int y = 6;

        System.out.println(findGCD(x,y));
    }
}
