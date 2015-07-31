/**
 * Created by elahiz on 4/8/2015.
 */
public class Test {
    public int recTest(int a, int b) {
        if (b==1)
            return a;
        return a + recTest(a,b-1);
    }

    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test.recTest(2,3));
    }
}
