/**
 * Calculate the Greatest Common Divisor (GCD) using the 
 * Iterative Euclidean algorithm. 
 */
public class GCD {
    public static void main(String[] args)
    {
        int gcd = CalculateGCD(128, 48);
        System.out.println(gcd);

        int gcd2 = CalculateGCD(1024, 320);
        System.out.println(gcd2);

        int gcd3 = CalculateGCD(784, 4662);
        System.out.println(gcd3);
    }

    public static int CalculateGCD(int n1, int n2)
    {
        int temp = 0;

        while(n2 > 0)
        {
            temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}