package leetcode.easy.math;

/*
* https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
* 1281. Subtract the Product and Sum of Digits of an Integer
* */
public class SubtractProductAndSumOfDigits1281 {
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int dig = n %10;
            sum+=dig;
            product*=dig;
            n = n/10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(121));
    }
}
