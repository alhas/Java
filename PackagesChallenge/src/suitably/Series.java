package suitably;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }


    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int fibonacci(int n) {

        int t1 = 0, t2 = 1, sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        return sum;
    }

}
