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
