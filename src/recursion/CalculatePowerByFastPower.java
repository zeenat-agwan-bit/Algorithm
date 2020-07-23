package recursion;

public class CalculatePowerByFastPower {

    static int stepCount = 0;

    static int fastpow(int a, int b) {
        stepCount++;
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return fastpow(a * a, b / 2);
        }
        return a * fastpow(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(fastpow(3, 10000));
        System.out.println("steps " + stepCount); //here only 19 steps which is quite optimized
    }
}//close to log10 to the pow 4
