/**
 * Created by elahiz on 4/8/2015.
 */
public class TowerOfHanoi {

    public static  void move(int numOfDiscs, char from, char to, char inter){
        //break condition
        if(numOfDiscs == 1){
            System.out.println(" Moving Disc 1 from " + from + " to " + to);
        } else{
            move(numOfDiscs-1,from, inter, to);
            System.out.println("Moving disc " + numOfDiscs + " from " + from + " to " + to);
            move(numOfDiscs - 1, inter, to, from);

        }
    }

    public static void main(String[] args){
        char from = 'A';
        char to = 'C';
        char inter = 'B';

        move(3,from,to,inter);
    }
}
