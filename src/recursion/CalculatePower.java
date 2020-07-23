package recursion;
//calculate power using recursion a^b. +Fast Power  //a to the power b 

public class CalculatePower {

    static int stepCount = 0;

    static int pow(int a, int b) {
        stepCount++;
        if (b == 0) {
            return 1;
        }
        return a * pow(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(pow(3, 4));
        System.out.println("steps" + stepCount);
    }
}
