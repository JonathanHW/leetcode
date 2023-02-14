/**
 * 给定一个正整数，求该数的平方根，只需求最解决的正整数解。
 * （原69题目改编，原题输出不保留小数的平方根）
 * 例：输入8 输出3
 *    输入21 输出5
 */
public class Solution69 {
    public static void main(String[] args) {
        System.out.println(sqrt(21));
    }

    public static int sqrt(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Negative argument: " + x);
        }
        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = x;
        while (left < right) {
            int mid = (left + right + 1) >>> 1;
            int sq = mid * mid;
            if (sq > x) {
                //原69题目改编，原题输出不保留小数的平方根
                if (sq - x < x - (mid - 1) * (mid - 1)) {
                    return mid;
                }
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left;
    }
}
